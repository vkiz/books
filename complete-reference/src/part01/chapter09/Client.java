package part01.chapter09;

/**
 * Класс, реализующий интерфейс.
 */
class Client implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Вызов метода callback(), значение p = " + p);
    }

    void nonItfMethod() {
        System.out.println("Вызов метода nonItfMethod() - собственного метода класса");
    }
}
