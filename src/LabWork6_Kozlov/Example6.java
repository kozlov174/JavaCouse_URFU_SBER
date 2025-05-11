package LabWork6_Kozlov;

public class Example6 {

    public static int sumArray(int[] array) throws InterruptedException {
        int cores = 8;
        int[] partialSums = new int[cores];
        Thread[] threads = new Thread[cores];
        int chunkSize = (int) Math.ceil(array.length * 1.0 / cores);

        for (int i = 0; i < cores; i++) {
            final int index = i;
            final int start = index * chunkSize;
            final int end = Math.min(start + chunkSize, array.length);

            threads[i] = new Thread(() -> {
                int localSum = 0;
                for (int j = start; j < end; j++) {
                    localSum += array[j];
                }
                partialSums[index] = localSum;
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int totalSum = 0;
        for (int sum : partialSums) {
            totalSum += sum;
        }

        return totalSum;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }

        int result = sumArray(data);
        System.out.println("Сумма: " + result);
    }
}
