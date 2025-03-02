package LabWork1_Kozlov;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели");
        String day = in.nextLine();
        System.out.println("Введите название месяца");
        String month = in.nextLine();
        System.out.println("Введите дату");
        String date = in.nextLine();
        System.out.println("Сегодня " + day + " " + date + " " + month);
        in.close();
    }
}

//        Напишите программу, в которой Пользователь последовательно вводит
//название текущего дня недели, название месяца и дату (номер дня в месяце).
//Программа выводит сообщение о сегодняшней дате (день недели, дата,
//                                                месяц).