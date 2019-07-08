package part01.chapter07;

/**
 * Пример реализации класса стека (см. part01.chapter06).
 * Усовершенствованная версия - с заданием размера стека.
 */
class Stack {
    private int[] stck;
    private int tos;

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Помещение элемента в вершину стека
    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Стек заполнен");
        } else {
            stck[++tos] = item;
            System.out.println("Помещено значение " + item);
        }
    }

    // Извлечение элемента из вершины стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не заполнен");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class StackSample {
    public static void main(String[] args) {

        Stack stack = new Stack(10);
        // Поместить числа в стек
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        // Извлечь числа из стека
        System.out.println("Содержимое стека:");
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
    }
}
