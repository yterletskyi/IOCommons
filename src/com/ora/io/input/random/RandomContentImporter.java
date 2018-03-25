package com.ora.io.input.random;

import com.ora.io.Content;
import com.ora.io.input.ContentImporter;

public class RandomContentImporter<T> implements ContentImporter<T> {

    private int mSize;
    private Randomizer<T> mRandomizer;

    public RandomContentImporter(Randomizer<T> randomizer, int size) {
        mRandomizer = randomizer;
        mSize = size;
    }

    @Override
    public Content<T> getContent() {
        return mRandomizer.random(mSize);
    }

}
