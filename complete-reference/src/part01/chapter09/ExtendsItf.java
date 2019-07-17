package part01.chapter09;

/**
 * Пример расширения интерфейсов.
 */

interface ItfA {
    void meth1();
    void meth2();
}

/**
 * Интерфейс ItfB расширяет интерфейс ItfA.
 * Теперь он включает в себя методы из ItfA и метод meth3().
 */
interface ItfB extends ItfA {
    void meth3();
}

class ImplClass implements ItfB {

    @Override
    public void meth1() {
        System.out.println("Реализация метода meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("Реализация метода meth2().");
    }

    @Override
    public void meth3() {
        System.out.println("Реализация метода meth3().");
    }
}

class ExtendsItf {
    public static void main(String[] args) {
        ImplClass obj = new ImplClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
