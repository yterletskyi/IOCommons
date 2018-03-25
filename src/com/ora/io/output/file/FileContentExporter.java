package com.ora.io.output.file;

import com.ora.io.Content;
import com.ora.io.output.ContentExporter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileContentExporter<T> implements ContentExporter<T> {

    private Path mPath;

    public FileContentExporter(String filename) {
        mPath = Paths.get(filename);
    }

    @Override
    public void putData(Content<T> content) {
        byte[] bytes = getBytes(content);
        write(bytes);
    }

    private void write(byte[] bytes) {
        try {
            Files.write(mPath, bytes, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private byte[] getBytes(Content<T> content) {
        return content.getData().toString().getBytes();
    }

}
