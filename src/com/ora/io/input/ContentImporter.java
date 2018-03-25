package com.ora.io.input;

import com.ora.io.Content;

public interface ContentImporter<T> {

    Content<T> getContent();

}
