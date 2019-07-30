package part01.chapter13;

import java.io.*;

/**
 * Пример чтения файла с помощью потока ввода байтов FileInputStream.
 * Используется один блок try для открытия, чтения и явного закрытия файла.
 */
class FileInputStreamShowFile2 {
    public static void main(String[] args) {

        // проверка указано ли имя файла
        if (args.length != 1) {
            System.out.println("Укажите имя файла: FileInputStreamShowFile2 имя_файла");
            return;
        }

        FileInputStream fin = null;
        int i;

        // открытие, чтение и закрытие файла
        try {
            fin = new FileInputStream(args[0]);
            System.out.println("Содержимое файла:");
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден");
        } catch (IOException ex) {
            System.out.println("Ошибка чтения из файла");
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException ex) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
