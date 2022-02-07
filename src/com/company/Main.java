package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner word = new Scanner (System.in);
        String first;
        System.out.println("Ваше имя: ");
        first = word.nextLine();
        System.out.println("Добро пожаловать, " + first);



        int second;
        System.out.println("Ваш возраст: ");
        second = word.nextInt();
        if (second <= 16) {
            System.out.println("Вы должны быть совершенно летним");
        } else {
            System.out.println("Вы успешно зашли, " + first);
        }



        String third;
        System.out.println("Введите ваш пароль: ");
        third = word.nextLine();
        System.out.println("Пароль верный!" + third);
    }
}
