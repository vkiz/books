package part01.chapter07;

/**
 * Статические переменные, методы, блоки кода.
 */
class StaticDemo {
    static int a = 100;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Статический блок инициализирован.");
        b = a * 3;
    }

    public static void main(String[] args) {
        meth(10);
    }
}
