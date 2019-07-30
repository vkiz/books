package part01.chapter13;

import java.io.*;

/**
 * Пример чтения-записи файла с помощью потоков ввода-вывода байтов FileInputStream и FileOutputStream.
 * Используется явное закрытие файлов с помощью метода close().
 */
class FileCopy1 {
    public static void main(String[] args) {

        // проверка указаны ли имена входного и выходного файлов
        if (args.length != 2) {
            System.out.println("Укажите имена файлов: FileCopy1 откуда куда");
            return;
        }

        FileInputStream fin = null;
        FileOutputStream fout = null;
        int i;

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);

        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException ex) {
                System.out.println("Ошибка закрытия файла ввода");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException ex) {
                System.out.println("Ошибка закрытия файла вывода");
            }
        }
    }
}
