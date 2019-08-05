package part01.chapter15;

/**
 * Обобщённый функциональный интерфейс.
 * @param <T> параметр типа
 */
interface GenericFunc<T> {
    T func(T arg);
}

/**
 * Пример использования обобщённого функционального интерфейса в лямбда-выражениях.
 */
class GenericFunctionalInterface {
    public static void main(String[] args) {

        // блочное лямбда-выражение вычисляет факториал целого числа
        // используется целочисленный вариант интерфейса GenericFunc
        GenericFunc<Integer> factorial = n -> {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        };

        System.out.println("Факториал числа 3 равен " + factorial.func(3));
        System.out.println("Факториал числа 5 равен " + factorial.func(5));

        // блочное лямбда-выражение возвращает обратную строку
        // используется строковый вариант интерфейса GenericFunc
        GenericFunc<String> reverse = str -> {
            String res = "";
            int i;
            for (i = str.length()-1; i >= 0; i--) {
                res += str.charAt(i);
            }
            return res;
        };

        System.out.println("Строка 'abcde' обращается на строку '" + reverse.func("abcde") + "'"); // edcba
        System.out.println("Строка '12345' обращается на строку '" + reverse.func("12345") + "'"); // 54321
    }
}
