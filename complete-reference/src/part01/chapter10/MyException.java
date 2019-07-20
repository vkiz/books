package part01.chapter10;

/**
 * Пример объявления собственного класса исключений.
 * Переопределён метод toString() класса Throwable
 * (возвращает строку с описанием исключения).
 */
class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException [" + detail + "]";
    }
}

class MyExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Нормальное завершение.");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(100);
        } catch (MyException ex) {
            System.out.println("Перехвачено исключение: " + ex);
        }
    }
}
