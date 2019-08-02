package part01.chapter14;

/**
 * Пример кода, при котором компилятор создаёт в байт-коде дополнительно мостовой метод.
 *
 * При компиляции из-за стирания типов ожидаемая форма переопределённого метода getObj() будет Object getObj() { // ... }
 * и компилятор создаст вспомогательный мостовой метод с этой сигнатурой Object getObj(),
 * который вызывает строковый вариант метода getObj().
 *
 * Если исследовать класс GenSub2 с помощью утилиты javap (дизассемблер class-файлов), входящей в состав JDK,
 * то будут видны восстановленные (дизассемблированные) из байт-кода методы:
 *
 * class GenSub2 extends GenSuper2<java.lang.String> {
 *     GenSub2(java.lang.String);
 *     java.lang.String getObj();
 *     java.lang.Object getObj(); // мостовой метод
 * }
 */

class GenSuper2<T> {
    T obj;

    GenSuper2(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }
}

/**
 * Подкласс GenSub2 обобщённого класса GenSuper2.
 * Важно, что этот подкласс имеет специальную строковую форму
 * (не обобщённый тип T, а конкретный String)
 */
class GenSub2 extends GenSuper2<String> {

    GenSub2(String s) {
        super(s);
    }

    /**
     * Переопределённый метод.
     * Важно, что тип возвращаемого значения не обобщённый T, а конкретный String.
     * @return возвращаемое значение типа String
     */
    @Override
    String getObj() {
        System.out.print("Выполняется метод String getObj() из класса GenSub2: ");
        return obj; // поле obj унаследовано от суперкласса GenSuper2
    }
}

class GenericBridgeMethod {
    public static void main(String[] args) {
        GenSub2 strObj = new GenSub2("Строковое значение");
        System.out.println(strObj.getObj());
    }
}
