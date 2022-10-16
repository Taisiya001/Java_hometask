package ru.gb.jseminar;

import java.util.Scanner;

public class Homework {

    //На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
    //- команда 1 (к1): увеличить в с раза, а умножается на c
    //- команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
    //Написать программу, которая выдаёт массив команд, позволяющий число a превратить в число b или сообщить, что это невозможно
    //Пример 1: а = 1, b = 7, c = 1, d = 3
    //ответ: [к1, к1, к1, к1, к1, к1] или [к1, к2, к1, к1, к1] или [к1, к1, к2, к1].
    //Пример 2: а = 11, b = 7, c = 2, d = 1
    //ответ: [].
    public static void main(String[] args) {
        Homework homework = new Homework();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("a = ");
        int a = Integer.parseInt(iScanner.nextLine());
        System.out.printf("b = ");
        int b = Integer.parseInt(iScanner.nextLine());
        System.out.printf("c = ");
        int c = Integer.parseInt(iScanner.nextLine());
        System.out.printf("d = ");
        int d = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
    }

    public String[] doIt(int a, int b, int c, int d){
        int k1 = a*c;
        int k2 = a + 2*d;
        if (k1 + k2 == b) {
            System.out.println("k1,k2");
        }
        else{
            System.out.println("Это невозможно");
        }
        return new String[]{};
    }

}
