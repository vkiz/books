package part01.chapter13;

import java.io.*;

/**
 * Пример чтения файла с помощью потока ввода байтов FileInputStream.
 * Используется явное закрытие файла с помощью метода close().
 */
class FileInputStreamShowFile1 {
    public static void main(String[] args) {

        // проверка указано ли имя файла
        if (args.length != 1) {
            System.out.println("Укажите имя файла: FileInputStreamShowFile1 имя_файла");
            return;
        }

        FileInputStream fin;
        int i;

        // открытие файла
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден");
            return;
        }

        System.out.println("Содержимое файла:");

        // чтение файла до конца
        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException ex) {
            System.out.println("Ошибка чтения из файла");
        }

        // закрытие файла
        try {
            fin.close();
        } catch (IOException ex) {
            System.out.println("Ошибка закрытия файла");
        }

        /*
        // вариант чтения файла и закрытия в блоке finally
        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException ex) {
            System.out.println("Ошибка чтения из файла");
        } finally {
            try {
                fin.close();
            } catch (IOException ex) {
                System.out.println("Ошибка закрытия файла");
            }
        }
        */
    }
}
