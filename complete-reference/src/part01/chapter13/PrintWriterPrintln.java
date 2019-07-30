package part01.chapter13;

import java.io.*;

/**
 * Пример использования класса потока вывода символов PrintWriter.
 */
class PrintWriterPrintln {
    public static void main(String[] args) {

        // System.out - поток вывода типа OutputStream,
        // true - автоматическая очистка потока (flush) при вызове методов println, printf, format
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Это строка символов");

        int i = 300;
        pw.println(i);

        double d = 123.45;
        pw.println(d);
    }
}
