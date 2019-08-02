package part01.chapter14;

/**
 * Пример использования обобщённого метода.
 *
 * В данном примере обобщённый метод:
 * а) является членом необобщённого класса;
 * б) объявлен статическим, т.е. может быть использован независимо ни от какого объекта.
 */

class GenericMethod {

    /**
     * Метод isInArray() определяет содержится ли объект в массиве.
     * @param x первый параметр метода - объект для поиска
     * @param y второй параметр метода - массив объектов, где осуществляется поиск
     * @param <T> первый параметр типа - определяет объекты какого типа можно искать (те, которые могут быть
     *            упорядочены и, соответственно, которые можно сравнивать - реализующие интерфейс java.lang.Comparable)
     * @param <V> второй параметр типа - тот же тип, что и первого параметра типа или типа его подкласса
     * @return результат поиска: true, если искомый объект содержится в массиве
     */
    static <T extends Comparable<T>, V extends T> boolean isInArray(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // использование метода для целых чисел

        Integer nums[] = { 1, 2, 3, 4, 5 };

        if (isInArray(3, nums))
            System.out.println("Число 3 содержится в массиве nums");

        if (!isInArray(7, nums))
            System.out.println("Число 7 отсутствует в массиве nums");

        // использование метода для строк

        String strs[] = { "one", "two", "three", "four", "five" };

        if (isInArray("three", strs))
            System.out.println("Строка three содержится в массиве strs");

        if (!isInArray("seven", strs))
            System.out.println("Строка seven отсутствует в массиве strs");
    }
}
