package part01.chapter10;

/**
 * Пример генерации исключения (throw) двумя способами:
 * new (1), параметр в catch (2).
 */

class ThrowDemo {
    private static void meth() {
        try {
            throw new NullPointerException("Генерация исключения.");        // 1
        } catch (NullPointerException ex) {                                 // 2
            System.out.println("Исключение перехвачено в методе meth().");
            throw ex;                                                       // 2, повторная генерация исключения
        }
    }

    public static void main(String[] args) {
        try {
            meth();
        } catch (NullPointerException ex) {
            System.out.println("Повторный перехват исключения: " + ex);
        }
    }
}
