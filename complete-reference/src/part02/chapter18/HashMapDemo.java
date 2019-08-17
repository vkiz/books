package part02.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Пример использования класса HashMap.
 * По умолчанию ёмкость равна 16, коэффициент заполнения 0.75.
 * Хеш-отображение не гарантирует порядок расположения своих элементов. Т.е. порядок, в котором они извлекаются
 * итератором, не обязательно соответствует тому порядку, в котором они вводятся в хеш-отображение.
 *
 * Вывод:
 * Ральф Смит: 99.99
 * Джон Доу: 3000.99
 * Джейн Бейкер: 1333.99
 * Том Смит: 123.45
 * Тод Холл: 99.99
 *
 * Новый баланс Джона Доу: 5000.99
 */
public class HashMapDemo {
    public static void main(String[] args) {

        // создание объекта отображения
        HashMap<String, Double> hm = new HashMap<String, Double>();

        // помещение элементов (пар "ключ-значение")
        hm.put("Джон Доу", 3000.99);
        hm.put("Том Смит", 123.45);
        hm.put("Джейн Бейкер", 1333.99);
        hm.put("Тод Холл", 99.99);
        hm.put("Ральф Смит", 99.99);

        // получение множества из отображения
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // вывод записей из множества
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        System.out.println();

        // чтение и запись в отображении
        double balance = hm.get("Джон Доу"); // чтение значения по ключу
        hm.put("Джон Доу", balance + 2000);  // запись значения по ключу

        System.out.println("Новый баланс Джона Доу: " + hm.get("Джон Доу"));
    }
}
