package part01.chapter15;

/**
 * Класс исключения, генерирующегося если массив пуст.
 */
class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Ошибка: массив пуст.");
    }
}

/**
 * Функциональный интерфейс с абстрактным методом, генерирующем исключение.
 */
interface DoubleArrayFunc {
    double func(double[] arr) throws EmptyArrayException;
}

/**
 * Пример генерирования исключения лямбда-выражением.
 * Вывод:
 * Среднее значение = 3.0
 * Exception in thread "main" part01.chapter15.EmptyArrayException: Ошибка: массив пуст.
 * at part01.chapter15.LambdaException.lambda$main$0(LambdaException.java:36)
 * at part01.chapter15.LambdaException.main(LambdaException.java:47)
 */
class LambdaException {
    public static void main(String[] args) throws EmptyArrayException {

        double[] values = { 1.0, 2.0, 3.0, 4.0, 5.0 };

        // блочное лямбда-выражение возвращает среднее значение элементов массива
        DoubleArrayFunc average = n -> {
            double sum = 0;
            if (n.length == 0) {
                throw new EmptyArrayException(); // генерирование исключения
            }
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };

        System.out.println("Среднее значение = " + average.func(values));

        // эта строка приводит к генерированию исключения, т.к. передаётся массив нулевой длины
        System.out.println("Среднее значение = " + average.func(new double[0]));
    }
}
