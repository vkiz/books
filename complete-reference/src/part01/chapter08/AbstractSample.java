package part01.chapter08;

/**
 * Абстрактный класс.
 */
abstract class Abstr {
    // Объявление абстрактного метода (без реализации)
    abstract void doAction();

    // Абстрактный класс может содержать обычные методы (с реализацией)
    void doAction2() {
        System.out.println("Метод с реализацией в абстрактном классе Abstr");
    }
}

class Impl extends Abstr {
    // Переопределение (реализация) абстрактного метода
    @Override
    void doAction() {
        System.out.println("Реализация абстрактного метода в подклассе Impl");
    }
}
class AbstractSample {
    public static void main(String[] args) {
        Impl obj = new Impl();
        obj.doAction();
        obj.doAction2();
    }
}
