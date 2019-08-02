package part01.chapter14;

/**
 * Пример необобщённого класса с обобщённым конструктором.
 */
class GenericConstructor {
    private double val;

    /**
     * Обобщённый конструктор класса.
     * @param arg объект-аргумент может иметь тип T, производный от java.lang.Number (например, Integer, Double и т.д.)
     * @param <T> параметр обобщенного типа, ограничивает допустимый тип объекта-аргумента конструктора
     */
    <T extends Number> GenericConstructor(T arg) {
        val = arg.doubleValue();
    }

    void showVal() {
        System.out.println("Значение val = " + val);
    }

    public static void main(String[] args) {

        GenericConstructor obj1 = new GenericConstructor(300);
        obj1.showVal();

        GenericConstructor obj2 = new GenericConstructor(123.45);
        obj2.showVal();
    }
}
