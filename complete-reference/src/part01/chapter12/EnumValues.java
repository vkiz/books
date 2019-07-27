package part01.chapter12;

/**
 * Использование методов values() и valueOf():
 * values() возвращает массив, содержащий список констант перечислимого типа;
 * valueOf(String строка) возвращает константу перечислимого типа,
 * соответствующую переданному значению символьной строки (аргументу).
 * Вывод:
 * Константы перечислимого типа Apple1:
 * Jonathan
 * GoldenDel
 * RedDel
 * Winesap
 * Cortland
 * Переменная ap содержит Winesap
 */

enum Apple1 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumValues {

    public static void main(String[] args) {

        System.out.println("Константы перечислимого типа Apple1:");
        Apple1[] apples = Apple1.values();
        for (Apple1 a : apples) {
            System.out.println(a);
        }

        /* или:
        for (Apple1 a : Apple1.values()) {
            System.out.println(a);
        }
        */

        Apple1 ap = Apple1.valueOf("Winesap");
        System.out.println("Переменная ap содержит " + ap);
    }
}
