package part01.chapter10;

/**
 * Пример объявления метода с оператором throws.
 */
class ThrowsDemo {
    static void meth() throws ArithmeticException {
        System.out.println("Выполнение метода meth().");
        throw new ArithmeticException("Генерация исключения.");
    }

    public static void main(String[] args) {
        try {
            meth();
        } catch (ArithmeticException ex) {
            System.out.println("Перехвачено исключение: " + ex);
        }
    }
}
