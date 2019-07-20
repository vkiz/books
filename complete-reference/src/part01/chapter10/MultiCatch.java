package part01.chapter10;

/**
 * Пример многократного перехвата исключений.
 * Будет выведено:
 * Перехвачено исключение: java.lang.ArithmeticException: / by zero
 * После многократного перехвата исключений.
 */
class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals[] = { 1, 2, 3 };
        try {
            int result = a / b; // ArithmeticException
            vals[10] = 100;     // ArrayIndexOutOfBoundsException

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Перехвачено исключение: " + ex);
        }
        System.out.println("После многократного перехвата исключений.");
    }
}
