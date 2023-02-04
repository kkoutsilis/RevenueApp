package com.kkoutilis.revenuevaluationapp;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CsvUtils {
    private static final CsvMapper mapper = new CsvMapper();

    private CsvUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static <T> List<T> read(Class<T> clazz, InputStream stream) throws IOException {
        mapper.enable(CsvParser.Feature.TRIM_SPACES);
        CsvSchema schema = mapper.schemaFor(clazz).withHeader().withoutColumns();
        ObjectReader reader = mapper.readerFor(clazz).with(schema);
        return reader.<T>readValues(stream).readAll();
    }
}
