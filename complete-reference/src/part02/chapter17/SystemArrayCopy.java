package part02.chapter17;

/**
 * Пример быстрого копирования массива.
 * Метод System.arraycopy() быстро копирует массив любого типа.
 * Скорость копирования намного быстрее, чем эквивалентного цикла, написанного на Java (т.к. это native-метод).
 * Можно копировать один и тот же источник и получатель в обоих направлениях.
 * Вывод:
 * a = ABCDEFGHIJ
 * b = cccccccccc
 * a = ABCDEFGHIJ
 * b = ABCDEFGHIJ
 * a = AABCDEFGHI
 * b = BCDEFGHIJJ
 */
class SystemArrayCopy {

    static byte a[] = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74 };
    static byte b[] = { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    public static void main(String[] args) {

        System.out.println("a = " + new String(a));
        System.out.println("b = " + new String(b));

        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println("a = " + new String(a));
        System.out.println("b = " + new String(b));

        System.arraycopy(a, 0, a, 1, a.length - 1);
        System.arraycopy(b, 1, b, 0, b.length - 1);
        System.out.println("a = " + new String(a));
        System.out.println("b = " + new String(b));
    }
}
