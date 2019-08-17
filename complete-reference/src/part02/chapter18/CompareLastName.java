package part02.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Пример реализации компаратора для упорядочения по фамилии.
 * Сначала производится сравнение последних слов в строках формата "Имя Фамилия", т.е по фамилии.
 * Если фамилии совпадают, тогда сравниваются и имена (строки полностью).
 * Получается упорядочение по фамилиям, а в пределах одинаковых фамилий - по именам.
 */
class LastNameComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        // поиск индекса символа, с которого начинается последнее слово (фамилия)
        int i, j, k;
        i = a.lastIndexOf(' ');
        j = b.lastIndexOf(' ');
        k = a.substring(i).compareTo(b.substring(j));
        if (k == 0) { // фамилии совпадают, тогда проверить имя и фамилию полностью
            return a.compareTo(b);
        } else {
            return k;
        }
    }
}

/**
 * Пример сохранения в древовидном отображении пар "Имя Фамилия"-"Баланс" банковского счёта вкладчиков.
 * Порядок следования пар задаётся с помощью одного компаратора.
 * Вывод:
 * Джейн Бейкер: 1500.0
 * Джон Доу: 3000.0
 * Ральф Смит: 100.0
 * Том Смит: 123.0
 * Тод Халл: 100.0
 * Новый баланс на счёте вкладчика Джон Доу: 5000.0
 */
class CompareLastName {
    public static void main(String[] args) {

        // создание древовидного отображения с заданием компаратора
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new LastNameComparator());

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
