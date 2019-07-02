package part01.chapter04;

/**
 * Логические операции.
 */
class LogicalOperations {
    public static void main(String[] args) {

        System.out.println("Логические операции");
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a | b = " + c);
        System.out.println("a & b = " + d);
        System.out.println("a ^ b = " + e);
        System.out.println("(!a & b) | (a & !b) = " + f);
        System.out.println("!a = " + g);

        System.out.println("\nТернарная логическая операция");
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; // получение абсолютного значения переменной i (модуля)
        System.out.println("Абсолютное значение числа " + i + " равно " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолютное значение числа " + i + " равно " + k);
    }
}
