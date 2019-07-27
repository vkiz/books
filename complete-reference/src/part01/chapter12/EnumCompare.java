package part01.chapter12;

/**
 * Использование методов:
 *
 * final int ordinal() - возвращает порядковый номер (позицию начиная с нуля) константы в списке констант перечисления;
 *
 * final int compareTo(тип_перечисления константа) - сравнивает порядковые номера двух констант одного и того же
 * перечислимого типа (отрицательное если меньше чем 'константа', нуль если равно, положительное если больше);
 *
 * final boolean equals() - сравнивает на равенство с другим объектом (равно, если они ссылаются на одну и ту же константу
 * из одного и того же перечисления).
 *
 * Две ссылки на перечисления можно сравнивать на равенство с помощью операции ==
 */

enum Apple3 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumCompare {
    public static void main(String[] args) {

        System.out.println("Константы перечисления и их порядковые номера:");

        for (Apple3 a : Apple3.values()) {
            System.out.println("Константа " + a + " номер " + a.ordinal());
        }

        Apple3 ap1, ap2, ap3;

        ap1 = Apple3.RedDel;
        ap2 = Apple3.GoldenDel;
        ap3 = Apple3.RedDel;

        System.out.println("\nСравнение порядковых номеров констант перечисления:");

        if (ap1.compareTo(ap2) < 0) { // false
            System.out.println(ap1 + " предшествует " + ap2);
        }
        if (ap1.compareTo(ap2) > 0) { // true
            System.out.println(ap2 + " предшествует " + ap1);
        }
        if (ap1.compareTo(ap3) == 0) { // true
            System.out.println(ap1 + " равно " + ap3);
        }

        System.out.println("\nСравнение констант перечисления на равенство:");

        if (ap1.equals(ap2)) {  // false
            System.out.println("ap1 равно ap2");
        }
        if (ap1.equals(ap3)) {  // true
            System.out.println("ap1 равно ap3");
        }
        if (ap1 == ap3) {       // true
            System.out.println("ap1 == ap3");
        }
    }
}
