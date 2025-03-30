package LabWork3_Kozlov;

import java.util.HashMap;

public class Example9 {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();

        myHashMap.put(0, "Это");
        myHashMap.put(1, "Фраза");
        myHashMap.put(2, "для");
        myHashMap.put(3, "проверки");
        myHashMap.put(4, "работы");
        myHashMap.put(5, "моей");
        myHashMap.put(6, "программы");
        myHashMap.put(7, "я");
        myHashMap.put(8, "умею");
        myHashMap.put(9, "программировать");

        System.out.println("Строки с ключом > 5:");
        for (int key : myHashMap.keySet()) {
            if (key > 5) {
                System.out.print(myHashMap.get(key) + " ");
            }
        }
        System.out.println("\n");

        if (myHashMap.containsKey(0)) {
            System.out.println("Строки с ключом =0: " + myHashMap.get(0));
        }

        long product = 1;
        boolean hasLongStrings = false;

        for (int key : myHashMap.keySet()) {
            String value = myHashMap.get(key);
            if (value.length() > 5) {
                product *= key;
                hasLongStrings = true;
            }
        }

        if (hasLongStrings) {
            System.out.println("Произведение ключей с длинной строки > 5: " + product);
        } else {
            System.out.println("Строк с длинной больше 5 нет");
        }
    }
}
