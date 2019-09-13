package ru.Eltex.kitosina;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WorkFileSystemInput {
    private BufferedWriter jsonDeveloperWriter=new BufferedWriter(new FileWriter("src\\main\\resources\\developer.json"));
    private BufferedWriter jsonManagerWriter=new BufferedWriter(new FileWriter("src\\main\\resources\\manager.json"));
    public WorkFileSystemInput() throws IOException {
    }

    public void developerJsonInput(String str) throws IOException {
        jsonDeveloperWriter.write(str);
        jsonDeveloperWriter.newLine();
        jsonDeveloperWriter.flush();
    }

    public void managerJsonInput(String str) throws IOException {
        jsonManagerWriter.write(str);
        jsonManagerWriter.newLine();
        jsonManagerWriter.flush();
    }
}
