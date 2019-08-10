package part02.chapter16;

/**
 * Пример конкатенации (сцепления) строк с помощью операции "+".
 * Можно сцеплять строки с другими типами данных.
 * Но важно, что другие типы данных перед конкатенацией автоматически
 * преобразуются в строковое представление с помощью метода String.valueOf().
 * Для объектов метод String.valueOf() вызывает метод Object.toString().
 *
 * Также есть метод для конкатенации String.concat().
 */
class StringConcatenation {
    public static void main(String[] args) {

        String s0 = "Java ";            // "Java 8"
        s0 = s0 + "8";

        String s1 = "Очень " +          // "Очень длинная строка"
                "длинная " +
                "строка";

        String s2 = "3 + 5 = " + 3 + 5; // "3 + 5 = 35"

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);
    }
}
