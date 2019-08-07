package part01.chapter15;

/**
 * Обобщённый функциональный интерфейс.
 * @param <T> параметр типа
 */
interface GenFunc1<T> {
    int func(T[] vals, T v);
}

/**
 * Необобщённый класс операций с массивом.
 */
class ArrayOperations {
    /**
     * Обобщённый метод, возвращающий количество элементов в массиве, равных указанному значению.
     *
     * @param vals входной массив объектов типа T
     * @param v ссылка на объект типа T (критерий поиска)
     * @param <T> параметр типа
     * @return количество экземпляров объекта в входном массиве, соответствующих критерию поиска
     */
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) {
                count++;
            }
        }
        return count;
    }
}

/**
 * Пример использования ссылки на обобщённый метод, объявленный в необобщённом классе.
 */
class RefToGenericMethod1 {

    /**
     * Метод, возвращающий количество экземпляров объекта,
     * найденных по критериям, задаваемым параметром функционального интерфейса GenFunc1.
     *
     * @param f ссылка на экземпляр функционального интерфейса, включая ссылку на метод
     * @param vals входной массив объектов типа T
     * @param v ссылка на объект типа T (критерий поиска)
     * @param <T> параметр типа
     * @return количество экземпляров объекта в входном массиве, соответствующих критерию поиска
     */
    static <T> int arrayMethod(GenFunc1<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {

        Integer[] intArray = { 1, 2, 3, 4, 5, 3, 7, 3, 5, 10 };
        String[]  strArray = { "abc", "aaa", "bbb", "ccc", "abc" };

        // ссылка на обобщённый статический метод countMatching() передаётся методу arrayMethod() как аргумент

        // в параметр типа обобщённого метода передаётся тип Integer
        int count1 = arrayMethod(ArrayOperations::<Integer>countMatching, intArray, 3);

        // в параметр типа обобщённого метода передаётся тип String
        int count2 = arrayMethod(ArrayOperations::<String>countMatching, strArray, "abc");

        System.out.println("Количество чисел 3 в массиве intArray: " + count1);         // 3
        System.out.println("Количество строк \"abc\" в массиве strArray: " + count2);   // 2
    }
}
