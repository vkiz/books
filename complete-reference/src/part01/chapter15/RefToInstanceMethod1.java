package part01.chapter15;

/**
 * Функциональный интерфейс.
 */
interface StrFunc2 {
    String func(String n);
}

/**
 * Класс операций со строками.
 */
class StrOperations2 {
    /**
     * Метод (не статический) возвращает обратную строку
     * (изменяет порядок символов в строке).
     * @param str исходная строка
     * @return обратная строка
     */
    String strReverse(String str) {
        String res = "";
        int i;
        for (i = str.length()-1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}

/**
 * Пример использования ссылки на метод экземпляра.
 * ссылка_на_объект::имя_метода
 */
class RefToInstanceMethod1 {
    /**
     * Метод обработки строки.
     * @param sf ссылка на экземпляр функционального интерфейса, включая ссылку на метод
     * @param s строка для обработки
     * @return обработанная строка
     */
    static String strMethod(StrFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "abcde";

        // создание объекта (экземпляра класса)
        StrOperations2 strOps = new StrOperations2();

        // ссылка на метод strReverse() объекта strOps передаётся методу strMethod() как аргумент;
        // используется ссылка_на_объект::имя_метода
        String outStr = strMethod(strOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обратная строка: " + outStr);
    }
}
