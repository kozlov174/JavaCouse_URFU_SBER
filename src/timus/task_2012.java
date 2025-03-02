package timus;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 4*60/45;
        if (a + b >= 12){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
