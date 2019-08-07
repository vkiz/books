package part01.chapter15;

/**
 * Функциональный интерфейс.
 */
interface StrFunc1 {
    String func(String n);
}

/**
 * Класс операций со строками.
 */
class StrOperations {
    /**
     * Статический метод возвращает обратную строку
     * (изменяет порядок символов в строке).
     * @param str исходная строка
     * @return обратная строка
     */
    static String strReverse(String str) {
        String res = "";
        int i;
        for (i = str.length()-1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}

/**
 * Пример использования ссылки на статический метод.
 * имя_класса::имя_статического_метода
 */
class RefToStaticMethod {
    /**
     * Метод обработки строки.
     * @param sf ссылка на экземпляр функционального интерфейса, включая ссылку на метод
     * @param s строка для обработки
     * @return обработанная строка
     */
    static String strMethod(StrFunc1 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "abcde";

        // ссылка на статический метод strReverse() передаётся методу strMethod() как аргумент
        // используется разделитель :: (двоеточие) - имя_класса::имя_статического_метода
        String outStr = strMethod(StrOperations::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обратная строка: " + outStr);
    }
}
