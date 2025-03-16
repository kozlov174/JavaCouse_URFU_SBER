package timus;
import java.util.Scanner;

public class task_2001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();

        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        int a3 = scanner.nextInt();
        int b3 = scanner.nextInt();

        int firstMathematician = b1 - b2;
        int secondMathematician = a1 - a3;

        System.out.println(firstMathematician + " " + secondMathematician);
    }
}
