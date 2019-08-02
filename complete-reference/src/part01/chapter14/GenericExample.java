package part01.chapter14;

/**
 * Пример обобщённого класса.
 * Вывод:
 * Типом T является класс java.lang.Integer
 * Значение = 300
 * Типом T является класс java.lang.String
 * Значение = Строковое значение
 */

/** Обобщённый класс Generic.
 * @param <T> параметр типа, который будет заменён реальным типом при создании экземпляра класса Generic
 */
class Generic<T> { // T - параметр типа
    T obj;

    Generic(T o) { // конструктор класса
        obj = o;
    }

    T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Типом T является класс " + obj.getClass().getName());
    }
}

class GenericExample {
    public static void main(String[] args) {
        Generic<Integer> intObj = new Generic<Integer>(300); // в Generic<Integer> тип Integer - это аргумент типа
        intObj.showType();
        int i = intObj.getObj();
        System.out.println("Значение = " + i);

        Generic<String> strObj = new Generic<String>("Строковое значение");
        strObj.showType();
        String s = strObj.getObj();
        System.out.println("Значение = " + s);

        // начиная с JDK 7 в new можно использовать пустой список аргументов типа - это "ромбовидный оператор"
        // Generic<Integer> intObj = new Generic<>(300);
    }
}
