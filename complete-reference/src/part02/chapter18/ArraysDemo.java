package part02.chapter18;

import java.util.Arrays;

/**
 * Пример использования методов для работы с массивами из класса java.util.Arrays.
 */
class ArraysDemo {
    public static void main(String[] args) {

        // создание и инициализация массива
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i * -3;
        }

        System.out.print("Исходный массив: "); // 0 -3 -6 -9 -12 -15 -18 -21 -24 -27
        display(arr);

        Arrays.sort(arr);
        System.out.print("Отсортированный массив: "); // -27 -24 -21 -18 -15 -12 -9 -6 -3 0
        display(arr);

        // присваивание элементам массива начиная с элемента с индексом 3 (включая) до элемента с индексом 6 (исключая)
        // значения 100
        Arrays.fill(arr, 3, 6, 100);
        System.out.print("Заполненный массив: "); // -27 -24 -21 100 100 100 -9 -6 -3 0
        display(arr);

        Arrays.sort(arr);
        System.out.print("Отсортированный массив: "); // -27 -24 -21 -9 -6 -3 0 100 100 100
        display(arr);

        // двоичный (бинарный) поиск (возможен в отсортированном массиве)
        int index = Arrays.binarySearch(arr, 100);
        System.out.println("Индекс элемента со значением 100: " + index); // 7
    }

    static void display(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
