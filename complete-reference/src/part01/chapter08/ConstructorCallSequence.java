package part01.chapter08;

/**
 * Последовательность вызовов конструкторов в иерархии классов.
 * Вывод программы:
 * Конструктор класса AAA
 * Конструктор класса BBB
 * Конструктор класса ССС
 */
class AAA {
    AAA() {
        System.out.println("Конструктор класса AAA");
    }
}

class BBB extends AAA {
    BBB() {
        System.out.println("Конструктор класса BBB");
    }
}

class CCC extends BBB {
    CCC() {
        System.out.println("Конструктор класса ССС");
    }
}
class ConstructorCallSequence {
    public static void main(String[] args) {
        CCC c = new CCC();
    }
}
