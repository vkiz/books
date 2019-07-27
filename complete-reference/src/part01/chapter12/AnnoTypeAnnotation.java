package part01.chapter12;

import java.lang.annotation.*;

/**
 * Пример объявления и применения типовой аннотации (аннотации типа).
 * Здесь типовые аннотации только @TypeAnno, @NotZeroLen, @Unique, @MaxLen.
 * Не типовые аннотации (для сравнения): @EmptyOK, @Recommended, @What.
 */

// Объявление типовых аннотаций (которые можно применить к типу данных)

// аннотации-маркеры
@Target(ElementType.TYPE_USE)
@interface TypeAnno { }

@Target(ElementType.TYPE_USE)
@interface NotZeroLen { }

@Target(ElementType.TYPE_USE)
@interface Unique { }

// параметризированная аннотация
@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

// Объявление не типовых аннотаций

// аннотация, которую можно применить к параметру типа
@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}

// аннотация, которую можно применить в объявлении поля
@Target(ElementType.FIELD)
@interface EmptyOK { }

// аннотация, которую можно применить в объявлении метода
@Target(ElementType.METHOD)
@interface Recommended { }

// применение аннотации в параметре типа
class AnnoTypeAnnotation<@What(description = "Данные обобщённого типа") T> {

    // применение типовой аннотации в конструкторе
    public @Unique AnnoTypeAnnotation() {
        // ...
    }

    // аннотирование типа String (но не поля str)
    @TypeAnno String str;

    // аннотирование поля test
    @EmptyOK String test;

    // аннотирование ссылки this на объект (получатель)
    public int foo(@TypeAnno AnnoTypeAnnotation<T> this, int x) {
        return 300;
    }

    // аннотирование типа, возвращаемого методом
    public @TypeAnno Integer add(int a, int b) {
        return a + b;
    }

    // аннотирование объявления метода
    public @Recommended Integer len2(String str) {
        return str.length() / 2;
    }

    // аннотирование исключения NullPointerException в операторе throws
    public void exc() throws @TypeAnno NullPointerException {
        // ...
    }

    // аннотирование уровней доступа к массиву
    String @MaxLen(10) [] @NotZeroLen [] array1;

    // аннотирование типа элемента массива
    @TypeAnno Integer[] array2;

    public static void meth(int i) {

        // применение типовой аннотации в аргументе типа
        AnnoTypeAnnotation<@TypeAnno Integer> obj1 = new AnnoTypeAnnotation<@TypeAnno Integer>();

        // применение типовой аннотации в операторе new
        @Unique AnnoTypeAnnotation<Integer> obj2 = new @Unique AnnoTypeAnnotation<Integer>();

        Object x = new Integer(100);

        // применение типовой аннотации в приведении типов
        Integer y = (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        meth(300);
    }

    // применение типовой аннотации в выражении наследования
    class SubClass extends @TypeAnno AnnoTypeAnnotation<Boolean> {
        // ...
    }
}
