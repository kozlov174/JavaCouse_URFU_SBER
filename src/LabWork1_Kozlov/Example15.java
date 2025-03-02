package LabWork1_Kozlov;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        String firstNumber = in.nextLine();
        int a = Integer.parseInt(firstNumber);
        System.out.println("Введите второе число");
        String secondNumber = in.nextLine();
        int b = Integer.parseInt(secondNumber);
        System.out.println("Сумма " + (a+b));
        System.out.println("Разность " + (a-b));
        in.close();
    }
}

//Напишите программу, в которой Пользователь вводит два числа, а
//программой вычисляется и отображается сумма и разность этих чисел.