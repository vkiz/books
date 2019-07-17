package part01.chapter09;

/**
 * Реализация интерфейса IntStack для стека фиксированного размера.
 */
class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    // Выделение памяти и инициализация стека
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Поместить элемент в стек
    @Override
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Стек заполнен.");
        } else {
            stck[++tos] = item;
        }
    }

    // Извлечь элемент из стека
    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class FixedStackTest {
    public static void main(String[] args) {
        FixedStack stack1 = new FixedStack(5);
        FixedStack stack2 = new FixedStack(10);

        for (int i = 0; i < 5; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            stack2.push(i);
        }

        System.out.println("Содержимое стека stack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(stack1.pop());
        }
        System.out.println("Содержимое стека stack2:");
        for (int i = 0; i < 8; i++) {
            System.out.println(stack2.pop());
        }
    }
}
