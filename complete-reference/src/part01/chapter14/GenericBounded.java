package part01.chapter14;

/**
 * Пример обобщённого класса с ограниченным параметром типа.
 * Вывод:
 * Среднее значение intGen = 3.0
 * Среднее значение dblGen = 3.3
 */

/**
 * Обобщённый класс.
 * @param <T> параметр типа Т может быть заменён только суперклассом java.lang.Number
 *            или его подклассами (например, Integer, Double и т.д.)
 */
class GenericNumber<T extends Number> {
    T[] nums; // массив класса Number или его подклассов
    GenericNumber(T[] o) {
        nums = o;
    }

    // расчёт среднего значения массива
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue(); // метод doubleValue() объявлен в классе Number
        }
        return sum / nums.length;
    }
}

class GenericBounded {
    public static void main(String[] args) {
        Integer intNums[] = { 1, 2, 3, 4, 5 };
        GenericNumber<Integer> intGen = new GenericNumber<Integer>(intNums);
        double avg1 = intGen.average();
        System.out.println("Среднее значение intGen = " + avg1);

        Double dblNums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        GenericNumber<Double> dblGen = new GenericNumber<Double>(dblNums);
        double avg2 = dblGen.average();
        System.out.println("Среднее значение dblGen = " + avg2);

        /*
        // Ошибка компиляции, т.к. класс String не наследуется от класса Number
        String strNums[] = { "1", "2", "3", "4", "5" };
        GenericNumber<String> strGen = new GenericNumber<String>(strNums);
        double avg3 = strGen.average();
        System.out.println("Среднее значение strGen = " + avg3);
        */
    }
}
