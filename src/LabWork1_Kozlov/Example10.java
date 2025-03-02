package LabWork1_Kozlov;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш год рождения");
        String yearOfBirth = in.nextLine();
        int age = 2025 - Integer.parseInt(yearOfBirth);
        System.out.println("Вам скорее всего " + age + " лет ");
        in.close();
        //Можно доработать до обработки по дате. Если меньше либо равно сегодня, то лет столько то
        //А иначе столько то
    }
}

//Напишите программу, в которой по году рождения определяется возраст
//пользователя.