package LabWork1_Kozlov;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше число");
        String number = in.nextLine();
        int a = Integer.parseInt(number);
        int b = a - 1;
        int c = a + 1;
        int d = (a + b + c) * (a + b + c);
        String output = "Нужная последовательность " + b + " " + a + " " + c + " " + d;
        System.out.println(output);
        in.close();
    }
}
//Напишите программу, в которой пользователь вводит число, а программой
//отображается последовательность из четырех чисел: число, на единицу
//        меньше введённого, введенное число и число, на единицу больше
//введенного. Четвертое число должно быть квадратом суммы первых трех
//чисел.