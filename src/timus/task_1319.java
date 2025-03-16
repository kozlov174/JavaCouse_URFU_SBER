package timus;

import java.util.Scanner;

public class task_1319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        int number = 1;

        for (int diag = 0; diag < 2 * n - 1; diag++) {
            int row, col;
            if (diag < n) {
                row = 0;
                col = n - 1 - diag;
            } else {
                row = diag - n + 1;
                col = 0;
            }

            while (row < n && col < n) {
                matrix[row][col] = number++;
                row++;
                col++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
