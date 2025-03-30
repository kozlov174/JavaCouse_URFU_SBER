package timus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task_1563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        Set<String> visitedShops = new HashSet<>();
        int bayanCount = 0;

        for (int i = 0; i < N; i++) {
            String shop = scanner.nextLine();
            if (!visitedShops.add(shop)) {
                bayanCount++;
            }
        }

        System.out.println(bayanCount);
    }
}
