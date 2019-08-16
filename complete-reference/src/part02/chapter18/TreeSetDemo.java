package part02.chapter18;

import java.util.TreeSet;

/**
 * Пример использования класса TreeSet (древовидное множество - набор отсортированных объектов в виде дерева).
 * Объекты хранятся в отсортированном виде: сортировка по нарастающей или заданным компаратором.
 * Расширяет класс AbstractSet и реализует интерфейс NavigableSet (внедрённый в версии Java SE 6).
 * Время доступа и извлечения элементов достаточно мало, поэтому TreeSet подходит для хранения больших объёмов
 * отсортированных данных, которые должны быть быстро найдены.
 */
class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>();

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println("Значение множества ts: " + ts); // [A, B, C, D, E, F]

        System.out.println("Значение подмножества ts: " + ts.subSet("C", "F")); // [C, D, E]
    }
}
