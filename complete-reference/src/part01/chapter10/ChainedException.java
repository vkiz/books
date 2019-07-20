package part01.chapter10;

/**
 * Пример обработки цепочки исключений.
 */
class ChainedException {

    static void meth() {
        // создать исключение
        NullPointerException ex = new NullPointerException("Исключение верхнего уровня.");

        // добавить причину исключения
        ex.initCause(new ArithmeticException("Исключение-причина."));

        // сгенерировать исключение
        throw ex;
    }

    public static void main(String[] args) {
        try {
            meth();
        } catch (NullPointerException ex) {
            System.out.println("Перехвачено исключение: " + ex);
            System.out.println("Причина исключения: " + ex.getCause());
        }
    }
}
