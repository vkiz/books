package part02.chapter18;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Пример использования класса Hashtable.
 * Информация о счетах вкладчиков хранится в виде пар "Имя Фамилия - баланс счёта".
 *
 * Вывод:
 * Тод Холл: 100.0
 * Джон Доу: 3000.0
 * Джейн Бейкер: 1500.0
 * Ральф Смит: 100.0
 * Том Смит: 123.0
 *
 * Тод Холл: 100.0
 * Джон Доу: 3000.0
 * Джейн Бейкер: 1500.0
 * Ральф Смит: 100.0
 * Том Смит: 123.0
 *
 * Тод Холл: 100.0
 * Джон Доу: 3000.0
 * Джейн Бейкер: 1500.0
 * Ральф Смит: 100.0
 * Том Смит: 123.0
 *
 * Новый баланс на счёте вкладчика Джон Доу: 5000.0
 */
class HashtableDemo {
    public static void main(String[] args) {

        // создание хеш-таблицы
        Hashtable<String, Double> balance = new Hashtable<String, Double>();

        // помещение пар "ключ-значение"
        balance.put("Джон Доу", 3000.0);
        balance.put("Том Смит", 123.0);
        balance.put("Джейн Бейкер", 1500.0);
        balance.put("Тод Холл", 100.0);
        balance.put("Ральф Смит", 100.0);

        // вывод пар хеш-таблицы

        String name;
        Double bal;

        // с помощью устаревшего интерфейса Enumeration
        Enumeration<String> names = balance.keys();
        while (names.hasMoreElements()) {
            name = names.nextElement();
            System.out.println(name + ": " + balance.get(name));
        }

        System.out.println();

        // с помощью нового интерфейса Iterator или цикла в стиле for each

        // сначала нужно получить представление всех ключей в виде множества (Set)
        Set<String> ks = balance.keySet();

        // итератор
        Iterator<String> it = ks.iterator();
        while (it.hasNext()) {
            name = it.next();
            System.out.println(name + ": " + balance.get(name));
        }

        System.out.println();

        // for each
        for (String nm : ks) {
            System.out.println(nm + ": " + balance.get(nm));
        }

        System.out.println();

        // чтение и запись значения по ключу
        name = "Джон Доу";
        bal = balance.get(name);
        balance.put(name, bal + 2000);
        System.out.println("Новый баланс на счёте вкладчика " + name + ": " + balance.get(name));
    }
}
