package part01.chapter09;

/**
 * Абстрактный класс (не реализует метод интерфейса Callback).
 */
abstract class AbstractClass implements Callback {
    int a;
    void show() {
        System.out.println("a = " + a);
    }
}
