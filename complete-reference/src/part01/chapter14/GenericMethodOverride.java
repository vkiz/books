package part01.chapter14;

/**
 * Пример переопределения метода обобщённого класса.
 * Вывод:
 * Выполняется метод getObj() из класса GenSuper1: 100
 * Выполняется метод getObj() из класса GenSub1: 300
 * Выполняется метод getObj() из класса GenSub1: Строковое значение
 */

class GenSuper1<T> {
    T obj;

    GenSuper1(T o) {
        obj = o;
    }

    T getObj() {
        System.out.print("Выполняется метод getObj() из класса GenSuper1: ");
        return obj;
    }
}

class GenSub1<T> extends GenSuper1<T> {

    GenSub1(T o) {
        super(o);
    }

    /**
     * Переопределённый метод.
     * @return возвращаемое значение
     */
    @Override
    T getObj() {
        System.out.print("Выполняется метод getObj() из класса GenSub1: ");
        return obj; // поле obj унаследовано от суперкласса GenSuper1
    }
}

class GenericMethodOverride {
    public static void main(String[] args) {

        GenSuper1<Integer> intSuper = new GenSuper1<Integer>(100);
        GenSub1<Integer> intSub = new GenSub1<Integer>(300);
        GenSub1<String>  strSub = new GenSub1<String>("Строковое значение");

        System.out.println(intSuper.getObj());
        System.out.println(intSub.getObj());
        System.out.println(strSub.getObj());
    }
}
