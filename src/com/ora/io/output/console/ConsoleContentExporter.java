package com.ora.io.output.console;

import com.ora.io.Content;
import com.ora.io.output.ContentExporter;

import java.util.Collection;

public class ConsoleContentExporter<T> implements ContentExporter<T> {

    @Override
    public void putData(Content<T> content) {
        Collection<T> data = content.getData();
        System.out.println(data);
    }

}
