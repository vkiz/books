package part01.chapter05;

/**
 * Оператор continue.
 */
class ContinueOperator {
    public static void main(String[] args) {

        System.out.println("Вывод двух чисел в каждой строке");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                continue;
            }
            System.out.println();
        }

        System.out.println("\nОператор continue с меткой");
        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();

        // Результат: треугольная таблица умножения чисел от 0 до 9
        /*  0
            0 1
            0 2 4
            0 3 6 9
            0 4 8 12 16
            0 5 10 15 20 25
            0 6 12 18 24 30 36
            0 7 14 21 28 35 42 49
            0 8 16 24 32 40 48 56 64
            0 9 18 27 36 45 54 63 72 81
        */
    }
}
