package part02.chapter18;

import java.io.*;
import java.util.Properties;

/**
 * Пример использования методов класса Properties
 * load (чтение из потока) и store (сохранение в поток)
 * для чтения данных из файла и записи в файл.
 *
 * Ввод-вывод:
 * *** Телефонная книга ***
 * Введите имя и номер, exit для завершения.
 * Имя: Vladimir
 * Номер: 12345678910
 * Имя: Abc
 * Номер: 01234567890
 * Имя: exit
 * Введите имя для поиска, exit для завершения.
 * Имя: Vladimir
 * Номер: 12345678910
 * Имя: Xyz
 * Номер: null
 * Имя: exit
 */
class PropertiesStoreLoad {
    public static void main(String[] args) throws IOException {

        System.out.println("*** Телефонная книга ***");

        // имя файла с данными
        String fileName = null;
        try {
            // чтение значений системных переменных окружения
            fileName = System.getProperty("user.home") +
                System.getProperty("file.separator") +
                "phonebook.dat"; // C:\Users\UserName\phonebook.dat
        } catch (Exception ex) {
        }

        // попытка открытия файла
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл с данными не найден.");
            return;
        }

        Properties prop = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // если файл существует, то в набор свойств
        // загружаются данные из файла
        try {
            if (fis != null) {
                prop.load(fis);
                fis.close();
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения файла.");
        }

        String name, number;
        boolean isChanged = false;

        // ввод имён и номеров
        System.out.println("Введите имя и номер, exit для завершения.");
        do {
            System.out.print("Имя: ");
            name = br.readLine();
            if (name.equals("exit")) {
                continue;
            }
            System.out.print("Номер: ");
            number = br.readLine();
            prop.put(name, number);
            isChanged = true;
        } while (!name.equals("exit"));

        // сохранение файла (если isChanged)
        if (isChanged) {
            FileOutputStream fos = new FileOutputStream(fileName);
            prop.store(fos, "Phone book (comment)");
            fos.close();
        }

        // поиск номера по имени и вывод
        System.out.println("Введите имя для поиска, exit для завершения.");
        do {
            System.out.print("Имя: ");
            name = br.readLine();
            if (name.equals("exit")) {
                continue;
            }
            number = (String)prop.get(name);
            System.out.println("Номер: " + number);
        } while (!name.equals("exit"));
    }
}
