package LabWork1_Kozlov;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вашe имя");
        String name = in.nextLine();
        System.out.println("Введите ваш год рождения");
        String yearOfBirth = in.nextLine();
        int age = 2025 - Integer.parseInt(yearOfBirth);
        System.out.println("Это " + name + " и ему " + age + " лет");
        in.close();
    }
}

//Напишите программу, в которой Пользователь вводит имя и год рождения,
//в программа отображает сообщение содержащее имя пользователя и его
//возраст.
