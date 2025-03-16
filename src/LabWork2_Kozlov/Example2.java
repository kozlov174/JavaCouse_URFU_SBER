package LabWork2_Kozlov;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;
        int[][] randomArray = new int[width][height];

        Random generator = new Random();

        for(int i = 0; i < height; i++){
            for(int k = 0; k < width; k++){
                randomArray[i][k] = generator.nextInt(10);
            }
            i++;
            if (i < height) {
                for(int k = width - 1; k > 0; k--){
                    randomArray[i][k] = generator.nextInt(10);
                }
            }
        }
        System.out.println(randomArray);
    }
}
