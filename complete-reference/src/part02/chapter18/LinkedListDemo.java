package part02.chapter18;

import java.util.LinkedList;

/**
 * Пример использования класса LinkedList (двусвязный список).
 */
class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2"); // вставка элемента в ячейку с индексом 1, остальные элементы смещаются вперёд (вправо)

        System.out.println("Исходное содержимое связного списка ll: " + ll); // [A, A2, F, B, D, E, C, Z]

        ll.remove("F"); // удаление элемента по значению
        ll.remove(2);   // удаление элемента по индексу; индекс начинается с 0

        System.out.println("Содержимое связного списка ll после удаления элементов: " + ll); // [A, A2, D, E, C, Z]

        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое связного списка ll после удаления первого и последнего элементов: " + ll); // [A2, D, E, C]

        String val = ll.get(2); // получение значения элемента по индексу
        ll.set(2, val + " изменено"); // присвоение значения элемента по индексу

        System.out.println("Содержимое связного списка ll после изменения: " + ll); // [A2, D, E изменено, C]
    }
}
