package part01.chapter15;

/**
 * Функциональный интерфейс с абстрактным методом с одним целочисленным параметром n.
 */
interface NumericFunc {
    int func(int n);
}

/**
 * Функциональный интерфейс с абстрактным методом с одним строковым параметром s.
 */
interface StringFunc {
    String func(String s);
}

/**
 * Примеры лямбда-выражений, с телом, состоящим из из блока кода.
 * Такие лямбда-выражения называются блочными.
 */
class LambdaBlockExample {
    public static void main(String[] args) {

        // блочное лямбда-выражение вычисляет факториал целочисленного значения
        // оно подобно методу, тело заключается в фигурные скобки, return возвращает результат
        NumericFunc factorial = n -> {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res = i * res;
            }
            return res;
        };

        System.out.println("Факториал числа 3 равен " + factorial.func(3));
        System.out.println("Факториал числа 5 равен " + factorial.func(5));

        // блочное лямбда-выражение возвращает обратную строку
        StringFunc reverse = str -> {
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
