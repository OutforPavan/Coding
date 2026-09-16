package parquet;

import org.apache.parquet.column.page.PageReadStore;
import org.apache.parquet.example.data.Group;
import org.apache.parquet.example.data.simple.SimpleGroup;
import org.apache.parquet.hadoop.ParquetFileReader;
import org.apache.parquet.hadoop.ParquetReader;
import org.apache.parquet.hadoop.api.ReadSupport;
import org.apache.parquet.hadoop.example.GroupReadSupport;
import org.apache.parquet.io.ColumnIOFactory;
import org.apache.parquet.io.MessageColumnIO;
import org.apache.parquet.io.ParquetDecodingException;
import org.apache.parquet.io.api.RecordMaterializer;
import org.apache.parquet.schema.MessageType;
import org.apache.parquet.schema.Type;

import java.io.IOException;
import java.util.*;

public class ParquetReaderUtil {

    public static void readParquetFile(String filePath, String columnName, Object filterValue) throws IOException {
        ParquetFileReader reader = ParquetFileReader.open(org.apache.hadoop.fs.Path.fromUriString(filePath));
        MessageType schema = reader.getFileMetaData().getSchema();

        // Check if the column exists in the schema
        if (!schema.containsField(columnName)) {
            System.out.println("Column not found in the schema: " + columnName);
            return;
        }

        // Get the column index
        int columnIndex = schema.getFieldIndex(columnName);

        // Read the Parquet file
        PageReadStore pageReadStore;
        while ((pageReadStore = reader.readNextRowGroup()) != null) {
            MessageColumnIO columnIO = new ColumnIOFactory().getColumnIO(schema);
            RecordMaterializer<Group> recordMaterializer = columnIO.getRecordMaterializer();
            Iterator<Group> records = new RecordIterator<>(pageReadStore, columnIO, recordMaterializer);

            while (records.hasNext()) {
                Group record = records.next();
                // Filter records based on the input value
                if (filterRecord(record, columnIndex, filterValue)) {
                    System.out.println(record);
                }
            }
        }
        reader.close();
    }

    private static boolean filterRecord(Group record, int columnIndex, Object filterValue) {
        // Get the value of the column
        Object value = record.getValue(columnIndex, 0);

        // Compare the value with the filter value
        if (value != null && value.equals(filterValue)) {
            return true;
        }
        return false;
    }

    private static class RecordIterator<T> implements Iterator<T> {
        private final PageReadStore pageReadStore;
        private final MessageColumnIO columnIO;
        private final RecordMaterializer<T> recordMaterializer;
        private final long pageReadCount;

        RecordIterator(PageReadStore pageReadStore, MessageColumnIO columnIO, RecordMaterializer<T> recordMaterializer) {
            this.pageReadStore = pageReadStore;
            this.columnIO = columnIO;
            this.recordMaterializer = recordMaterializer;
            this.pageReadCount = 0;
        }

        @Override
        public boolean hasNext() {
            return pageReadCount < pageReadStore.getRowCount();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T record = recordMaterializer.getCurrentRecord();
            pageReadCount++;
            return record;
        }
    }
}
