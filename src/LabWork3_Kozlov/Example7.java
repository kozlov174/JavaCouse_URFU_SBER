package LabWork3_Kozlov;
import java.util.Scanner;

public class Example7 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        inputArrayRecursive(array, 0);

        System.out.println("Введенный массив:");
        outputArrayRecursive(array, 0);
    }
    public static void inputArrayRecursive(int[] array, int index) {
        if (index >= array.length) {
            return;
        }
        array[index] = scanner.nextInt();
        inputArrayRecursive(array, index + 1);
    }

    public static void outputArrayRecursive(int[] array, int index) {
        if (index >= array.length) {
            return;
        }
        System.out.print(array[index] + " ");
        outputArrayRecursive(array, index + 1);
    }
}
