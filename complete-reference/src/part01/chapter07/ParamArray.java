package part01.chapter07;

/**
 * Передача методу переменного количества аргументов с помощью массива.
 * Это старый подход (до JDK 5).
 */
class ParamArray {
    static void vaTest(int[] v) {
        System.out.print("Количество аргументов = " + v.length + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] n1 = { 10 };
        int[] n2 = { 1, 2, 3 };
        int[] n3 = { };

        vaTest(n1); // 1 аргумент
        vaTest(n2); // 3 аргумента
        vaTest(n3); // без аргументов
     }
}

/*
Вывод программы:

Количество аргументов = 1 Содержимое: 10
Количество аргументов = 3 Содержимое: 1 2 3
Количество аргументов = 0 Содержимое:
*/
