package timus;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> kanjiList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            kanjiList.add(scanner.nextLine());
        }

        char inputChar = scanner.nextLine().charAt(0);

        for (String kanji : kanjiList) {
            if (kanji.charAt(0) == inputChar) {
                System.out.println(kanji);
            }
        }
    }
}
