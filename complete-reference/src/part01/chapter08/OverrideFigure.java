package part01.chapter08;

/**
 * Пример применения полиморфизма во время выполнения.
 *
 * Вывод программы:
 * Площадь фигуры не определена
 * Площадь равна 0.0
 * Площадь прямоугольника
 * Площадь равна 10000.0
 * Площадь прямоугольного треугольника
 * Площадь равна 15000.0
 */
class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Площадь фигуры не определена");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Площадь прямоугольника");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Площадь прямоугольного треугольника");
        return dim1 * dim2 / 2;
    }
}

class OverrideFigure {
    public static void main(String[] args) {
        Figure fig = new Figure(10, 10);
        Rectangle rect = new Rectangle(100, 100);
        Triangle tr = new Triangle(100, 300);

        Figure figRef;

        figRef = fig;
        System.out.println("Площадь равна " + figRef.area());

        figRef = rect;
        System.out.println("Площадь равна " + figRef.area());

        figRef = tr;
        System.out.println("Площадь равна " + figRef.area());
    }
}
