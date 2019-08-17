package part02.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Пример использования алгоритмов для обработки коллекций.
 * Алгоритмы коллекций представляют собой статические обобщённые методы из класса java.util.Collections.
 * Их можно применять к коллекциям и отображениям.
 *
 * Вывод:
 * Отсортированный в обратном порядке список: 100 5 -1 -2
 * Перетасованный список: -1 100 -2 5
 * Минимальное значение: -2
 * Максимальное значение: 100
 */
class Algorithms {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(-1);
        list.add(100);
        list.add(-2);
        list.add(5);

        Comparator<Integer> revCmp = Collections.reverseOrder();

        Collections.sort(list, revCmp);

        System.out.print("Отсортированный в обратном порядке список: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.shuffle(list); // переставляет элементы псевдослучайным образом

        System.out.print("Перетасованный список: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Минимальное значение: " + Collections.min(list));

        System.out.println("Максимальное значение: " + Collections.max((list)));
    }
}
