package part01.chapter14;

/**
 * Пример использования обобщённого интерфейса.
 *
 * Вывод:
 * Максимальное значение в массиве ints = 10
 * Минимальное значение в массиве ints = 3
 * Максимальное значение в массиве chars = m
 * Минимальное значение в массиве chars = a
 */

/**
 * Обобщённый интерфейс.
 * @param <T> параметр типа
 */
interface MinMaxItf<T extends Comparable<T>> {
    T getMin();
    T getMax();
}

/**
 * Обобщённый класс, реализующий обобщённый интерфейс.
 *
 * Если бы класс реализовывал _конкретный тип_ обобщенного интерфейса (не _произвольный_ класс, реализующий Comparable,
 * а конкретный класс), то класс мог бы быть и необобщённым, например:
 * class MinMaxClass implements MinMaxItf<Integer> { // ... }
 *
 * @param <T> параметр типа
 */
class MinMaxClass<T extends Comparable<T>> implements MinMaxItf<T> {
    T[] vals;

    MinMaxClass(T[] o) {
        vals = o;
    }

    /**
     * Метод возвращает минимальное значение объекта из массива.
     * @return минимальное значение
     */
    @Override
    public T getMin() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }

    /**
     * Метод возвращает максимальное значение объекта из массива.
     * @return максимальное значение
     */
    @Override
    public T getMax() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}

class GenericInterface {
    public static void main(String[] args) {
        Integer ints[] = { 3, 5, 10, 9, 5};
        Character chars[] = { 'm', 'a', 'k', 'e'};

        MinMaxClass<Integer> intGen = new MinMaxClass<Integer>(ints);
        MinMaxClass<Character> charGen = new MinMaxClass<Character>(chars);

        System.out.println("Максимальное значение в массиве ints = " + intGen.getMax());
        System.out.println("Минимальное значение в массиве ints = " + intGen.getMin());

        System.out.println("Максимальное значение в массиве chars = " + charGen.getMax());
        System.out.println("Минимальное значение в массиве chars = " + charGen.getMin());
    }
}
