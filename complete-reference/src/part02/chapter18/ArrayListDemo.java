package part02.chapter18;

import java.util.ArrayList;

/**
 * Пример использования класса ArrayList
 * (простой список объектов, динамический массив).
 */
class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Начальный размер списочного массива al: " + al.size()); // 0

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2"); // вставка элемента в ячейку с индексом 1, остальные элементы смещаются вперёд (вправо)

        System.out.println("Размер списочного массива al после добавления элементов: " + al.size()); // 7
        System.out.println("Содержимое списочного массива al: " + al); // [C, A2, A, E, B, D, F]

        al.remove("F"); // удаление элемента по значению
        al.remove(2);   // удаление элемента по индексу; индекс начинается с 0

        System.out.println("Размер списочного массива al после удаления элементов: " + al.size()); // 5
        System.out.println("Содержимое списочного массива al: " + al); // [C, A2, E, B, D]
    }
}
