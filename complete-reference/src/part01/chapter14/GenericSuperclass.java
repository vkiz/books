package part01.chapter14;

/**
 * Пример иерархии обобщённых классов, в которой применяется обобщённый суперкласс.
 */

class GenericSuper<T> {
    T obj;

    GenericSuper(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }
}

/**
 * Подкласс GenericSub1 расширяет обобщённый класс GenericSuper.
 * В нём должны быть объявлены параметры типа, требующиеся его обобщённому суперклассу.
 * @param <T> параметр типа (унаследован от суперкласса)
 */
class GenericSub1<T> extends GenericSuper<T> {

    GenericSub1(T obj) {
        super(obj);
    }
}

/**
 * Подкласс GenericSub2 расширяет обобщённый класс GenericSuper.
 * Подкласс, если ему требуется, может быть дополнен своими дополнительными параметрами типа.
 * @param <T> первый параметр типа (унаследован от суперкласса)
 * @param <V> второй параметр типа (дополнительный, добавленный в подклассе)
 */
class GenericSub2<T, V> extends GenericSuper<T> {

    V obj2;

    GenericSub2(T o, V o2) {
        super(o);
        obj2 = o2;
    }

    V getObj2() {
        return obj2;
    }
}

class GenericSuperclass {
    public static void main(String[] args) {
        GenericSub2<Integer,String> sub2 = new GenericSub2<Integer,String>(300, "Строковое значение");
        System.out.println("Значение:");
        System.out.println("obj =  " + sub2.getObj());
        System.out.println("obj2 = " + sub2.getObj2());
    }
}
