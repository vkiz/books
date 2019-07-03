package part01.chapter05;

/**
 * Оператор break с меткой перехода.
 */
class BreakOperator {
    public static void main(String[] args) {

        System.out.println("Оператор break в качестве goto");
        boolean b = true;
        first: {
            second: {
                third: {
                    System.out.println("До оператора break");
                    if (b) {
                        break second; // выход из блока кода second
                    }
                    System.out.println("Этот код не выполнится");
                }
                System.out.println("Этот код не выполнится");
            }
            System.out.println("После блока кода second");
        }

        System.out.println("\nОператор break для выхода из вложенных циклов");
        outer: for (int i = 0; i < 3; i++) {
            System.out.print("Итерация " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break outer; // выход из обоих циклов
                }
                System.out.print(j + " ");
            }
            System.out.println("Этот код не выполнится");
        }
        System.out.println("Циклы завершены");
    }
}
