package ru.Eltex.kitosina;

import java.util.Scanner;

import static ru.Eltex.kitosina.Day.Monday;

public class DayWeek {
    public static void main(String[] args) {
        Day[] Name = Day.values();
        Scanner Sc=new Scanner(System.in);
        System.out.print("Day Week: ");
        String NameDay = Sc.nextLine();
        try {
            Day Names = Day.valueOf(NameDay);
            switch (Names) {
                case Monday:
                    System.out.println("5 days left until the weekend");
                    break;
                case Tuesday:
                    System.out.println("4 days left until the weekend");
                    break;
                case Wednesday:
                    System.out.println("3 days left until the weekend");
                    break;
                case Thursday:
                    System.out.println("2 days left until the weekend");
                    break;
                case Friday:
                    System.out.println("1 days left until the weekend");
                    break;
                case Saturday:
                    System.out.println("1 Weekend!!!");
                    break;
                case Sunday:
                    System.out.println("2 Weekend!!!");
                    break;
            }
            }
             catch (java.lang.IllegalArgumentException Names){
                System.out.println("Error");
            }
        }
    }
