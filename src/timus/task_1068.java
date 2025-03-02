package timus;
import java.util.Scanner;

public class task_1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = Math.min(N, 1);
        int b = Math.max(N, 1);
        int n = b - a + 1;
        int sum = (a + b) * n / 2;
        System.out.println(sum);
        scanner.close();
    }
}