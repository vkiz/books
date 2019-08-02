package part01.chapter14;

/**
 * Пример применения обобщённого класса без аргументов.
 * Это приводит к созданию базового типа ("сырого") для класса.
 * Базовый тип совместим с унаследованным кодом (где нет обобщений), но утрачивается типовая безопасность, т.е.
 * при приведении типов, несовместимых друг с другом не будет ошибки компиляции, но будет ошибка во время выполнения.
 * Вывод:
 * Значение объекта = 123.45
 * Exception in thread "main" java.lang.ClassCastException: java.lang.Double cannot be cast to java.lang.Integer
 * at part01.chapter14.GenericBaseType.main(GenericBaseType.java:48)
 */

/**
 * Обобщённый класс.
 * @param <T> параметр типа
 */
class Generic1<T> {
    T obj;

    Generic1(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }
}

class GenericBaseType {
    public static void main(String[] args) {

        Generic1<Integer> intObj = new Generic1<Integer>(300);
        Generic1<String> strObj = new Generic1<String>("Строковое значение");

        // создание объекта базового типа Generic1 ("сырого", т.е. без аргумента типа, вместо Generic1<Double>)
        // и присвоение ему значения типа Double
        Generic1 raw = new Generic1(new Double(123.45));

        // требуется приведение типов, поскольку тип неизвестен;
        // правильность выбора типа контролирует программист, а не компилятор
        double d = (Double) raw.getObj();
        System.out.println("Значение объекта = " + d);

        // весь код ниже компилируется без ошибки, но ошибка во время выполнения
        // присваивание нарушает типовую безопасность

        int i = (Integer) raw.getObj();

        strObj = raw;
        String s = strObj.getObj();

        raw = intObj;
        d = (Double) raw.getObj();
    }
}
