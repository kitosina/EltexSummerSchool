package ru.Eltex.kitosina;

import java.io.*;

public class SpisockProc {
    private File Proc = new File("/proc");
    private String[] Spisok = Proc.list();

    public void getProc() {
        for (String oneProc : Spisok) {
            try {
                Integer a = Integer.valueOf(oneProc);
                File Proc = new File("/proc" + "/" + oneProc + "/stat");
                //BufferedReader Buff=new BufferedReader(new InputStreamReader(System.in));
                //try {
                BufferedReader Buff = new BufferedReader(new FileReader(Proc));
                String str = Buff.readLine();
                String[] IdName = str.split(" ");
                System.out.println("Id: " + IdName[0] + "----" + "Name: " + IdName[1]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException a) {
                System.err.println("Not found Proc");
            }
        }
    }
}
