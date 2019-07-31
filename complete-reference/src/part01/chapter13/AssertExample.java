package part01.chapter13;

/**
 * Пример использования утверждения (оператор assert).
 * Необходимо разрешить проверку утверждений во время выполнения
 * (VM options: -ea), иначе оператор assert будет пропущен.
 *
 * Вывод:
 * n > 0 и равно: 3
 * n > 0 и равно: 2
 * n > 0 и равно: 1
 * Exception in thread "main" java.lang.AssertionError: Ошибка: значение n <= 0!
 * at part01.chapter13.AssertExample.main(AssertExample.java:30)
 */
class AssertExample {

    static int val = 3;

    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getNum();

            // assert n > 0;

            assert n > 0 : "Ошибка: значение n <= 0!";

            System.out.println("n > 0 и равно: " + n);
        }
    }
}
