package ru.kitosina.Eltex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class TimeList {
    public static void main(String[] args) {
        //-----------------------------------------
        Long Start = System.currentTimeMillis();
        ArrayList<String> A = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            if (i==100000) {A.add("Tom");} else{
                A.add(i, "Thomas");
            }
        }
        A.remove("Tom");
        Long Finish = System.currentTimeMillis();
        Long time_1 = Finish - Start;
        //-----------------------------------------
        //Start = Long.valueOf(0);
        //Finish = Long.valueOf(0);
        //-----------------------------------------
        Long Start_1 = System.currentTimeMillis();
        LinkedList<String> B = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            if (i==1000000) {B.add("Tom");} else{
                B.add(i, "Thomas");
            }
        }
        B.remove("Tom");
        Long Finish_1 = System.currentTimeMillis();
        Long time_2 = Finish_1 - Start_1;
        //-----------------------------------------
        //Start = Long.valueOf(0);
        //Finish = Long.valueOf(0);
        //-----------------------------------------
        Long Start_3 = System.currentTimeMillis();
        TreeSet<String> C = new TreeSet<>();
        for (int i = 0; i < 1000000; i++) {
            if (i==100000) {C.add("Tom");} else{
                C.add("Thomas");
            }
        }
        C.remove("Tom");
        Long Finish_3 = System.currentTimeMillis();
        Long time_3 = Finish_3 - Start_3;
        //-----------------------------------------
        System.out.println("Time ArrayList: " + time_1);
        System.out.println("Time LinkedList: " + time_2);
        System.out.println("Time TreeSet: " + time_3);
    }
}
