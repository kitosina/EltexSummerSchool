package ru.Eltex.kitosina;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        List<String> langs=new ArrayList<>();
//        langs.add("Cot");
//        Developer dev=new Developer("Developer-4","8906",4);
//        dev.setLangs(langs);
//        dev.fromJSON(3);
//        System.out.println(dev.toString());
//        FileWriter fw=new FileWriter("C:\\Users\\kitos\\IdeaProjects\\JSONierarxia\\src\\main\\resources\\developer.json");
//        fw.write(dev.toJSON());
//        fw.flush();
//        fw.write("\n");
//        fw.flush();
        ArrayList<String> langs=new ArrayList<>();
        Developer dev=new Developer("ssdfsd","sdfsdf",4);
        langs.add("Java");
        langs.add("C#");
        dev.setLangs(langs);
        System.out.println(dev.toJSON());
    }
}

