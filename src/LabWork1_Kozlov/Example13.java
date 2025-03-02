package LabWork1_Kozlov;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        String firstNumber = in.nextLine();
        int a = Integer.parseInt(firstNumber);
        System.out.println("Введите второе число");
        String secondNumber = in.nextLine();
        int b = Integer.parseInt(secondNumber);
        int c = a + b;
        System.out.println("Искомая сумма а и b: " + c);
        in.close();
    }
}

//Напишите программу для вычисления суммы двух чисел. Оба числа
//вводятся пользователем. Для вычисления суммы используйте оператор +.