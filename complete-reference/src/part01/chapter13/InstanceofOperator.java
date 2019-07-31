package part01.chapter13;

/**
 * Пример использования оператора instanceof.
 */

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

class InstanceofOperator {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) System.out.println("a является экземпляром класса A"); // true
        if (b instanceof B) System.out.println("b является экземпляром класса B"); // true
        if (c instanceof C) System.out.println("c является экземпляром класса C"); // true

        if (c instanceof A) System.out.println("c можно привести к типу A"); // true
        if (a instanceof C) System.out.println("a можно привести к типу C"); // false

        A obj;

        obj = d; // ссылка на объект d
        System.out.println("\nobj теперь ссылается на d");
        if (obj instanceof D) System.out.println("obj является экземпляром D");  // true

        obj = c; // ссылка на объект c
        System.out.println("\nobj теперь ссылается на c");
        if (obj instanceof D) System.out.println("obj можно привести к типу D"); // false
        else System.out.println("obj нельзя привести к типу D");

        if (obj instanceof A) System.out.println("obj можно привести к типу A"); // true

        System.out.println("\nВсе объекты могут быть приведены к типу Object");

        if (a instanceof Object) System.out.println("a можно привести к типу Object"); // true
        if (b instanceof Object) System.out.println("b можно привести к типу Object"); // true
        if (c instanceof Object) System.out.println("c можно привести к типу Object"); // true
        if (d instanceof Object) System.out.println("d можно привести к типу Object"); // true
    }
}
