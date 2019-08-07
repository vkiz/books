package part01.chapter15;

/**
 * Обобщённый класс.
 * @param <T> параметр типа
 */
class GenClass2<T> {

    private T val;

    /**
     * Конструктор, принимающий один аргумент типа T.
     * @param v параметр конструктора
     */
    GenClass2(T v) {
        val = v;
    }

    /**
     * Конструктор по умолчанию.
     */
    GenClass2() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

/**
 * Обобщённый функциональный интерфейс,
 * метод которого возвращает ссылку на обобщённый класс GenClass2<T>.
 * @param <T> параметр типа обобщённого класса GenClass2<T>
 */
interface GenFunc2<T> {
    GenClass2<T> func(T n);
}

/**
 * Пример использования ссылки на конструктор обобщённого класса.
 */
class RefToGenericConstructor {

    public static void main(String[] args) {

        // создание ссылки на конструктор обобщённого класса GenClass2<T>, работающего с числами;
        // в параметр типа T обобщённого класса передаётся тип Integer
        GenFunc2<Integer> intConstr = GenClass2<Integer>::new;

        // создание экземпляра обобщённого класса, используя ссылку на его конструктор
        GenClass2<Integer> intObj = intConstr.func(100);

        System.out.println("Значение val в объекте intObj равно: " + intObj.getVal()); // 100

        // создание ссылки на конструктор обобщённого класса GenClass2<T>, работающего со строками;
        // в параметр типа T обобщённого класса передаётся тип String
        GenFunc2<String> strConstr = GenClass2<String>::new;

        GenClass2<String> strObj = strConstr.func("abcde");

        System.out.println("Значение val в объекте strObj равно: " + strObj.getVal()); // abcde
    }
}
