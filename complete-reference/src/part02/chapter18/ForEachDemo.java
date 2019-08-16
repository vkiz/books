package part02.chapter18;

import java.util.ArrayList;

/**
 * Пример перебора коллекции циклом в стиле for each.
 * Можно перебирать любую коллекцию, реализующую интерфейс Iterable (все классы коллекций).
 */
class ForEachDemo {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.print("Содержимое списка al: ");

        for (int i : al) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
    }
}
