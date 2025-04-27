package timus;

import java.util.Scanner;

public class Task_1787 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int traffic = 0;
        for (int i = 0; i < n; i++) {
            traffic += a[i];
            traffic = Math.max(traffic - k, 0);
        }

        System.out.println(traffic);
    }
}
