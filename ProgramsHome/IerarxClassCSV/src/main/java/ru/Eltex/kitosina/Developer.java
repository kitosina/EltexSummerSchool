package ru.Eltex.kitosina;

import java.util.ArrayList;

public class Developer extends User implements CSV {
    String[] lang;
    Developer(Byte Id,String FIO, String Email, String Phone, String[] lang) {
        super(Id,FIO, Email, Phone);
        setLang(lang);
    }
    private void setLang(String[] lang){

        this.lang=lang;
    }
    public String[] getLang(){
        return lang;
    }
    @Override
    public String toCSV() {
        return super.getId()/*.toString()*/+";"+super.getFIO()+";"+super.getPhone()+";"+super.getEmail()+";"+this.getLang();
    }
    @Override
    public void fromCSV(String str) {
        //Языки занести в коллекцию,все остальное раскидать по массивам
        ArrayList<String> Dev =new ArrayList<>();
        String[] BitStr=str.split(";");
        super.setId(Byte.valueOf(BitStr[0]));//Занесли ID
        super.setFIO(BitStr[1]);//Занесли ФИО
        super.setPhone(BitStr[2]);//Занесли Телефон
        super.setEmail(BitStr[3]);//Занесли Майл
        Dev.add(BitStr[4]);//Список языков в ArrayList
        this.setLang(new String[]{BitStr[4]});//сисок языков в setLang
    }
}
