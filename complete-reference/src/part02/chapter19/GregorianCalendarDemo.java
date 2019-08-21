package part02.chapter19;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Пример работы с классом GregorianCalendar.
 *
 * Вывод:
 * Дата: Aug 21 2019
 * Время: 8:23:20
 * 2019 - не високосный год
 */
class GregorianCalendarDemo {
    public static void main(String[] args) {

        String[] months = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"
        };

        int year;

        GregorianCalendar gcal = new GregorianCalendar();

        System.out.print("Дата: ");
        System.out.print(months[gcal.get(Calendar.MONTH)]);
        System.out.print(" " + gcal.get(Calendar.DATE) + " ");
        System.out.print(year = gcal.get(Calendar.YEAR)); // присваивание и вывод значения года
        System.out.println();

        System.out.print("Время: ");
        System.out.print(gcal.get(Calendar.HOUR) + ":");
        System.out.print(gcal.get(Calendar.MINUTE) + ":");
        System.out.print(gcal.get(Calendar.SECOND));
        System.out.println();

        // проверка и вывод високосный ли год
        if (gcal.isLeapYear(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }
}
