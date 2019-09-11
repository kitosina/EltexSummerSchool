package ru.Eltex.kitosina;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Developer extends User{
    private List<String> langs;

    public Developer(){
        super();
    }

    public Developer(String name, String phone, Integer id) {
        super(name, phone, id);
    }

    private List<String> getLangs() {
        return langs;
    }

    public void setLangs(List<String> langs) {
        this.langs = langs;
    }

//    public void langs(String... args){
//        for(String str : args){
//            langs.add(str);
//        }
//    }


    public String toString(){
        return getName()+" "+getPhone()+" "+getId()+":"+getLangs();
    }

    @Override
    public String toJSON() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        String inJsonStr;
        inJsonStr=objectMapper.writeValueAsString(this);
        return inJsonStr;
    }

    @Override
    public void fromJSON(Integer strIterator) throws IOException {
        String jsonStr;
        ObjectMapper objectMapper=new ObjectMapper();
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\kitos\\IdeaProjects\\JSONierarxia\\src\\main\\resources\\developer.json"));
        while((jsonStr=br.readLine())!=null){
            Developer dev = objectMapper.readValue(jsonStr, Developer.class);
            super.setId(dev.id);
            super.setName(dev.name);
            super.setPhone(dev.phone);
            this.setLangs(dev.langs);
            strIterator--;
            if(strIterator==0) break;
        }
    }
}
