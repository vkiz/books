package part01.chapter06;

/**
 * Конструктор класса.
 */
class BoxWithConstructor {
    double width;
    double height;
    double depth;

    // конструктор класса
    BoxWithConstructor() {
        System.out.println("Выполняется конструктор класса");
        width = 10.0;
        height = 10.0;
        depth = 10.0;
    }

    // параметризированный конструктор класса
    BoxWithConstructor(double width, double height, double depth) {
        System.out.println("Выполняется параметризированный конструктор класса");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // параметризированный конструктор класса
    BoxWithConstructor(double a) {
        System.out.println("Выполняется параметризированный конструктор класса");
        width = height = depth = a;
    }
}

class ConstructorSample {
    public static void main(String[] args) {

        BoxWithConstructor box1 = new BoxWithConstructor();
        System.out.println("Свойства объекта box1 width, height, depth:");
        System.out.println(box1.width + ", " + box1.height + ", " + box1.depth);
        System.out.println();

        BoxWithConstructor box2 = new BoxWithConstructor(10.0, 20.0, 30.0);
        System.out.println("Свойства объекта box2 width, height, depth:");
        System.out.println(box2.width + ", " + box2.height + ", " + box2.depth);
        System.out.println();

        BoxWithConstructor box3 = new BoxWithConstructor(30.0);
        System.out.println("Свойства объекта box3 width, height, depth:");
        System.out.println(box3.width + ", " + box3.height + ", " + box3.depth);
    }
}
