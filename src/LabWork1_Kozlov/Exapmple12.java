package LabWork1_Kozlov;

import java.util.Scanner;

public class Exapmple12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        String yearOfBirth = in.nextLine();
        int age = 2025 - Integer.parseInt(yearOfBirth);
        System.out.println("Искомый человек родился примерно в " + age + " году");
        in.close();
    }
}

//Напишите программу, в которой по возрасту определяется год рождения.