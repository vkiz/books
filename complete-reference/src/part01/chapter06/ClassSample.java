package part01.chapter06;

/**
 * Класс.
 */
class Box {
    double width;
    double height;
    double depth;
}

class ClassSample {
    public static void main(String[] args) {
        // box1 - переменная-ссылка на экземпляр класса (объект)
        // оператор new динамически выделяет оперативную память для объекта
        Box box1 = new Box();
        box1.width = 10; // присваивание значения переменной экземпляра box1
        box1.height = 15;
        box1.depth = 20;

        Box box2 = new Box();
        box2.width = 3;
        box2.height = 4;
        box2.depth = 5;

        double volume1 = box1.width * box1.height * box1.depth;
        System.out.println("Объём первого параллелепипеда равен " + volume1);

        double volume2 = box2.width * box2.height * box2.depth;
        System.out.println("Объём второго параллелепипеда равен " + volume2);
    }
}
