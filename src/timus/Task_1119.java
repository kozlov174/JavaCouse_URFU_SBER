package timus;

import java.util.Scanner;
import java.util.HashSet;

public class Task_1119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        HashSet<String> diagonalBlocks = new HashSet<>();

        for (int i = 0; i < K; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            diagonalBlocks.add(x + "," + y);
        }

        double[][] dp = new double[N+1][M+1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                dp[i][j] = Double.MAX_VALUE;
            }
        }

        dp[0][0] = 0.0;

        final double side = 100.0;
        final double diag = 100.0 * Math.sqrt(2);

        for (int x = 0; x <= N; x++) {
            for (int y = 0; y <= M; y++) {
                if (x > 0) {
                    dp[x][y] = Math.min(dp[x][y], dp[x-1][y] + side);
                }
                if (y > 0) {
                    dp[x][y] = Math.min(dp[x][y], dp[x][y-1] + side);
                }
                if (x > 0 && y > 0) {
                    if (diagonalBlocks.contains(x + "," + y)) {
                        dp[x][y] = Math.min(dp[x][y], dp[x-1][y-1] + diag);
                    }
                }
            }
        }

        // Выводим округленное значение
        System.out.println(Math.round(dp[N][M]));
    }
}

