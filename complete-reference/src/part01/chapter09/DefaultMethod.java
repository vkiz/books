package part01.chapter09;

/**
 * Интерфейс с методом по умолчанию (ключевое слово default).
 */
interface ItfDef {

    // объявление метода без реализации
    int getNumber();

    // объявление метода по умолчанию (содержит тело метода с реализацией по умолчанию)
    default String getString() {
        return "Реализация метода по умолчанию.";
    }
}

/**
 * Класс ItfImpl1 реализует интерфейс ItfDef.
 * Метод по умолчанию getString() не обязательно реализовывать (переопределять) в классе.
 */
class ItfImpl1 implements ItfDef {
    @Override
    public int getNumber() {
        return 300;
    }
}

class ItfImpl2 implements ItfDef {
    @Override
    public int getNumber() {
        return 300;
    }
    @Override
    public String getString() {
        return "Другая реализация метода по умолчанию.";
    }
}

class DefaultMethod {
    public static void main(String[] args) {
        ItfImpl1 obj1 = new ItfImpl1();
        System.out.println(obj1.getNumber());
        System.out.println(obj1.getString());

        ItfImpl2 obj2 = new ItfImpl2();
        System.out.println(obj2.getNumber());
        System.out.println(obj2.getString());
    }
}
