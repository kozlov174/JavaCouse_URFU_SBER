package LabWork6_Kozlov;

public class Example5 {
    private static int[] array;
    private static int[] partialMaxes;

    public static int findMax(int[] inputArray) throws InterruptedException {
        array = inputArray;
        int cores = 8;
        partialMaxes = new int[cores];

        Thread[] threads = new Thread[cores];
        int chunkSize = array.length / cores;

        for (int i = 0; i < cores; i++) {
            final int threadId = i;
            int start = i * chunkSize;
            int end = (i == cores - 1) ? array.length : start + chunkSize;

            threads[i] = new Thread(() -> {
                int max = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                }
                partialMaxes[threadId] = max;
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int globalMax = Integer.MIN_VALUE;
        for (int max : partialMaxes) {
            if (max > globalMax) {
                globalMax = max;
            }
        }

        return globalMax;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] testArray = {3, 7, 2, 9, 1, 4, 8, 5, 22, 10, 15, 12, 18, 11};
        System.out.println("Максимальный элемент: " + findMax(testArray));
    }
}