package part01.chapter15;

/**
 * Класс, содержащий элемент массива.
 */
class MyClass2 {

    private int val;

    /**
     * Конструктор, принимающий один аргумент.
     * @param v параметр конструктора (значение элемента)
     */
    MyClass2(int v) {
        val = v;
    }

    int getVal() {
        return val;
    }
}

/**
 * Обобщённый функциональный интерфейс,
 * метод которого возвращает массив элементов типа T из n элементов.
 * @param <T> параметр типа (тип элементов массива)
 */
interface GenArrayCreator<T> {
    T func(int n);
}

/**
 * Пример использования ссылки на конструктор массива.
 * имя_класса[]::new
 */
class RefToConstructorArray {

    public static void main(String[] args) {

        // создание ссылки на конструктор массива объектов типа MyClass2
        GenArrayCreator<MyClass2[]> arrayConstr = MyClass2[]::new;

        // создание массива объектов типа MyClass2, состоящего из двух элементов
        MyClass2[] a = arrayConstr.func(2);

        // инициализация элементов массива
        a[0] = new MyClass2(123);
        a[1] = new MyClass2(300);
    }
}
