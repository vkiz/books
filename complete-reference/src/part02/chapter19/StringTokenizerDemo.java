package part02.chapter19;

import java.util.StringTokenizer;

/**
 * Пример использования класса StringTokenizer.
 * Производится разбиение исходной строки in на лексемы
 * по символам-разделителям "=;".
 * Вывод:
 *
 * Название	Java. Полное руководство
 * Автор	Шилдт
 * Издательство	McGraw-Hill
 * Авторское право	2014
 */
class StringTokenizerDemo {

    static String in = "Название=Java. Полное руководство;" +
            "Автор=Шилдт;" +
            "Издательство=McGraw-Hill;" +
            "Авторское право=2014";

    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
