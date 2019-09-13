package ru.Eltex.kitosina;

import java.io.IOException;

public interface Json {
    String toJSON() throws IOException;
    void fromJSON(Integer strIterator) throws IOException;
}
