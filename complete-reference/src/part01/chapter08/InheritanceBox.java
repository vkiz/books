package part01.chapter08;

/**
 * Пример наследования классов.
 */

/*
 * Класс, описывающий коробку (груз).
 */
class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = height = depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

/*
 * Подкласс суперкласса Box.
 * Описывает груз, обладающий дополнительно весом.
 */
class BoxWeight extends Box {
    double weight;

    // Конструктор подкласса
    BoxWeight(double w, double h, double d, double wht) {
        // Можно было бы использовать, но члены суперкласса объявлены как private и недоступны в подклассе
        // width = w;
        // height = h;
        // depth = d;
        super(w, h, d); // Вызов конструктора суперкласса
        weight = wht;
    }

    // Перегрузка конструктора

    // Конструктор по умолчанию (без параметров)
    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(BoxWeight obj) {
        super(obj);
        weight = obj.weight;
    }
}

/*
 * Подкласс суперкласса BoxWeight.
 * Описывает груз, обладающий дополнительно стоимостью доставки.
 */
class Cargo extends BoxWeight {
    double cost;

    Cargo() {
        super();
        cost = -1;
    }

    Cargo(Cargo obj) {
        super(obj);
        cost = obj.cost;
    }

    Cargo(double w, double h, double d, double wht, double c) {
        super(w, h, d, wht);
        cost = c;
    }
}

class InheritanceBox {
    public static void main(String[] args) {
        BoxWeight bw1 = new BoxWeight();
        BoxWeight bw2 = new BoxWeight(10, 20, 30, 3000);
        BoxWeight bw3 = new BoxWeight(bw2);

        Cargo cargo = new Cargo(10, 20, 30, 3000, 1000);

        System.out.println("Объём объекта bw1 = " + bw1.volume());
        System.out.println("Вес объекта bw1 = " + bw1.weight);

        System.out.println("\nОбъём объекта bw2 = " + bw2.volume());
        System.out.println("Вес объекта bw2 = " + bw2.weight);

        System.out.println("\nОбъём объекта bw3 = " + bw3.volume());
        System.out.println("Вес объекта bw3 = " + bw3.weight);

        System.out.println("\nОбъём объекта cargo = " + cargo.volume());
        System.out.println("Вес объекта cargo = " + cargo.weight);
        System.out.println("Стоимость доставки объекта cargo = $" + cargo.cost);
    }
}
