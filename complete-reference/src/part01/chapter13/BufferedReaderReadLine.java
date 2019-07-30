package part01.chapter13;

import java.io.*;

/**
 * Пример чтения символьных строк с консоли.
 * Вывод:
 * Введите строки текста, 'stop' для завершения...
 * Строка 1     <- ввод
 * Строка 1     <- вывод
 * Строка 2     <- ввод
 * Строка 2     <- вывод
 * stop         <- ввод
 * stop         <- вывод
 */

class BufferedReaderReadLine {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строки текста, 'stop' для завершения...");

        String s;
        do {
            s = br.readLine(); // чтение строки символов
            System.out.println(s);
        } while (!s.equals("stop"));
    }
}
