package timus;

import java.util.Scanner;

public class Task1607 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        while (a < c) {
            a += b;
            c -= d;
        }

        System.out.println(a);
    }
}
