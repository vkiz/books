package part02.chapter16;

class MyClass {
    int val;

    MyClass(int i) {
        val = i;
    }

    @Override
    public String toString() {
        return "Значение MyClass = " + val;
    }
}

/**
 * Пример преобразования данных из внутренненго представления
 * в строковую читаемую форму с помощью статического метода String.valueOf().
 * Все примитивные типы данных преобразуются в их общее строковое представление.
 * Для любого объекта, передаваемого методу, возвращается результат вызова метода Object.toString().
 */
class StringValueOf {
    public static void main(String[] args) {

        double d = 123.45;
        char c[] = { 'a', 'b', 'c', 'd', 'e' };

        System.out.println(String.valueOf(d));          // 123.45
        System.out.println(String.valueOf(c));          // abcde
        System.out.println(String.valueOf(c, 3, 2));    // de

        MyClass obj = new MyClass(300);
        System.out.println(String.valueOf(obj));        // Значение MyClass = 300
    }
}
