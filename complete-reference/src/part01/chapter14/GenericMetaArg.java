package part01.chapter14;

/**
 * Пример метасимвольного аргумента (?) в методе обобщённого класса.
 * Вывод:
 * Среднее значение intGen = 3.0
 * Среднее значение dblGen = 3.3
 * Среднее значение fltGen = 3.0
 * Средние значения intGen и dblGen отличаются
 * Средние значения intGen и fltGen одинаковы
 */

class GenericNumberEx <T extends Number> {
    T[] nums;

    GenericNumberEx(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    /**
     * Метод сравнивает два средних значения объектов обобщённого класса.
     * Используется метасимвол (?), т.е. в качестве аргумента можно использовать
     * любой допустимый объект обобщённого класса GenericNumberEx.
     *
     * @param obj объект обобщённого класса
     * @return результат сравнения
     */
    boolean sameAverage(GenericNumberEx<?> obj) {
        if (average() == obj.average()) {
            return true;
        }
        return false;
    }
}

class GenericMetaArg {
    public static void main(String[] args) {
        Integer intNums[] = { 1, 2, 3, 4, 5 };
        GenericNumberEx<Integer> intGen = new GenericNumberEx<Integer>(intNums);
        double avg1 = intGen.average();
        System.out.println("Среднее значение intGen = " + avg1);

        Double dblNums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        GenericNumberEx<Double> dblGen = new GenericNumberEx<Double>(dblNums);
        double avg2 = dblGen.average();
        System.out.println("Среднее значение dblGen = " + avg2);

        Float fltNums[] = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f };
        GenericNumberEx<Float> fltGen = new GenericNumberEx<Float>(fltNums);
        double avg3 = fltGen.average();
        System.out.println("Среднее значение fltGen = " + avg3);

        System.out.print("Средние значения intGen и dblGen ");
        if (intGen.sameAverage(dblGen)) {
            System.out.println("одинаковы");
        } else {
            System.out.println("отличаются");
        }

        System.out.print("Средние значения intGen и fltGen ");
        if (intGen.sameAverage(fltGen)) {
            System.out.println("одинаковы");
        } else {
            System.out.println("отличаются");
        }
    }
}
