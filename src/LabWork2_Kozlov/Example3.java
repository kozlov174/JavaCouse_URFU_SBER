package LabWork2_Kozlov;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n):");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("y")) {
                String decryptedText = decrypt(encryptedText, key);
                System.out.println("Исходный текст: " + decryptedText);
                break;
            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ.");
            }
        }


    }
    public static String encrypt(String phrase, int key){
        StringBuilder encryptedText = new StringBuilder();

        for (char c : phrase.toCharArray()) {
            if (Character.isLetter(c)) {
                // Определяем базовый символ (A или a)
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                // Вычисляем новую позицию символа с учетом ключа
                char encryptedChar = (char) ((c - base + key) % 26 + base);
                encryptedText.append(encryptedChar);
            } else {
                // Если символ не является буквой, оставляем его без изменений
                encryptedText.append(c);
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String phrase, int key){
        return encrypt(phrase, -key);
    }
}
