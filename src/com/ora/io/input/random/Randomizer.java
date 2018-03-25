package com.ora.io.input.random;

import com.ora.io.Content;

public interface Randomizer<T> {

    Content<T> random(int size);

}
