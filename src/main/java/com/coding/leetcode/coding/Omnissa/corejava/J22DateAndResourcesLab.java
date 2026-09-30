package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.io.Reader;
import java.io.StringReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

/**
 * J22 / P1 — Explicit time zones and resource ownership.
 * Illustrative lab. toInstant converts a local date/time using the explicit supplied zone.
 * The examples avoid DST gaps/overlaps; explain how those cases would change the contract.
 * readAllLines owns the passed Reader, reads all lines including empty lines in encounter
 * order, and closes it on success and failure using try-with-resources. Do not close a
 * caller-owned reader if a different API promises caller ownership; ownership here is explicit.
 * readAndConfirmClosed must read a supplied StringReader through readAllLines, then attempt
 * to read again and return true only when IOException confirms closure. Propagate other failures.
 * No file system or wall-clock access is required.
 */
public final class J22DateAndResourcesLab {
    public static Instant toInstant(LocalDateTime local, ZoneId zone) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static List<String> readAllLines(Reader ownedReader) throws IOException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static boolean readAndConfirmClosed(StringReader ownedReader) throws IOException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        LocalDateTime local = LocalDateTime.of(2026, 10, 6, 10, 0);
        ZoneId zone = ZoneId.of("Asia/Kolkata");
        ExampleRunner.run("J22 local time to an instant", "2026-10-06 10:00 in Asia/Kolkata",
                "2026-10-06T04:30:00Z", () -> toInstant(local, zone));
        StringReader lines = new StringReader("alpha\n\nbeta\n");
        ExampleRunner.run("J22 owned reader", "alpha, empty line, beta, trailing newline",
                "[alpha, , beta]", () -> readAllLines(lines));
        StringReader closureProbe = new StringReader("one\ntwo");
        ExampleRunner.run("J22 observable closure", "StringReader(one/newline/two)", "true",
                () -> readAndConfirmClosed(closureProbe));
    }
}
