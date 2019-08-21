package part02.chapter19;

import java.util.BitSet;

/**
 * Пример использования класса BitSet.
 */
class BitSetDemo {
    public static void main(String[] args) {

        // значения всех битов в наборах равны false
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // установить некоторые биты в наборах (значением true)
        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bits1.set(i);
            if ((i % 5) != 0) bits2.set(i);
        }

        // вывод в консоль начального значения битов в наборах
        // выводятся номера позиций битов со значением true,
        // номера битов со значением false не выводятся
        System.out.println("Начальное значение набора битов bits1:");
        System.out.println(bits1); // {0, 2, 4, 6, 8, 10, 12, 14}
        System.out.println("Начальное значение набора битов bits2:");
        System.out.println(bits2); // {1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14}

        // выполнение логической операции "И" над битами
        bits2.and(bits1); // bits2 = bits2 AND bits1
        System.out.println("bits2 AND bits1:");
        System.out.println(bits2); // {2, 4, 6, 8, 12, 14}

        // выполнение логической операции "ИЛИ" над битами
        bits2.or(bits1); // bits2 = bits2 OR bits1
        System.out.println("bits2 OR bits1:");
        System.out.println(bits2); // {0, 2, 4, 6, 8, 10, 12, 14}

        // выполнение логической операции "Исключающее ИЛИ" над битами
        bits2.xor(bits1); // bits2 = bits2 XOR bits1
        System.out.println("bits2 XOR bits1:");
        System.out.println(bits2); // {}
    }
}
