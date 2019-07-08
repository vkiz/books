package part01.chapter07;

/**
 * Перегрузка методов (overload).
 */
class Overload {

    void test() {
        System.out.println("Параметры отсутствуют.");
    }

    // test - перегружаемый метод

    void test(int a) {
        System.out.println("a = " + a);
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a = " + a);
        return a * a;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload ov = new Overload();
        ov.test();
        ov.test(300);
        ov.test(300, 100);
        double d = ov.test(123.45);
        System.out.println(d);
    }
}
