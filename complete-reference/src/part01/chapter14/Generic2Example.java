package part01.chapter14;

/**
 * Пример обобщённого класса с двумя параметрами типа.
 * Вывод:
 * Тип T: java.lang.Integer
 * Тип V: java.lang.String
 * Значение объекта типа T = 300
 * Значение объекта типа V = Строковое значение
 */

/**
 * Обобщённый класс Generic2.
 * @param <T> первый параметр типа
 * @param <V> второй параметр типа
 */
class Generic2<T,V> {
    T obj1;
    V obj2;

    Generic2(T o1, V o2) {
        obj1 = o1;
        obj2 = o2;
    }

    T getObj1() {
        return obj1;
    }

    V getObj2() {
        return obj2;
    }

    void showTypes() {
        System.out.println("Тип T: " + obj1.getClass().getName());
        System.out.println("Тип V: " + obj2.getClass().getName());
    }
}

class Generic2Example {
    public static void main(String[] args) {
        Generic2<Integer, String> genObj = new Generic2<Integer, String>(300, "Строковое значение");
        genObj.showTypes();
        int i = genObj.getObj1();
        String s = genObj.getObj2();
        System.out.println("Значение объекта типа T = " + i);
        System.out.println("Значение объекта типа V = " + s);

        // начиная с JDK 7 в new можно использовать пустой список аргументов типа - "ромбовидный оператор"
        // Generic2<Integer, String> genObj = new Generic2<>(300, "Строковое значение");
    }
}
