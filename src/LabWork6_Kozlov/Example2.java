package LabWork6_Kozlov;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "CounterThread");

        System.out.println("Запуск потока...");
        t.start();
        t.join();
        System.out.println("Поток завершил работу.");
    }
}
