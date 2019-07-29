package ru.Eltex.kitosina;

import java.io.IOException;
import java.sql.SQLException;

public interface CSV {
    void fromCSV() throws IOException;
    void toDateBase() throws SQLException;
}
