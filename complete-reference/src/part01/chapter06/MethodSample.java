package part01.chapter06;

/**
 * Методы класса.
 */
class BoxMethod {
    double width;
    double height;
    double depth;

    void printVolume() {
        System.out.println("Объём равен " + width * height * depth);
    }

    // возвращение значения методом
    double getVolume() {
        return width * height * depth;
    }

    // метод с параметрами
    void setDim1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // метод с параметрами;
    // внутри блока кода метода переменные-параметры скрывают переменные экземпляра класса, т.к. их имена совпадают.
    // Для предотвращения сокрытия переменных экземпляра (доступа к ним) используется ключевое слово this -
    // ссылка на текущий объект (экземпляр класса)
    void setDim2(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}

class MethodSample {
    public static void main(String[] args) {
        BoxMethod box1 = new BoxMethod();
        box1.width = 10;
        box1.height = 15;
        box1.depth = 20;

        BoxMethod box2 = new BoxMethod();
        box2.width = 3;
        box2.height = 4;
        box2.depth = 5;

        box1.setDim1(10.0, 20.0, 30.0);

        System.out.print("Объём первого параллелепипеда: ");
        box1.printVolume();

        box2.setDim2(5.0, 10.0, 20.0);

        double volume = box2.getVolume();
        System.out.println("Объём второго параллелепипеда равен " + volume);
    }
}
