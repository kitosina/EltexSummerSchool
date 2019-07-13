package ru.Eltex.kitosina;

public class Potok {
    public static void main(String[] args){
        for(Integer i=0;i<10;i++) {
            MyTheard potok_1 = new MyTheard(i);
            Thread POTOK = new Thread(potok_1);
            POTOK.start();
            try {
                POTOK.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
