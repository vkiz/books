package part02.chapter17;

/**
 * Простой класс A.
 */
class A {
    int a;
    double b;
}

/**
 * Простой подкласс B суперкласса A.
 */
class B extends A {
    String c;
}

/**
 * Пример получения информации о классе объекта во время выполнения.
 */
class ClassInfo {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        Class<?> cls;

        cls = obj1.getClass();
        System.out.println("Объект obj1 имеет тип " + cls.getName());               // part02.chapter17.A

        cls = obj2.getClass();
        System.out.println("Объект obj2 имеет тип " + cls.getName());               // part02.chapter17.B

        cls = cls.getSuperclass();
        System.out.println("Суперкласс объекта obj2 имеет тип " + cls.getName());   // part02.chapter17.A
    }
}
