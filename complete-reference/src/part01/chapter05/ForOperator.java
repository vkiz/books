package part01.chapter05;

/**
 * Оператор цикла for.
 */
class ForOperator {
    public static void main(String[] args) {

        System.out.println("Цикл for");
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i); // значения от 10 до 1
        }

        System.out.println("\nПроверка простое ли число");
        int num = 17;
        boolean isPrime;

        if (num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - не простое число");
        }

        System.out.println("\nЗапятая в цикле for:\n" +
                "Несколько операторов в инициализирующей и итерационной частях");
        for (int a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        System.out.println("\nУправляющим условием может быть любое логическое выражение");
        boolean done = false;
        for (int i = 1; !done; i++) {
            // ...
            /* if (...) */
            done = true;
        }

        System.out.println("\nОтсутствие инициализирующего и итерационного выражений");
        int i = 0;
        done = false;
        for ( ; !done; ) {
            System.out.println("i = " + i); // значения от 0 до 10
            if (i == 10) {
                done = true;
            }
            i++;
        }

        /* Бесконечный цикл:
        for ( ; ; ) {
            // тело цикла
        }
        */

        System.out.println("\nОператор в стиле for each");
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int x : nums) {
            System.out.println("nums item = " + x);
        }
    }
}
