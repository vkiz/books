package part01.chapter08;

/**
 * Наследование классов.
 */

class A {               // Суперкласс
    int i, j;

    void printIJ() {
        System.out.println("i, j: " + i + " " + j);
    }
}

class B extends A {     // Подкласс
    int k;

    void printK() {
        System.out.println("k: " + k);
    }

    void printIJK() {
        System.out.println("i, j, k: " + i + " " + j + " " + k);
    }
}

class Inheritance {
    public static void main(String[] args) {
        A superClassObj = new A();
        B subClassObj = new B();

        // Суперкласс
        superClassObj.i = 100;
        superClassObj.j = 200;
        System.out.println("Объект superClassObj класса A");
        superClassObj.printIJ();

        // Подкласс имеет доступ ко всем открытым членам своего суперкласса
        subClassObj.i = 128;
        subClassObj.j = 256;
        subClassObj.k = 512;
        System.out.println("\nОбъект subClassObj класса B");
        subClassObj.printIJ();
        subClassObj.printK();
        subClassObj.printIJK();
    }
}
