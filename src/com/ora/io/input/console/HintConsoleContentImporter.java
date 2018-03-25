package com.ora.io.input.console;

import com.ora.io.Content;
import com.ora.io.input.ContentImporter;

public class HintConsoleContentImporter<T> implements ContentImporter<T> {

    private ContentImporter<T> mContentImporter;

    public HintConsoleContentImporter(ContentImporter<T> contentImporter) {
        mContentImporter = contentImporter;
    }

    @Override
    public Content<T> getContent() {
        showHint();
        return mContentImporter.getContent();
    }

    private void showHint() {
        System.out.println("Type content below: ");
    }

}
