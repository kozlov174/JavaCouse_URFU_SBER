package LabWork1_Kozlov;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите своё имя");
        String name = in.nextLine();
        System.out.println("Введите свой возраст");
        String age = in.nextLine();
        System.out.println("Это " + name + " и ему " + age + " лeт");
        in.close();
        //в последней строке можно также добавить обработчик на "лет" и "года"
    }
}
//        Напишите программу, в которой Пользователь вводит имя и возраст.
//Программа отображает сообщение об имени и возрасте пользователя.