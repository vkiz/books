package part01.chapter15;

/**
 * Обобщённый класс.
 * @param <T> параметр типа
 */
class GenClass3<T> {

    private T val;

    /**
     * Конструктор, принимающий один аргумент типа T.
     * @param v параметр конструктора
     */
    GenClass3(T v) {
        val = v;
    }

    /**
     * Конструктор по умолчанию.
     */
    GenClass3() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

/**
 * Обычный необобщённый класс.
 */
class NonGenClass3 {

    private String val;

    /**
     * Конструктор, принимающий один аргумент (строку).
     * @param s параметр конструктора
     */
    NonGenClass3(String s) {
        val = s;
    }

    /**
     * Конструктор по умолчанию.
     */
    NonGenClass3() {
        val = "";
    }

    String getVal() {
        return val;
    }
}

/**
 * Обобщённый функциональный интерфейс.
 * @param <R> параметр типа (тип возвращаемого методом объекта)
 * @param <T> параметр типа (тип объекта, передаваемого в параметр метода)
 */
interface GenFunc3<R, T> {
    R func(T n);
}

/**
 * Пример использования ссылки на конструктор обобщённого класса.
 * Для создания экземпляров класса с любыми параметрами типа используется статический фабричный метод.
 */
class RefToGenericConstructorFactory {

    /**
     * Фабричный метод для создания объектов класса любого типа, реализующего интерфейс GenFunc3<R, T>.
     * Можно создать объект любого типа R, имеющего конструктор, совместимый с параметром T.
     *
     * @param constr ссылка на конструктор класса
     * @param v значение параметра конструктора (аргумент)
     * @param <R> параметр типа (тип создаваемого методом объекта)
     * @param <T> параметр типа (тип данных параметра конструктора)
     * @return ссылка на созданный объект типа R
     */
    static <R, T> R factoryMethod(GenFunc3<R, T> constr, T v) {
        return constr.func(v);
    }

    public static void main(String[] args) {

        // создание ссылки на конструктор обобщённого класса GenClass3<T>, работающего с целыми числами;
        // в параметр типа T обобщённого класса передаётся тип Integer
        GenFunc3<GenClass3<Integer>, Integer> genConstr1 = GenClass3<Integer>::new;

        // создание экземпляра обобщённого класса, используя ссылку на его конструктор и фабричный метод
        GenClass3<Integer> genObj1 = factoryMethod(genConstr1, 100);

        System.out.println("Значение val в объекте genObj1 равно: " + genObj1.getVal()); // 100

        // создание ссылки на конструктор обобщённого класса, работающего с дробными числами;
        // в параметр типа T обобщённого класса передаётся тип Double
        GenFunc3<GenClass3<Double>, Double> genConstr2 = GenClass3<Double>::new;

        GenClass3<Double> genObj2 = factoryMethod(genConstr2, 123.45);

        System.out.println("Значение val в объекте genObj2 равно: " + genObj2.getVal()); // 123.45

        // создание ссылки на конструктор необобщённого класса NonGenClass3
        GenFunc3<NonGenClass3, String> nonGenConstr = NonGenClass3::new;

        // создание экземпляра необобщённого класса
        NonGenClass3 nonGenObj = factoryMethod(nonGenConstr, "abcde");

        System.out.println("Значение val в объекте nonGenObj равно: " + nonGenObj.getVal()); // abcde
    }
}
