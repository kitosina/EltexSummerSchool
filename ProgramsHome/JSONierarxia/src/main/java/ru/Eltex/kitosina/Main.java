package ru.Eltex.kitosina;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        WorkFileSystemInput inputJson=new WorkFileSystemInput();
        //------------>Developer<--------------------------------------------
        Developer dev1=new Developer("D-1","89095204523",1);
        dev1.langs("C","C#");
        inputJson.developerJsonInput(dev1.toJSON());
        Developer dev2=new Developer("D-2","89069108436",2);
        dev2.langs("Pascal","Java");
        inputJson.developerJsonInput(dev2.toJSON());
        Developer dev3=new Developer();
        dev3.fromJSON(2);
        System.out.println(dev3.toString());
        //--------------->Manager<--------------------------------------------
        Manager man1=new Manager("M-1","89069107561",1);
        man1.Product("Computer","Block");
        man1.Prices(25000,7500);
        inputJson.managerJsonInput(man1.toJSON());
        Manager man2=new Manager("M-2","89109734525",2);
        man2.Product("Mouse","Monitor","Router");
        man2.Prices(738,9000,4697);
        inputJson.managerJsonInput(man2.toJSON());
        Manager man3=new Manager();
        man3.fromJSON(2);
        System.out.println(man3.toString());
    }
}
