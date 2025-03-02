package LabWork1_Kozlov;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца");
        String month = in.nextLine();
        System.out.println("Введите количество дней в месяце");
        String days = in.nextLine();
        System.out.println("Месяц " + month + " содержит " + days + " дней" );
        in.close();
    }
}

//Напишите программу, в которой пользователю предлагается ввести
//название месяца и количество дней в этом месяце. Программа выводит
//сообщение о том, что соответствующий месяц содержит указанное
//количество дней.