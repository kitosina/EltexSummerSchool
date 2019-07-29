package ru.Eltex.kitosina;

import java.util.Scanner;


/**
 * Program kill-Proc
 */
public class Proc {
    public static void main(String[] args) {
        SpisockProc Sp=new SpisockProc();
        Scanner sc=new Scanner(System.in);
        Sp.getProc();
        System.out.println("What Proc kill: ");
        String NumProc=sc.nextLine();
        DeleteProc DeletePr=new DeleteProc();
        DeletePr.DeleteProc(NumProc);
    }
}
