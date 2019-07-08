package part01.chapter07;

/**
 * Перегрузка конструктора класса и передача объекта в качестве параметра.
 */
class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    // Передача объекта в качестве параметра
    Box(Box obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    double volume() {
        return width * height * depth;
    }
}

class OverloadConstructor {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        Box box2 = new Box();
        Box box3 = new Box(10);
        Box boxClone = new Box(box3);

        System.out.println("Объём box1 = " + box1.volume());
        System.out.println("Объём box2 = " + box2.volume());
        System.out.println("Объём box3 = " + box3.volume());
        System.out.println("Объём boxClone = " + boxClone.volume());
    }
}
