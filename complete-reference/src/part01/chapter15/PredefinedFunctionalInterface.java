package part01.chapter15;

import java.util.function.Function;

/**
 * Пример использования предопределённого (встроенного в JDK) функционального интерфейса Function
 * из пакета java.util.function.
 */
class PredefinedFunctionalInterface {

    public static void main(String[] args) {

        // блочное лямбда-выражение вычисляет факториал целого числа
        // используется предопределённый функциональный интерфейс Function

        Function<Integer, Integer> factorial = n -> {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        };

        System.out.println("Факториал числа 3 равен " + factorial.apply(3)); // 6
        System.out.println("Факториал числа 5 равен " + factorial.apply(5)); // 120
    }
}
