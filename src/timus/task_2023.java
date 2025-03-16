package timus;

import java.util.Scanner;

public class task_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[][] cabinets = {
                {"Alice", "Ariel", "Aurora", "Phil", "Peter", "Olaf", "Phoebus", "Ralph", "Robin"},
                {"Bambi", "Belle", "Bolt", "Mulan", "Mowgli", "Mickey", "Silver", "Simba", "Stitch"},
                {"Dumbo", "Genie", "Jiminy", "Kuzko", "Kida", "Kenai", "Tarzan", "Tiana", "Winnie"}
        };

        int currentPosition = 0;
        int steps = 0;

        for (int i = 0; i < n; i++) {
            String letter = scanner.nextLine();
            int targetPosition = -1;

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 9; k++) {
                    if (cabinets[j][k].equals(letter)) {
                        targetPosition = j;
                        break;
                    }
                }
                if (targetPosition != -1) break;
            }

            steps += Math.abs(targetPosition - currentPosition);
            currentPosition = targetPosition;
        }

        System.out.println(steps);
    }
}
