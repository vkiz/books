package part01.chapter05;

/**
 * Оператор цикла while.
 */
class WhileOperator {
    public static void main(String[] args) {

        System.out.println("Оператор цикла while");
        int n = 10;
        while (n > 0) {
            System.out.println("n = " + n); // значения от 10 до 1
            n--;
        }

        System.out.println("\nПустое тело цикла while");
        int i = 100;
        int j = 200;
        // расчёт среднего значения переменных i и j
        while (++i < --j) ; // отсутствует тело цикла
        System.out.println("Среднее значение 100 и 200 = " + i); // 150
    }
}
