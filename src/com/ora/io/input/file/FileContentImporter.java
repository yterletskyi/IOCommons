package com.ora.io.input.file;

import com.ora.io.Content;
import com.ora.io.input.ContentImporter;
import com.ora.io.input.ContentReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileContentImporter<T> implements ContentImporter<T> {

    private Path mPath;
    private ContentReader<T> mFileContentReader;

    public FileContentImporter(String filename, ContentReader<T> fileContentReader) {
        mPath = Paths.get(filename);
        mFileContentReader = fileContentReader;
    }

    @Override
    public Content<T> getContent() {
        List<String> rawFileContent = readLines();
        return mFileContentReader.read(rawFileContent);
    }

    private List<String> readLines() {
        try {
            return Files.readAllLines(mPath);
        } catch (IOException e) {
            throw new IllegalStateException("Can't read from file: " + e);
        }
    }

}
