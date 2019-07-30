package part01.chapter13;

import java.io.*;

/**
 * Пример чтения файла с помощью потока ввода байтов FileInputStream.
 * Используется оператор "try с ресурсами".
 */
class FileInputStreamShowFile3 {
    public static void main(String[] args) {

        // проверка указано ли имя файла
        if (args.length != 1) {
            System.out.println("Укажите имя файла: FileInputStreamShowFile3 имя_файла");
            return;
        }

        int i;

        // Использование оператора "try с ресурсами":
        // объявление и инициализация ресурса в круглых скобках,
        // закрытие файла выполняется автоматически после выхода из блока try
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
