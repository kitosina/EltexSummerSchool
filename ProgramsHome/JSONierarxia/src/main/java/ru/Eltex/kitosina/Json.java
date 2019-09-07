package ru.Eltex.kitosina;

import java.io.IOException;

public interface Json {
    String toJSON();
    void fromJSON() throws IOException;
}
