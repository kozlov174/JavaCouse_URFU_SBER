package timus;

import java.util.Scanner;

public class task_1585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int emperor = 0, little = 0, macaroni = 0;

        for (int i = 0; i < n; i++) {
            String type = scanner.nextLine();
            if (type.equals("Emperor Penguin")) {
                emperor++;
            } else if (type.equals("Little Penguin")) {
                little++;
            } else if (type.equals("Macaroni Penguin")) {
                macaroni++;
            }
        }

        if (emperor > little && emperor > macaroni) {
            System.out.println("Emperor Penguin");
        } else if (little > emperor && little > macaroni) {
            System.out.println("Little Penguin");
        } else {
            System.out.println("Macaroni Penguin");
        }
    }
}
