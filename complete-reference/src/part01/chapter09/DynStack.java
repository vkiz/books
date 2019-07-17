package part01.chapter09;

/**
 * Реализация интерфейса IntStack для стека динамического размера.
 */
class DynStack implements IntStack {

    private int stck[];
    private int tos;

    // Выделение памяти и инициализация стека
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Поместить элемент в стек
    @Override
    public void push(int item) {
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++tos] = item;
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

class DynStackTest {
    public static void main(String[] args) {
        DynStack stack1 = new DynStack(5);
        DynStack stack2 = new DynStack(8);

        // Происходит увеличение размера стека
        for (int i = 0; i < 12; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            stack2.push(i);
        }

        System.out.println("Содержимое стека stack1:");
        for (int i = 0; i < 12; i++) {
            System.out.println(stack1.pop());
        }
        System.out.println("Содержимое стека stack2:");
        for (int i = 0; i < 20; i++) {
            System.out.println(stack2.pop());
        }
    }
}
