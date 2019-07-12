package part01.chapter08;

/**
 * Применение абстрактных классов и методов.
 *
 * Вывод программы:
 * Площадь прямоугольника
 * Площадь равна 200.0
 * Площадь прямоугольного треугольника
 * Площадь равна 10000.0
 */

/**
 * Абстрактный класс.
 */
abstract class AbstrFigure {
    double dim1;
    double dim2;

    // Конструктор абстрактного класса
    AbstrFigure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // Объявление абстрактного метода
    abstract double area();
}

class RectangleImpl extends AbstrFigure {
    RectangleImpl(double a, double b) {
        super(a, b);
    }

    // Переопределение (реализация) абстрактного метода
    @Override
    double area() {
        System.out.println("Площадь прямоугольника");
        return dim1 * dim2;
    }
}

class TriangleImpl extends AbstrFigure {
    TriangleImpl(double a, double b) {
        super(a, b);
    }

    // Переопределение (реализация) абстрактного метода
    @Override
    double area() {
        System.out.println("Площадь прямоугольного треугольника");
        return dim1 * dim2 / 2;
    }
}

class AbstractFigure {
    public static void main(String[] args) {
        // AbstrFigure f = new AbstrFigure(10, 10); // Ошибка - нельзя создать объект абстрактного класса
        RectangleImpl r = new RectangleImpl(10, 20);
        TriangleImpl t = new TriangleImpl(100, 200);

        AbstrFigure figRef; // объявление ссылки абстрактного класса

        figRef = r;
        System.out.println("Площадь равна " + figRef.area());

        figRef = t;
        System.out.println("Площадь равна " + figRef.area());
    }
}
