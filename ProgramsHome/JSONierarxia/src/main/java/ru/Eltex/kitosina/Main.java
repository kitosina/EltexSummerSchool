package ru.Eltex.kitosina;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Developer dev=new Developer();
        dev.fromJSON();
        System.out.println(dev.toString());
    }
}

