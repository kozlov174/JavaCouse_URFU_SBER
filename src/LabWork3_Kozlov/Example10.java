import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        int N = 10000;

        System.out.println("Результат с ArrayList:");
        solveWithArrayList(N);

        System.out.println("\nРезультат с LinkedList:");
        solveWithLinkedList(N);
    }

    public static void solveWithArrayList(int N) {
        List<Integer> circle = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size();
            System.out.println("Вычеркнут человек с номером " + circle.remove(index));
        }

        System.out.println("Оставшийся человек: " + circle.get(0));
    }

    public static void solveWithLinkedList(int N) {
        List<Integer> circle = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size();
            System.out.println("Вычеркнут человек с номером " + circle.remove(index));
        }

        System.out.println("Оставшийся человек: " + circle.get(0));
    }
}

