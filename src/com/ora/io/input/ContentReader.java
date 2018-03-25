package com.ora.io.input;

import com.ora.io.Content;

import java.util.List;

public interface ContentReader<T> {

    Content<T> read(List<String> rawContent);

}
