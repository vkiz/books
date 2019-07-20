package part01.chapter10;

/**
 * Применение нескольких операторов catch.
 * Перехват исключений из подклассов должен следовать до перехвата исключений из суперклассов,
 * иначе исключения из подклассов вообще не будут обработаны (недостижимый код, ошибка компиляции).
 */
class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = 0;
            System.out.println("a = " + a);

            int b = 1 / a;
            int c[] = { 1, 2, 3 };
            c[10] = 100;

        } catch (ArithmeticException ex) {
            System.out.println("Ошибка деления на нуль: " + ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Ошибка индексации за переделом массива: " + ex);
        } catch (Exception ex) {
            System.out.println("Перехват исключений общего суперкласса Exception.");
        } /* catch (NullPointerException ex) { // ошибка компиляции
            System.out.println("Недостижимый код.");
        } */
        System.out.println("После блока операторов try/catch.");
    }
}
