package part02.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Пример использования класса TreeMap.
 * Пары "ключ-значение" отсортированы по возрастанию ключа.
 * Порядок сортировки можно задать в конструкторе с помощью компаратора.
 *
 * Вывод:
 * Джейн Бейкер: 1333.99
 * Джон Доу: 3000.99
 * Ральф Смит: 99.99
 * Тод Холл: 99.99
 * Том Смит: 123.45
 *
 * Новый баланс Джона Доу: 5000.99
 */
public class TreeMapDemo {
    public static void main(String[] args) {

        // создание объекта отображения
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        // помещение элементов (пар "ключ-значение")
        tm.put("Джон Доу", 3000.99);
        tm.put("Том Смит", 123.45);
        tm.put("Джейн Бейкер", 1333.99);
        tm.put("Тод Холл", 99.99);
        tm.put("Ральф Смит", 99.99);

        // получение множества из отображения
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // вывод записей из множества
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        System.out.println();

        // чтение и запись в отображении
        double balance = tm.get("Джон Доу"); // чтение значения по ключу
        tm.put("Джон Доу", balance + 2000);  // запись значения по ключу

        System.out.println("Новый баланс Джона Доу: " + tm.get("Джон Доу"));
    }
}
