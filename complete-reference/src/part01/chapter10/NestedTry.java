package part01.chapter10;

/**
 * Вложенные операторы try.
 */
class NestedTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            a = 1 / a;
            System.out.println("a = " + a);
            try {
                if (a == 1) {
                    a = a / 0;
                }
                if (a == 2) {
                    int b[] = { 1, 2, 3 };
                    b[10] = 100;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Индекс за пределами массива: " + ex);
            }
        } catch (ArithmeticException ex) {
            System.out.println("Деление на нуль: " + ex);
        }
    }
}
