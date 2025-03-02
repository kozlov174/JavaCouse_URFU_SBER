package LabWork1_Kozlov;

import java.util.Scanner;

class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свою фамилию");
        String surname = in.nextLine();
        System.out.println("Введите своё имя");
        String name = in.nextLine();
        System.out.println("Введите своё отчёство");
        String fathersName = in.nextLine();
        System.out.println("Hello " + surname + " " + name + " " + fathersName);
        in.close();
    }
}

//1 Напишите программу, в которой Пользователь вводит сначала фамилию,
//        затем имя, затем отчество. После ввода программа выводит сообщение
//«Hello <фамилия, имя, отчество>».