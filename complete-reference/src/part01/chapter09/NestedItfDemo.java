package part01.chapter09;

/**
 * Применение вложенного интерфейса.
 */

class A {
    // Вложенный интерфейс - член класса A
    public interface NestedItf {
        boolean isPositive(int x);
    }
}

// Класс B реализует вложенный интерфейс
class B implements A.NestedItf {

    @Override
    public boolean isPositive(int x) {
        return x >= 0;
    }
}

class NestedItfDemo {
    public static void main(String[] args) {

        // Ссылка на вложенный интерфейс
        A.NestedItf nif = new B();

        if (nif.isPositive(300)) {
            System.out.println("Число 300 положительное");
        }
    }
}
