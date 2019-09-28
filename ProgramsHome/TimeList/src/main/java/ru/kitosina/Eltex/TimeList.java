package ru.kitosina.Eltex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * TimeList
 * ArrayList vs LinkedList vs TreeSet
 */
public class TimeList {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("src\\main\\resources\\TimeOne.txt"));
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
        bufferedWriter.write("Time ArrayList: "+time_1+'\n');
        bufferedWriter.write("Time ArrayList: "+time_2+'\n');
        bufferedWriter.write("Time ArrayList: "+time_3+'\n');
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
