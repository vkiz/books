package part01.chapter15;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Класс, хранящий целочисленное значение.
 * Важно, что в нём не определяется метод сравнения
 * и не реализуется интерфейс Comparator<T>.
 */
class MyClass {

    private int val;

    MyClass(int v) {
        val = v;
    }

    int getVal() {
        return val;
    }
}

/**
 * Пример использования ссылки на обобщённый метод.
 * Выполняется поиск объекта с максимальным значения в списке ArrayList<T>.
 * Используется метод поиска Collections.max(),
 * нет необходимости создавать свой класс, реализующий интерфейс Comparator<T>.
 */
class RefToGenericMethod2 {

    /**
     * Метод сравнения, совместимый с аналогичным методом compare(),
     * определённым в обобщённом интерфейсе Comparator<T>
     * @param a ссылка на первый объект
     * @param b ссылка на второй объект
     * @return результат сравнения (разность значений)
     */
    static int compareMyClass(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {

        ArrayList<MyClass> al = new ArrayList<MyClass>();

        al.add(new MyClass(1));
        al.add(new MyClass(3));
        al.add(new MyClass(5));
        al.add(new MyClass(3));
        al.add(new MyClass(0));

        // поиск максимального значения в списке
        MyClass maxValObj = Collections.max(al, RefToGenericMethod2::compareMyClass);

        System.out.println("Максимальное значение равно: " + maxValObj.getVal()); // 5
    }
}
