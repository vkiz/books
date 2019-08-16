package part02.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Пример использования интерфейсов итераторов Iterator и ListIterator
 * для последовательного перебора и изменения элементов коллекции.
 */
class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        System.out.print("Исходное содержимое списка al: ");

        // последовательный перебор элементов коллекции
        Iterator<String> it0 = al.iterator(); // получение итератора
        while (it0.hasNext()) {
            String element = it0.next();
            System.out.print(element + " "); // A B C D E
        }
        System.out.println();

        // изменение перебираемых элементов
        ListIterator<String> it1 = al.listIterator();
        while (it1.hasNext()) {
            String element = it1.next();
            it1.set(element + "*");
        }

        System.out.print("Изменённое содержимое списка al: ");

        it0 = al.iterator();
        while (it0.hasNext()) {
            String element = it0.next();
            System.out.print(element + " "); // A* B* C* D* E*
        }
        System.out.println();

        System.out.print("Изменённое содержимое списка al в обратном порядке: ");

        // последовательный перебор элементов коллекции в обратном порядке
        while (it1.hasPrevious()) {
            String element = it1.previous();
            System.out.print(element + " "); // E* D* C* B* A*
        }
        System.out.println();
    }
}
