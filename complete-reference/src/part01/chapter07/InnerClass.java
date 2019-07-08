package part01.chapter07;

/**
 * Пример внутреннего класса.
 */
class Outer { // Внешний класс
    int outer_x = 300;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // Внутренний класс в блоке кода внешнего класса
    class Inner {
        void display() {
            System.out.println("outer_x = " + outer_x);
        }
    }

    void test2() {
        for (int i = 0; i < 10; i++) {
            // Определение внутреннего класса в теле цикла for
            class Inner2 {
                void display() {
                    System.out.println("outer_x = " + outer_x);
                }
            }
            Inner2 inner2 = new Inner2();
            inner2.display();
        }
    }
}

class InnerClass {
    public static void main(String[] args) {

        Outer outer = new Outer();

        System.out.println("Внутренний класс в блоке кода");
        outer.test();

        System.out.println("Внутренний класс в теле цикла");
        outer.test2();
    }
}
