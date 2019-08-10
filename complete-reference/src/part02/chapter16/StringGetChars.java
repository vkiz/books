package part02.chapter16;

import java.io.UnsupportedEncodingException;

/**
 * Примеры методов получения символов из строки
 * length(), charAt(), getChars(), getBytes(), toCharArray()
 */
class StringGetChars {
    public static void main(String[] args) {

        int n = "abcde".length();   // возвращает количество символов (длину строки)
        System.out.println(n);      // 5

        char ch = "abc".charAt(1);  // возвращает символ по его индексу в строке
        System.out.println(ch);     // b

        String src = "Это демонстрация метода getChars().";
        int start = 4;
        int end = 16;
        char dest[] = new char[end - start];
        src.getChars(start, end, dest, 0);  // копирует символы подстроки в массив символов char[]
        System.out.println(dest);           // демонстрация

        byte bytes[] = "abcde".getBytes();  // возвращает массив байтов (символы преобразуются в байты)
        for (byte b : bytes) {
            System.out.print(b + " ");      // 97 98 99 100 101
        }
        System.out.println();

        // преобразование массива байтов в строку и обратно (с указанием кодировки символов)
        try {
            byte utf8[] = { 97, 98, 99, 100, 101 };
            String utf8Str = new String(utf8, "UTF-8"); // abcde
            byte bytes2[] = utf8Str.getBytes("UTF-8");
            for (byte b : bytes2) {
                System.out.print(b + " ");      // 97 98 99 100 101
            }
            System.out.println();
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Кодировка символов не поддерживается.");
        }

        char chars[] = "abcde".toCharArray();   // возвращает массив символов char[]
        System.out.println(chars);
    }
}
