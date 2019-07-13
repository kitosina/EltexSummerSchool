package ru.Eltex.kitosina;

public class MyTheard implements  Runnable {
    private Integer Num;
    MyTheard(Integer Num){
        this.Num=Num;
        Thread.currentThread().setName(Num.toString());
    }
    @Override
    public void run() {
     System.out.println("Theard: "+Thread.currentThread().getName());
    }
}
