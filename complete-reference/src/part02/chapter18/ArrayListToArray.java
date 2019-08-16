package part02.chapter18;

import java.util.ArrayList;

/**
 * Пример получения обычного массива из коллекции ArrayList.
 * Нужно для ускорения выполнения операций (с массивом)
 * или поддержки старого кода (без коллекций).
 */
class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<Integer> al0 = new ArrayList<Integer>();

        al0.add(1);
        al0.add(2);
        al0.add(3);

        System.out.println("Содержимое коллекции al0: " + al0); // [1, 2, 3]

        Integer ar0[] = new Integer[al0.size()];
        ar0 = al0.toArray(ar0);

        System.out.print("Содержимое массива ar0: "); // 1 2 3
        for (Integer i : ar0) {
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayList<Object> al1 = new ArrayList<Object>();

        al1.add(3);
        al1.add("a");
        al1.add(true);

        System.out.println("Содержимое коллекции al1: " + al1); // [3, a, true]

        Object ar1[] = al1.toArray();

        System.out.print("Содержимое массива ar1: "); // 3 a true
        for (Object o : ar1) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
