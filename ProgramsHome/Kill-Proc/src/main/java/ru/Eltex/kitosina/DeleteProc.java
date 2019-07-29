package ru.Eltex.kitosina;

import java.io.File;

public class DeleteProc {
    public void DeleteProc(String NumProc) {
            File Proc = new File("/proc" + "/" + NumProc);
            Proc.delete();
    }
}

