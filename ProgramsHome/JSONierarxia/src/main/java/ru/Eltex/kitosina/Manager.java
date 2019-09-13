package ru.Eltex.kitosina;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Manager extends User {

    private ArrayList<String> Product=new ArrayList<>();
    private ArrayList<Integer> Price=new ArrayList<>();

    public Manager(){
    }

    public Manager(String name, String phone, Integer id) {
        super(name, phone, id);
    }


    public ArrayList<String> getProduct() {
        return Product;
    }

    public void setProuct(ArrayList<String> prouct) {
        Product = prouct;
    }

    public ArrayList<Integer> getPrice() {
        return Price;
    }

    public void setPrice(ArrayList<Integer> price) {
        Price = price;
    }

    public String toString(){
        return super.getName()+" "+super.getPhone()+" "+super.getId()+":"+"{"+this.getProduct()+"}"+":"+"{"+this.getPrice()+"}";
    }

    public void Prices(Integer ... args){
        for(Integer ch: args){
            Price.add(ch);
        }
    }

    public void Product(String ... args){
        for(String str: args){
            Product.add(str);
        }
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
        BufferedReader br=new BufferedReader(new FileReader("src\\main\\resources\\manager.json"));
        while ((jsonStr=br.readLine())!=null){
            Manager man=objectMapper.readValue(jsonStr,Manager.class);
            super.setId(man.id);
            super.setName(man.name);
            super.setPhone(man.phone);
            this.setPrice(man.Price);
            this.setProuct(man.Product);
            strIterator--;
            if(strIterator==0) break;
        }
    }
}
