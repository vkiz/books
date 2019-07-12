package part01.chapter08;

/**
 * Динамическая диспетчеризация методов.
 * Вывод программы:
 * Выполнение метода doAction() класса ClassA
 * Выполнение метода doAction() класса ClassB
 * Выполнение метода doAction() класса ClassC
 */
class ClassA {
    void doAction() {
        System.out.println("Выполнение метода doAction() класса ClassA");
    }
}

class ClassB extends ClassA {
    // Переопределение метода
    @Override
    void doAction() {
        System.out.println("Выполнение метода doAction() класса ClassB");
    }
}

class ClassC extends ClassA {
    // Переопределение метода
    @Override
    void doAction() {
        System.out.println("Выполнение метода doAction() класса ClassC");
    }
}

/**
 * Динамическая диспетчеризация методов
 */
class DynDispatchMethod {
    public static void main(String[] args) {
        ClassA a = new ClassA();    // объект класса ClassA
        ClassB b = new ClassB();    // объект класса ClassB
        ClassC c = new ClassC();    // объект класса ClassC

        ClassA r;                   // ссылка на объект типа ClassA

        r = a;                      // теперь переменная r ссылается на объект типа ClassA
        r.doAction();               // вызов метода doAction(), определённого в классе ClassA

        r = b;                      // теперь переменная r ссылается на объект типа ClassB
        r.doAction();               // вызов метода doAction(), определённого в классе ClassB

        r = c;                      // теперь переменная r ссылается на объект типа ClassC
        r.doAction();               // вызов метода doAction(), определённого в классе ClassC
    }
}
