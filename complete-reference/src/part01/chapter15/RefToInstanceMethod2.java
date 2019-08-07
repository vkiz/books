package part01.chapter15;

/**
 * Обобщённый функциональный интерфейс.
 * @param <T> параметр типа
 */
interface GenFunc<T> {
    boolean func(T v1, T v2);
}

/**
 * Класс для хранения максимальной температуры воздуха за день.
 */
class HighTemp {

    private int val;

    HighTemp(int ht) {
        val = ht;
    }

    boolean sameTemp(HighTemp ht2) {
        return val == ht2.val;
    }

    boolean lessThanTemp(HighTemp hv2) {
        return val < hv2.val;
    }
}

/**
 * Пример использования ссылки на такой метод экземпляра, который будет использоваться
 * вместе с любым объектом данного класса, а не только с указанным объектом.
 * имя_класса::имя_метода_экземпляра
 */
class RefToInstanceMethod2 {
    /**
     * Метод, возвращающий количество экземпляров объекта,
     * найденных по критериям, задаваемым параметром функционального интерфейса GenFunc.
     *
     * @param vals входной массив объектов типа T
     * @param f ссылка на экземпляр функционального интерфейса, включая ссылку на метод
     * @param v ссылка на объект типа T (критерий поиска)
     * @param <T> параметр типа
     * @return количество экземпляров объекта в входном массиве, соответствующих критерию поиска
     */
    static <T> int counter(T[] vals, GenFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // массив максимальных температур воздуха за день
        HighTemp[] weekDayHighs1 = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(85), new HighTemp(84)
        };

        // ссылка на метод sameTemp() экземпляра передаётся методу counter() как аргумент;
        // используется имя_класса::имя_метода_экземпляра
        int count1 = counter(weekDayHighs1, HighTemp::sameTemp, new HighTemp(89));

        System.out.println("Количество дней, когда максимальная температура была равна 89 градусов: " + count1);    // 3

        // ссылка на метод lessThanTemp() экземпляра передаётся методу counter() как аргумент
        int count2 = counter(weekDayHighs1, HighTemp::lessThanTemp, new HighTemp(89));

        System.out.println("Количество дней, когда максимальная температура была меньше 89 градусов: " + count2);   // 3

        HighTemp[] weekDayHighs2 = {
                new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(17)
        };

        int count3 = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println("Количество дней, когда максимальная температура была равна 12 градусов: " + count3);    // 2

        int count4 = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println("Количество дней, когда максимальная температура была меньше 19 градусов: " + count4);   // 5
    }
}
