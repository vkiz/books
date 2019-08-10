package part02.chapter16;

import java.util.Arrays;

/**
 * Примеры методов сравнения значений строк
 * equals(), equalsIgnoreCase(), regionMatches(), startsWith(), endsWith(), compareTo(), compareTo().
 * Отличие метода equals() от операции "==":
 * equals() сравнивает _значения_ строк, а операция "==" сравнивает _ссылки_ на объекты строк.
 */
class StringCompare {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Goodbye";
        String s4 = "HELLO";
        String s5 = new String(s1); // значения строк идинаковые, но ссылки на объекты разные (s1 != s5)

        // сравнение значений строк на равенство
        System.out.println(s1 + " равно " + s2 + " = " + s1.equals(s2)); // true
        System.out.println(s1 + " равно " + s3 + " = " + s1.equals(s3)); // false
        System.out.println(s1 + " равно " + s4 + " = " + s1.equals(s4)); // false
        System.out.println(s1 + " равно без учёта регистра " + s4 + " = " + s1.equalsIgnoreCase(s4)); // true

        // сравнение значений подстрок на равенство (подстрок начиная с символа с индексом 1 и длиной 3 символа)
        System.out.println("Подстрока строки s1 равна подстроке s2 = " + s1.regionMatches(1, s2, 1, 3)); // "ell" == "ell", true
        System.out.println("Подстрока строки s1 равна без учёта регистра подстроке s4 = " + s1.regionMatches(true, 1, s4, 1, 3)); // "ell" == "ELL", true

        // сравнение значений подстрок с начала или с конца строки
        System.out.println("Строка " + s3 + " начинается с подстроки Good = " + s3.startsWith("Good")); // true
        System.out.println("Строка " + s3 + " завершается подстрокой buy = " + s3.endsWith("bye"));     // true

        // сравнение значений подстроки с начала строки начиная с символа с индексом 1
        System.out.println("Строка " + s3 + " с символа с индексом 1 начинается с подстроки ood = " + s3.startsWith("ood", 1)); // true

        // equals() сравнивает значения строк, а операция "==" сравнивает ссылки на объекты строк
        System.out.println("Значение строки " + s1 + " равно значению строки " + s5 + " = " + s1.equals(s5)); // true
        System.out.println("Ссылка на объект строки " + s1 + " равна ссылке на объект строки " + s5 + " = " + (s1 == s5)); // false

        // compareTo() сравнивает значения строк лексикографически (меньше, больше или равно 0)
        // использование compareTo() на примере пузырьковой сортировки строк по возрастанию
        String arr[] = { "Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid", "of", "their", "country" };
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
        // [Now, aid, all, come, country, for, good, is, men, of, the, the, their, time, to, to]
        System.out.println(Arrays.toString(arr));
    }
}
