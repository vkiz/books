package part01.chapter12;

/**
 * Пример объявления, сравнения переменных перечисления.
 */

// Перечисление сортов яблок
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumSwitch {
    public static void main(String[] args) {
        Apple ap;           // объявление переменной
        ap = Apple.RedDel;  // возможно присваивание значений, определённых в перечислении
        System.out.println("Значение ap: " + ap); // отображается имя константы (RedDel)

        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel) {
            System.out.println("Переменная ap содержит GoldenDel.");
        }

        switch (ap) {
            case Jonathan:
                System.out.println("Сорт Jonathan красный.");
                break;
            case GoldenDel:
                System.out.println("Сорт Golden Delicious жёлтый.");
                break;
            case RedDel:
                System.out.println("Сорт Red Delicious красный.");
                break;
            case Winesap:
                System.out.println("Сорт Winesap красный.");
                break;
            case Cortland:
                System.out.println("Сорт Cortland красный.");
                break;
        }
    }
}
