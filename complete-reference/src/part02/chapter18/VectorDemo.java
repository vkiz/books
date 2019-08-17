package part02.chapter18;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Пример использования класса Vector
 * и перебора элементов с помощью интерфейсов Enumeration (не рекомендуется использовать в новом коде) и Iterator,
 * а также циклом в стиле for each.
 */
class VectorDemo {
    public static void main(String[] args) {

        // создание вектора
        Vector<Integer> v = new Vector<Integer>(3, 2); // начальная ёмкость 3 + инкремент 2
        System.out.println("Начальный размер вектора: " + v.size());        // 0
        System.out.println("Начальная ёмкость вектора: " + v.capacity());   // 3

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Ёмкость вектора после добавления 4 элементов: " + v.capacity());        // 5 (см. конструктор: 3 + 2)

        v.addElement(5);
        System.out.println("Ёмкость вектора после добавления ещё 1 элемента: " + v.capacity());     // 5

        v.addElement(6);
        v.addElement(7);
        System.out.println("Ёмкость вектора после добавления ещё 2 элементов: " + v.capacity());    // 7

        v.addElement(8);
        v.addElement(9);
        System.out.println("Ёмкость вектора после добавления ещё 2 элементов: " + v.capacity());    // 9

        v.addElement(10);
        v.addElement(11);

        System.out.println("Первый элемент вектора: " + v.firstElement());      // 1

        System.out.println("Последний элемент вектора: " + v.lastElement());    // 11

        System.out.println("Вектор содержит значение 3: " + v.contains(3));     // true

        // перечисление элементов вектора

        // с помощью устаревшего интерфейса Enumeration
        Enumeration<Integer> en = v.elements();
        System.out.print("Элементы вектора: ");
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");    // 1 2 3 4 5 6 7 8 9 10 11
        }
        System.out.println();

        // с помощью нового интерфейса Iterator
        Iterator<Integer> it = v.iterator();
        System.out.print("Элементы вектора: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");           // 1 2 3 4 5 6 7 8 9 10 11
        }
        System.out.println();

        // с помощью цикла в стиле for each
        System.out.print("Элементы вектора: ");
        for (Integer i : v) {
            System.out.print(i + " ");                  // 1 2 3 4 5 6 7 8 9 10 11
        }
        System.out.println();
    }
}
