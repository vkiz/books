package part01.chapter13;

import java.io.*;

/**
 * Пример простого текстового редактора, использующего BufferedReader.
 * Производится чтение до 100 строк или ввода слова "stop".
 */
class BufferedReaderTextEditor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];

        System.out.println("Введите строки текста, 'stop' для завершения...");
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) {
                break;
            }
        }

        System.out.println("\nВведённые строки текста:");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("stop")) {
                break;
            }
            System.out.println(str[i]);
        }
    }
}
