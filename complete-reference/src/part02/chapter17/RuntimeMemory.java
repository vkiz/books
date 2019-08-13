package part02.chapter17;

/**
 * Пример чтения количества памяти и очистки мусора с помощью методов класса Runtime.
 * Вывод (в данном конкретном случае):
 * Памяти всего, байт: 128974848
 * Свободной памяти, байт: 125544024
 * Свободной памяти после сборки мусора, байт: 128539728
 * Свободной памяти после выделения, байт: 127858088
 * Использовано памяти для массива, байт: 681640
 * Свободной памяти после обнуления ссылок и сборки мусора, байт: 127857832
 */
class RuntimeMemory {
    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();

        System.out.println("Памяти всего, байт: " + r.totalMemory());
        System.out.println("Свободной памяти, байт: " + r.freeMemory());

        r.gc(); // запуск сборки мусора

        long m1 = r.freeMemory();
        System.out.println("Свободной памяти после сборки мусора, байт: " + m1);

        // выделение памяти для массива значений типа Integer
        Integer arr[] = new Integer[1024];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i; // new Integer(i);
        }

        long m2 = r.freeMemory();
        System.out.println("Свободной памяти после выделения, байт: " + m2);
        System.out.println("Использовано памяти для массива, байт: " + (m1-m2));

        // обнулить ссылки на объекты из массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
        r.gc();

        System.out.println("Свободной памяти после обнуления ссылок и сборки мусора, байт: " + r.freeMemory());
    }
}
