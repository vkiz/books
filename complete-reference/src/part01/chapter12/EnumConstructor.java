package part01.chapter12;

/**
 * Пример использования конструктора, переменной экземпляра и метода в перечислении.
 * Конструктор вызывается всякий раз, когда создается константа перечислимого типа.
 * У каждой константы перечислимого типа имеется своя копия любой из переменных экземпляра, объявленных в перечислении.
 * Вывод:
 * Яблоко сорта Winesap стоит 15 центов
 * Цены на все сорта яблок:
 * Яблоко сорта Jonathan стоит 10 центов
 * Яблоко сорта GoldenDel стоит 9 центов
 * Яблоко сорта RedDel стоит 12 центов
 * Яблоко сорта Winesap стоит 15 центов
 * Яблоко сорта Cortland стоит 8 центов
 * Яблоко сорта NewBrand стоит -1 центов
 */

enum Apple2 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8), NewBrand; // передача аргументов конструктору

    private int price;  // переменная экземпляра

    Apple2(int p) {     // конструктор
        price = p;
    }

    Apple2() {
        price = -1;     // перегружаемый конструктор
    }

    int getPrice() {    // метод
        return price;
    }
}

class EnumConstructor {
    public static void main(String[] args) {
        System.out.println("Яблоко сорта Winesap стоит " + Apple2.Winesap.getPrice() + " центов");
        System.out.println("Цены на все сорта яблок:");
        for (Apple2 a : Apple2.values()) {
            System.out.println("Яблоко сорта " + a + " стоит " + a.getPrice() + " центов");
        }
    }
}
