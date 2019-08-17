package part02.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Пример реализации (переопределения) метода compare() интерфейса компаратора
 * для сравнения символьных строк в обратном порядке.
 * Переопределение метода equals() не требуется и не принято.
 */
class RevComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        // сравнение в обратном порядке
        return b.compareTo(a);
    }
}

class CompareDemo {
    public static void main(String[] args) {

        // создание набора с заданием компаратора -
        // экземпляра класса с переопределённым методом compare()
        TreeSet<String> ts0 = new TreeSet<String>(new RevComparator());

        ts0.add("3");
        ts0.add("0");
        ts0.add("C");
        ts0.add("A");
        ts0.add("B");
        ts0.add("D");
        ts0.add("E");
        ts0.add("1");
        ts0.add("2");
        ts0.add("10");

        for (String s : ts0) {
            System.out.print(s + " "); // E D C B A 3 2 10 1 0
        }
        System.out.println();

        // здесь в качестве компаратора создаётся экземпляр анонимного класса,
        // реализующего метод compare() интерфейса Comparator.
        // для примера обратный порядок задаётся не в методе compare(),
        // а у объекта компаратора вызовом метода reversed().
        // это аналогично конструкции:
        // MyComp mc = new MyComp(); TreeSet<String> ts1 = new TreeSet<String>(mc.reversed());
        TreeSet<String> ts1 = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // сравнение в естественном (прямом) порядке
                return a.compareTo(b);
            }
        }.reversed()); // задание обратного порядка для компаратора

        ts1.add("A");
        ts1.add("C");
        ts1.add("B");

        for (String s : ts1) {
            System.out.print(s + " "); // C B A
        }
        System.out.println();

        // начиная с JDK 8 не обязательно создавать отдельный класс компаратора -
        // можно использовать лямбда-выражение для получения интерфейса компаратора
        Comparator<String> cmp0 = (aStr, bStr) -> aStr.compareTo(bStr);                     // естественное упорядочение
        Comparator<String> cmp1 = (aStr, bStr) -> bStr.compareTo(aStr);                     // обратное упорядочение

        // также можно упростить и вместо лямбда-выражения использовать статические методы
        Comparator<String> cmp2 = Comparator.naturalOrder(); // естественное упорядочение
        Comparator<String> cmp3 = Comparator.reverseOrder(); // обратное упорядочение

        // или задать лямбда-выражение или статический метод непосредственно в конструкторе TreeSet
        TreeSet<String> ts2 = new TreeSet<String>((aStr, bStr) -> aStr.compareTo(bStr));    // естественное упорядочение
        TreeSet<String> ts3 = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));    // обратное упорядочение
        TreeSet<String> ts4 = new TreeSet<String>(Comparator.naturalOrder());               // естественное упорядочение
        TreeSet<String> ts5 = new TreeSet<String>(Comparator.reverseOrder());               // обратное упорядочение

        ts5.add("1");
        ts5.add("10");
        ts5.add("A");
        ts5.add("C");
        ts5.add("B");

        for (String s : ts5) {
            System.out.print(s + " "); // C B A 10 1
        }
        System.out.println();
    }
}
