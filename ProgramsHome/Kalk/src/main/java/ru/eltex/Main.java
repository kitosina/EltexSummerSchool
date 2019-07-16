package ru.eltex;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Vvedite operation (* or / or - or +): ");
        Scanner sc = new Scanner(System.in);
        String Oper = sc.nextLine();
        System.out.print("Vvedite PERVOE znachenie: ");
        double P1 = sc.nextDouble();
        System.out.print("Vvedite VTOROE znachenie: ");
        double P2 = sc.nextDouble();
        double sum;
        switch(Oper){
            case "+":
                sum = P1 + P2;
                break;
            case "-":
                sum = P1 - P2;
                break;
            case "*":
                sum = P1 * P2;
                break;
            case "/":
                sum = P1 / P2;
                break;
            default:
                System.out.println("Error");
        }
        System.out.print("Otvet="+ sum);
    }
}

