package part01.chapter07;

/**
 * Доступ к статической переменной, методу другого класса.
 */
class StaticDemo2 {
    static int a = 300;
    static int b = 100;

    static void printA() {
        System.out.println("a = " + a);
    }
}

class StaticByName {
    public static void main(String[] args) {
        // Используется имя класса и операция-точка
        StaticDemo2.printA();
        System.out.println("b = " + StaticDemo2.b);
    }
}
