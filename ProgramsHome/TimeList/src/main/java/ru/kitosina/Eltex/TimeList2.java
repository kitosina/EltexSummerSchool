package ru.kitosina.Eltex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

/**
 * TimeList
 * HashSet vs HashMap
 */
public class TimeList2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("src\\main\\resources\\TimeTwo.txt"));
        //---------------------------------------
        Long Start = System.currentTimeMillis();
        HashSet<String> A=new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            if (i==100000) {A.add("Tom");} else{
                A.add("Thomas");
            }
        }
        A.remove("Tom");
        Long Finish = System.currentTimeMillis();
        Long time_1 = Finish - Start;
        //--------------------------------------
        Long Start2 = System.currentTimeMillis();
        HashMap<Integer,String> B=new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            if (i==100000) {B.put(i,"Tom");} else{
                B.put(i,"Thomas");
            }
        }
        Long Finish2 = System.currentTimeMillis();
        Long time_2 = Finish2 - Start2;
        bufferedWriter.write("Time HashSet: "+time_1+'\n');
        bufferedWriter.write("Time HashMap: "+time_2+'\n');
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
