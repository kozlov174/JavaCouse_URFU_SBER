package timus;

import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int first_number = in.nextInt();
        int second_number  = in.nextInt();
        int summ = first_number + second_number - 1;
        System.out.println((summ - first_number) + " " + (summ - second_number));
        in.close();
    }
}
