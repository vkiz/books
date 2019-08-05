package part01.chapter15;

/**
 * Функциональный интерфейс с абстрактным методом без параметров.
 */
interface NumberWithoutParam {
    double getValue();
}

/**
 * Функциональный интерфейс с абстрактным методом с одним параметром n.
 */
interface NumberOneParam {
    boolean test(int n);
}

/**
 * Функциональный интерфейс с абстрактным методом с двумя параметрами a и b.
 */
interface NumberTwoParam {
    boolean test(int a, int b);
}

/**
 * Примеры лямбда-выражений, с телом, состоящим из единственного выражения.
 * Такие лямбда-выражения называются одиночными.
 */
class LambdaExample {
    public static void main(String[] args) {

        // объявление ссылки на функциональный интерфейс
        NumberWithoutParam num;

        // когда лямбда-выражение присваивается ссылочной переменной num, то создаётся экземпляр класса,
        // в котором лямбда-выражение реализует метод getValue() из функционального интерфейса NumberWithoutParam
        num = () -> 123.45;

        System.out.println("Значение: " + num.getValue());

        num = () -> Math.random() * 100;
        System.out.println("Первое случайное значение: " + num.getValue());
        System.out.println("Второе случайное значение: " + num.getValue());

        // ошибка: тип, возвращаемый лямбда-выражением имеет тип String - не совместим с типом,
        // возвращаемым абстрактным методом функционального интерфейса NumberWithoutParam (double)
        // num = () -> "123.45";

        // лямбда-выражение, проверяющее, является ли число n чётным
        NumberOneParam isEven = (n) -> (n % 2) == 0;

        // тип переменной n не указан, он выводится из контекста (из типа int параметра метода test())
        // но можно указать тип явно (тогда нужно указывать тип для всех параметров)
        // NumberOneParam isEven = (int n) -> (n % 2) == 0;

        if (isEven.test(10))
            System.out.println("Число 10 чётное");

        if (!isEven.test(11))
            System.out.println("Число 11 нечётное");

        // лямбда-выражение, проверяющее, является ли число n положительным
        NumberOneParam isPositive = n -> n >= 0;

        if (isPositive.test(1))
            System.out.println("Число 1 положительное");

        if (!isPositive.test(-1))
            System.out.println("Число -1 отрицательное");

        // лямбда-выражение, проверяющее, является ли число b множителем числа a (a делится на b без остатка)
        NumberTwoParam isFactor = (a, b) -> (a % b) == 0;

        if (isFactor.test(10, 2))
            System.out.println("Число 2 является множителем числа 10");

        if (!isFactor.test(10, 3))
            System.out.println("Число 3 не является множителем числа 10");
    }
}
