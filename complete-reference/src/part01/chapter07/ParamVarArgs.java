package part01.chapter07;

/**
 * Аргументы переменной длины.
 * Перегрузка методов с аргументами переменной длины.
 */
class ParamVarArgs {

    // Метод vaTest объявляется с аргументами переменной длины (...)
    static void vaTest(int ... v) {
        System.out.print("Количество аргументов = " + v.length + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Перегрузка метода
    static void vaTest(boolean ... v) {
        System.out.print("Количество аргументов = " + v.length + " Содержимое: ");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Перегрузка метода
    static void vaTest(String s, int ... v) {
        System.out.print("Количество аргументов = " + v.length + " s = " + s + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest(10);         // 1 аргумент
        vaTest(1, 2, 3);    // 3 аргумента

        // vaTest();        // без аргументов - можно, но в данном случае приведёт к неоднозначности и ошибке,
        // т.к. компилятор не может выбрать какой метод вызывать: vaTest(int ... v) или vaTest(boolean ... v).

        // вызов перегруженного метода
        vaTest(true, true, true);
        vaTest("Test", 300);
    }
}

/*
Вывод программы:

Количество аргументов = 1 Содержимое: 10
Количество аргументов = 3 Содержимое: 1 2 3
Количество аргументов = 3 Содержимое: true true true
Количество аргументов = 1 s = Test Содержимое: 300
*/
