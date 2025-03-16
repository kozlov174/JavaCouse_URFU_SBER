package LabWork2_Kozlov;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        int sizeOfArray = 10;
        int[] randomArray = new int[sizeOfArray];

        Random generator = new Random();

        System.out.println("Полученный массив:");
        //генерация массива с рандомными значениями
        for (int i = 0; i < sizeOfArray; i++){
            randomArray[i] = generator.nextInt(10);
            System.out.print(randomArray[i] + " ");
        }
        //поиск наименьшего элемента
        int minElement = randomArray[0];
        for (int i = 0; i < sizeOfArray; i++){
            if (randomArray[i] < minElement){
                minElement = randomArray[i];
            }
        }
        System.out.println("\nМинимальный элемент: " + minElement);
        //Поиск индексов минимального элемента
        System.out.println("Индексы минимальных элементов:");
        List<Integer> indexesOfMinimum = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++){
            if (randomArray[i] == minElement){
                System.out.print(i + " ");
            }
        }
    }
}
