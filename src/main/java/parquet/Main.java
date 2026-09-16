package parquet;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "path_to_your_parquet_file.parquet";
        String columnName = "your_column_name";
        Object filterValue = "your_filter_value";

        ParquetReaderUtil.readParquetFile(filePath, columnName, filterValue);
    }
}
