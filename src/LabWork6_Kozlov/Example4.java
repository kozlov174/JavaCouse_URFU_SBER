package LabWork6_Kozlov;

public class Example4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;
            new Thread(() -> {
                System.out.println("Поток " + threadNumber + " запущен");
            }).start();
        }
    }
}
