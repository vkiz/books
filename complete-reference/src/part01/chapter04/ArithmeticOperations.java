package part01.chapter04;

/**
 * Арифметические операции.
 */
class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("Арифметика целых чисел");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;  // c = 1 (т.к. 6 / 4 = 1.5, но из-за типа int отбрасывается дробная часть)
        int d = c - a;
        int e = -d;     // унарный минус - смена знака
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("\nАрифметика чисел с плавающей точкой");
        double da = 1 + 1;  // da = 2.0
        double db = da * 3;
        double dc = db / 4; // dc = 1.5
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);

        System.out.println("\nОперация деления по модулю - остаток от деления");
        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 = " + x % 10); // 2
        System.out.println("y mod 10 = " + y % 10); // 2.25

        System.out.println("\nОперации с присваиванием");
        a = 1;
        b = 2;
        c = 3;
        a += 5;     // 6
        b *= 4;     // 8
        c += a * b; // 51
        c %= 6;     // 3
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("\nОперации инкремента в постфиксной и префиксной формах");
        a = 1;
        b = 2;
        c = ++b; // c = 3. Префиксная - операция предшествует операнду
        d = a++; // d = 1. Постфиксная - операция следует за операндом
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
