package ru.Eltex.kitosina;

public class Manager extends User {
    String Sales[];
    Manager(String FIO, String Email, String Phone, Byte Id,String Sales[]) {
        super(FIO, Email, Phone, Id);
        setSales(Sales);
    }
    private void setSales(String[] Sales){
        this.Sales=Sales;
    }
    public String[] getSales(){
        return Sales;
    }

    @Override
    public void toCSV() {

    }

    @Override
    public String fromCSV(String str) {
        return null;
    }
}
