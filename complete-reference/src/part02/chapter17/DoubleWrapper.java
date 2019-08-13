package part02.chapter17;

/**
 * Пример создания объекта типа Double из примитивного типа и его строкового значения.
 * По стандарту IEEE определены специальные значения типа Double и Float: Infinity (бесконечность) и NaN (не число).
 * isInfinite() = true, если число бесконечно мало или велико по величине (-+ бесконечность);
 * isNan() = true, если проверяемое значение является нечисловым.
 */
class DoubleWrapper {
    public static void main(String[] args) {
        Double d1 = new Double(3.14159);
        Double d2 = new Double("314159e-5");
        System.out.println(d1 + " = " + d2 + " -> " + d1.equals(d2)); // 3.14159 = 3.14159 -> true

        Double d3 = new Double(1 / 0.0);
        Double d4 = new Double(0 / 0.0);
        System.out.println("1 / 0.0 = " + d3 + ": isInfinite = " + d3.isInfinite() + ", isNaN = " + d3.isNaN()); // 1 / 0.0 = Infinity: isInfinite = true, isNaN = false
        System.out.println("0 / 0.0 = " + d4 + ": isInfinite = " + d4.isInfinite() + ", isNaN = " + d4.isNaN()); // 0 / 0.0 = NaN: isInfinite = false, isNaN = true
    }
}
