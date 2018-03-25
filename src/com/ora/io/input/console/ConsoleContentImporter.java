package com.ora.io.input.console;

import com.ora.io.Content;
import com.ora.io.input.ContentImporter;
import com.ora.io.input.ContentReader;

import java.util.Collections;
import java.util.Scanner;

public class ConsoleContentImporter<T> implements ContentImporter<T> {

    private ContentReader<T> mContentReader;

    public ConsoleContentImporter(ContentReader<T> ContentReader) {
        mContentReader = ContentReader;
    }

    @Override
    public Content<T> getContent() {
        String line = readLine();
        return mContentReader.read(Collections.singletonList(line));
    }

    private String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
