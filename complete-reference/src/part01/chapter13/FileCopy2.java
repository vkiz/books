package part01.chapter13;
import java.io.*;

/**
 * Пример чтения-записи файла с помощью потоков ввода-вывода байтов FileInputStream и FileOutputStream.
 * Используется оператор "try с ресурсами" для автоматического закрытия ресурсов.
 */
class FileCopy2 {
    public static void main(String[] args) {

        // проверка указаны ли имена входного и выходного файлов
        if (args.length != 2) {
            System.out.println("Укажите имена файлов: FileCopy2 откуда куда");
            return;
        }

        int i;

        // Использование оператора "try с ресурсами":
        // объявление и инициализация сразу двух ресурсов в круглых скобках (через точку с запятой),
        // закрытие ресурсов выполняется автоматически после выхода из блока try
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
    }
}
