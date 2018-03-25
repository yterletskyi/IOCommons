package com.ora;

import com.ora.io.Content;
import com.ora.io.input.ContentImporter;
import com.ora.io.input.ContentReader;
import com.ora.io.input.console.ConsoleContentImporter;
import com.ora.io.input.console.HintConsoleContentImporter;
import com.ora.io.output.ContentExporter;
import com.ora.io.output.console.ConsoleContentExporter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ContentImporter<Integer> contentImporter = new HintConsoleContentImporter<>(new ConsoleContentImporter<>(new ContentReader<Integer>() {
            @Override
            public Content<Integer> read(List<String> rawContent) {
                String[] split = rawContent.get(0).split(" ");
                List<Integer> integers = new ArrayList<>();
                for (String splitted : split) {
                    int integer = Integer.valueOf(splitted);
                    integers.add(integer);
                }
                return () -> integers;
            }
        }));
        Content<Integer> content = contentImporter.getContent();

        ContentExporter<Integer> contentExporter = new ConsoleContentExporter<>();
        contentExporter.putData(content);

    }
}
