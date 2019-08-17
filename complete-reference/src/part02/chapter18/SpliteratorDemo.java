package part02.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 * Пример использования интерфейса Spliterator (с JDK 8, итератор-разделитель).
 * Итерация выполняется методом tryAdvance до тех пор, пока он возвращает значение true
 * (т.е. пока следующий элемент присутствует). Метод tryAdvance выполняет заданное действие Consumer
 * над каждым элементом коллекции. Consumer - это обобщённый функциональный интерфейс, выполняющий действие над объектом.
 * Его проще всего реализовать с помощью лямбда-выражения.
 * Метод forEachRemaining тоже выполняет заданное действие над каждым элементом коллекции, но не возвращает результат.
 * Внутри реализации по умолчанию метода forEachRemaining просто вызывается while(tryAdvance(action));
 */
class SpliteratorDemo {
    public static void main(String[] args) {

        ArrayList<Double> al0 = new ArrayList<Double>();

        al0.add(1.0);
        al0.add(2.0);
        al0.add(3.0);
        al0.add(4.0);
        al0.add(5.0);

        System.out.println("Содержимое списка al0:");

        Spliterator<Double> sp = al0.spliterator();
        while (sp.tryAdvance(n -> System.out.println(n)));
        System.out.println();

        ArrayList<Double> al1 = new ArrayList<Double>();
        sp = al0.spliterator();
        while (sp.tryAdvance(n -> al1.add(Math.sqrt(n))));

        System.out.println("Содержимое списка al1:");

        sp = al1.spliterator();
        sp.forEachRemaining(n -> System.out.println(n));
    }
}
