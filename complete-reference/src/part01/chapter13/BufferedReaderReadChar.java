package part01.chapter13;

import java.io.*;

/**
 * Пример чтения символов с консоли.
 * Вывод:
 * Введите символы ('q' - для выхода) и нажмите на 'Enter'...
 * 123q <- ввод
 * 1    <- вывод
 * 2
 * 3
 * q
 */

class BufferedReaderReadChar {
    public static void main(String[] args) throws IOException {
        // Получение буферизированного потока ввода символов,
        // связанного с консолью через стандартный поток ввода System.in.
        // Стандартный поток ввода System.in по умолчанию является буферизированным построчно,
        // поэтому введённые с клавиатуры данные передадутся программе только после нажатия на Enter.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите символы ('q' - для выхода) и нажмите на 'Enter'...");

        char c;
        do {
            c = (char) br.read(); // чтение одного символа (int, значение от 0 до 65535)
            System.out.println(c);
        } while (c != 'q');
    }
}
