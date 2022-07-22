package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main1 {
    public static void main(String[] args) {
        char c1 = '\u27FF';
        char c2 = '\u261B';
        String s = "" + c1 + c2;

        System.out.println(s);
        //сравнение
        String s1 = "first";
        String s2 = "firsa";
        int i = s1.compareTo(s2);
        System.out.println(i);

        //Конкатенация
        s1 = s1.concat(s2);
        System.out.println(s1);


        //проверка на наличие цифр и букв
        s1 = "123a";
        System.out.println(isCOnlyDigits(s1));
        //содержит ли строка заданную подстроку

    }

    //заменить символ в строке

    //s1 = "Why";


    private static boolean isCOnlyDigits(String s) {

        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) result = false;

        }
        return result;



    }
}