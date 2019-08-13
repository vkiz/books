package part02.chapter17;

/**
 * Пример измерения времени выполнения программы.
 * Метод System.currentTimeMillis() возвращает разницу (в миллисекундах) между текущим временем
 * и временем, прошедшим с полуночи 1 января 1970 года.
 * Вывод (в данном конкретном случае):
 * Время выполнения цикла, миллисекунд: 114
 * Время выполнения цикла, наносекунд:  113940892
 */
class SystemCurrentTime {
    public static void main(String[] args) {

        System.out.println("Измерение времени цикла...");

        long ms0 = System.currentTimeMillis();
        long ns0 = System.nanoTime();

        for (long i = 0; i < 100_000_000L; i++);

        long ms1 = System.currentTimeMillis();
        long ns1 = System.nanoTime();

        System.out.println("Время выполнения цикла, миллисекунд: " + (ms1-ms0));
        System.out.println("Время выполнения цикла, наносекунд:  " + (ns1-ns0));
    }
}
