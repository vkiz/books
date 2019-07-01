package part01.chapter03;

/**
 * Динамическая инициализация переменной.
 */
class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;
        double c = Math.sqrt(a * a + b * b); // динамическая инициализация
        System.out.println("Гипотенуза c = " + c);
    }
}
