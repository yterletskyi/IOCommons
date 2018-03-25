package com.ora.io.output;

import com.ora.io.Content;

public interface ContentExporter<T> {

    void putData(Content<T> content);

}
