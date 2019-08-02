package part01.chapter14;

/**
 * Пример сравнения типов объектов в иерархии обобщённых классов
 * во время выполнения с помощью оператора instanceof.
 */

class GenSuper<T> {
    T obj;

    GenSuper(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }
}

class GenSub<T> extends GenSuper<T> {

    GenSub(T o) {
        super(o);
    }
}

class GenericInstanceof {
    public static void main(String[] args) {

        GenSuper<Integer> intSuper = new GenSuper<Integer>(300);

        GenSub<Integer> intSub = new GenSub<Integer>(333);
        GenSub<String>  strSub = new GenSub<String>("Строковое значение");

        if (intSub instanceof GenSub<?>)
            System.out.println("Объект intSub является экземпляром класса GenSub");     // true

        if (intSub instanceof GenSuper<?>)
            System.out.println("Объект intSub является экземпляром класса GenSuper");   // true

        if (strSub instanceof GenSub<?>)
            System.out.println("Объект strSub является экземпляром класса GenSub");     // true

        if (strSub instanceof GenSuper<?>)
            System.out.println("Объект strSub является экземпляром класса GenSuper");   // true

        if (intSuper instanceof GenSuper<?>)
            System.out.println("Объект intSuper является экземпляром класса GenSuper"); // true

        if (intSuper instanceof GenSub<?>)
            System.out.println("Объект intSuper является экземпляром класса GenSub");   // false

        // ошибка компиляции, так как сведения об обобщённом типе отсутствуют во время выполнения
        // (о конкретном аргументе типа <Integer>)
        // if (intSub instanceof GenSub<Integer>)
        //     System.out.println("Объект intSub является экземпляром класса GenSub<Integer>");
    }
}
