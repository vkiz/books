package part02.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Компаратор для сравнения по фамилии (последнее слово в строке)
 * без учёта регистра символов.
 */
class LastNameComparator2 implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int i = a.lastIndexOf(' ');
        int j = b.lastIndexOf(' ');
        return a.substring(i).compareToIgnoreCase(b.substring(j));
    }
}

/**
 * Компаратор для сравнения по имени
 * без учёта регистра символов.
 */
class FirstNameComparator2 implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return a.compareToIgnoreCase(b);
    }
}

/**
 * Пример сохранения в древовидном отображении пар "Имя Фамилия"-"Баланс" банковского счёта вкладчиков.
 * Порядок следования пар задаётся с помощью двух компараторов.
 * Первый компаратор сравнивает фамилии, а второй имена (если фамилии совпадают).
 * Метод thenComparing() позволяет указать второй компаратор, который используется в том случае,
 * если вызывающий компаратор возвращает признак равенства сравниваемых объектов.
 * Получается упорядочение по фамилиям, а в пределах одинаковых фамилий - по именам.
 * Вывод:
 * Джейн Бейкер: 1500.0
 * Джон Доу: 3000.0
 * Ральф Смит: 100.0
 * Том Смит: 123.0
 * Тод Халл: 100.0
 * Новый баланс на счёте вкладчика Джон Доу: 5000.0
 */
class CompareLastName2 {
    public static void main(String[] args) {

        // создание первого компаратора (для упорядочения по фамилии)
        LastNameComparator2 cmp = new LastNameComparator2();

        // создание второго компаратора (для упорядочения по имени, если фамилии совпадают)
        Comparator<String> cmpThen = cmp.thenComparing(new FirstNameComparator2());

        // создание древовидного отображения с заданием компаратора (второго)
        TreeMap<String, Double> tm = new TreeMap<String, Double>(cmpThen);

        tm.put("Джон Доу", 3000.0);
        tm.put("Том Смит", 123.0);
        tm.put("Джейн Бейкер", 1500.0);
        tm.put("Тод Халл", 100.0);
        tm.put("Ральф Смит", 100.0);

        // получение множества элементов из набора (для последующего вывода в цикле foreach)
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> entry : set) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String key = "Джон Доу";
        double value = tm.get(key);
        tm.put(key, value + 2000.0);
        System.out.println("Новый баланс на счёте вкладчика " + key + ": " + tm.get(key));
    }
}
