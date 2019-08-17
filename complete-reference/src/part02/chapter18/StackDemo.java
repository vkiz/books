package part02.chapter18;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Пример использования класса Stack (LIFO).
 * Вывод:
 * Вызов push(10)
 * Стек: [10]
 * Вызов push(20)
 * Стек: [10, 20]
 * Вызов push(30)
 * Стек: [10, 20, 30]
 * Вызов pop(): 30
 * Стек: [10, 20]
 * Вызов pop(): 20
 * Стек: [10]
 * Вызов pop(): 10
 * Стек: []
 * Вызов pop(): Исключение: Стек пуст.
 */
class StackDemo {
    public static void main(String[] args) {

        // создание стека
        Stack<Integer> st = new Stack<Integer>();

        showPush(st, 10);
        showPush(st, 20);
        showPush(st, 30);
        showPop(st);
        showPop(st);
        showPop(st);

        try {
            showPop(st);
        } catch (EmptyStackException ex) {
            System.out.println("Исключение: стек пуст.");
        }
    }

    /**
     * Помещает элемент в вершину стека.
     * @param st
     * @param a
     */
    static void showPush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("Вызов push(" + a + ")");
        System.out.println("Стек: " + st);
    }

    /**
     * Возвращает элемент из вершины стека, удаляя его оттуда.
     * @param st
     */
    static void showPop(Stack<Integer> st) {
        System.out.print("Вызов pop(): ");
        Integer i = st.pop();
        System.out.println(i);
        System.out.println("Стек: " + st);
    }
}
