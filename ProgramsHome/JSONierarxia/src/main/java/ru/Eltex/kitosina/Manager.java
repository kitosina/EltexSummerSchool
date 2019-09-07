package ru.Eltex.kitosina;

public class Manager extends User {

    public Manager(){
    }

    public Manager(String name, String phone, Integer id) {
        super(name, phone, id);
    }

    @Override
    public String toJSON() {
        return null;
    }

    @Override
    public void fromJSON() {

    }

}
