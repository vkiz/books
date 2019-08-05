package part01.chapter15;

/**
 * Функциональный интерфейс.
 */
interface StrFunc {
    String func(String n);
}

/**
 * Пример передачи лямбда-выражения в качестве аргумента метода.
 */
class LambdaAsArgument {

    static String strMethod(StrFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Значение исходной строки";
        System.out.println("Исходная строка: " + inStr);

        // передача лямбда-выражений в качестве аргумента метода strMethod

        // одиночное лямбда-выражение преобразует символы строки в верхний регистр
        String outStr1 = strMethod(str -> str.toUpperCase(), inStr);

        System.out.println("Строка в верхнем регистре: " + outStr1);

        // блочное лямбда-выражение удаляет из строки все пробелы
        // (напрямую встроено в вызов метода)
        String outStr2 = strMethod(str -> {
            String res = "";
            int i;
            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    res += str.charAt(i);
                }
            }
            return res;
        }, inStr);

        System.out.println("Строка с удалёнными пробелами: " + outStr2);

        // блочное лямбда-выражение возвращает обратную строку
        // (присвоено переменной ссылки на функциональный интерфейс "reverse")
        StrFunc reverse = str -> {
            String res = "";
            int i;
            for (i = str.length()-1; i >= 0; i--) {
                res += str.charAt(i);
            }
            return res;
        };

        System.out.println("Исходная строка обращается в строку: " + strMethod(reverse, inStr));
    }
}
