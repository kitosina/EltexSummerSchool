package ru.Eltex.kitosina;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Developer extends User{
    private ArrayList<String> langs=new ArrayList<>();
    private ObjectMapper objectMapper=new ObjectMapper();

    public Developer(){
        super();
    }

    public Developer(String name, String phone, Integer id, ArrayList<String> langs) {
        super(name, phone, id);
        this.langs = langs;
    }

    private ArrayList<String> getLangs() {
        return langs;
    }

    private void setLangs(ArrayList<String> langs) {
        this.langs = langs;
    }

    public String toString(){
        return getName()+" "+getId()+" "+getPhone()+":"+getLangs();
    }
    @Override
    public String toJSON() {
        return  null;
    }

    @Override
    public void fromJSON() throws IOException {
        String jsonStr;
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\kitos\\IdeaProjects\\JSONierarxia\\src\\main\\resources\\developer.json"));
        while((jsonStr=br.readLine())!=null){
            Developer dev = objectMapper.readValue(jsonStr, Developer.class);
            super.setId(dev.id);
            super.setName(dev.name);
            super.setPhone(dev.phone);
            this.setLangs(dev.langs);
        }
    }
}
