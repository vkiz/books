package part02.chapter16;

/**
 * Класс с переопределённым методом toString().
 */
class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    /**
     * Переопределённый метод Object.toString().
     * @return строковое представление объекта класса Box
     */
    @Override
    public String toString() {
        return "Размеры: " + width + " x " + height + " x " + depth;
    }
}

/**
 * Пример переопределения метода Object.toString() объекта
 * и конкатенации строки с объектом.
 */
class ToStringOverride {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        String str = "Объект типа Box: " + box; // конкатенация строки с объектом, неявно вызывается метод box.toString();

        System.out.println(box); // Размеры: 10.0 x 20.0 x 30.0
        System.out.println(str); // Объект типа Box: Размеры: 10.0 x 20.0 x 30.0
    }
}
