package ru.Eltex.kitosina;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Developer extends User{
    private ArrayList<String> langs;

    public Developer()  {
        super();
    }

    public Developer(String name, String phone, Integer id)  {
        super(name, phone, id);
        this.langs=new ArrayList<>();
    }

    public ArrayList<String> getLangs() {
        return langs;
    }

    public void setLangs(ArrayList<String> langs) {
        this.langs = langs;
    }

    public void langs(String ... args){
        for(String str : args){
            langs.add(str);
        }
    }


    public String toString(){
        return super.getName()+" "+super.getPhone()+" "+super.getId()+":"+this.getLangs();
    }

    @Override
    public String toJSON() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        String inJsonString=objectMapper.writeValueAsString(this);
        return inJsonString;
    }

    @Override
    public void fromJSON(Integer strIterator) throws IOException {
        String jsonStr;
        ObjectMapper objectMapper=new ObjectMapper();
        BufferedReader br=new BufferedReader(new FileReader("src\\main\\resources\\developer.json"));
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
