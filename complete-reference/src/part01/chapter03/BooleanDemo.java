package part01.chapter03;

/**
 * Тип данных boolean.
 */
class BooleanDemo {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("b = " + b); // false
        b = true;
        System.out.println("b = " + b); // true

        if (b) {
            System.out.println("Этот код выполняется.");
        }

        b = false;
        if (b) {
            System.out.println("Этот код не выполняется.");
        }

        System.out.println("10 > 9 = " + (10 > 9));
    }
}
