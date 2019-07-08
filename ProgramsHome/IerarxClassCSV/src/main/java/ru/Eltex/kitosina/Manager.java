package ru.Eltex.kitosina;

import java.util.LinkedList;

public class Manager extends User implements CSV {
    String Sales[];
    Manager(Byte Id,String FIO, String Email, String Phone,String Sales[]) {
        super(Id,FIO, Email, Phone);
        setSales(Sales);
    }
    private void setSales(String[] Sales){
        this.Sales=Sales;
    }

    public String[] getSales(){

        return Sales;
    }

    @Override
    public String toCSV() {
        return super.getId()/*.toString()*/+";"+super.getFIO()+";"+super.getPhone()+";"+super.getEmail()+";"+this.getSales();
    }
    @Override
    public void fromCSV(String str) {
        LinkedList<String> Man=new LinkedList<>();
        String[] BitStr=str.split(";");
        super.setId(Byte.valueOf(BitStr[0]));//Занесли ID
        super.setFIO(BitStr[1]);//Занесли ФИО
        super.setPhone(BitStr[2]);//Занесли Телефон
        super.setEmail(BitStr[3]);//Занесли Майл
        Man.add(BitStr[4]);//Скидки предметы
        this.setSales(new String[]{BitStr[4]});//Предмет со скидокой в setLang
    }
}
