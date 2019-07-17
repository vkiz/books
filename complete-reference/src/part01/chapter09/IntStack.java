package part01.chapter09;

/**
 * Определение интерфейса для целочисленного стека.
 */
interface IntStack {
    void push(int item);    // поместить элемент в стек
    int pop();              // извлечь элемент из стека

    default void clear() {
        System.out.println("Метод с реализацией по умолчанию.");
        throw new UnsupportedOperationException("Метод clear() не реализован.");
    }
}
