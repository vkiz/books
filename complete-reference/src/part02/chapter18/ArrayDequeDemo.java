package part02.chapter18;

import java.util.ArrayDeque;

/**
 * Использование класса ArrayDeque (двусторонняя очередь).
 * Можно производить вставку и удаление как в начале коллекции, так и в её конце.
 * Пример организации стека с помощью класса ArrayDeque.
 */
class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<String> ad = new ArrayDeque<String>();

        ad.push("A");
        ad.push("B");
        ad.push("C");
        ad.push("D");
        ad.push("E");

        System.out.print("Извлечение из стека: ");
        while (ad.peek() != null) {
            System.out.print(ad.pop() + " "); // E D C B A
        }
        System.out.println();
    }
}
