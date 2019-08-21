package part02.chapter19;

import java.util.Calendar;

/**
 * Пример использования абстрактного класса Calendar для преобразования времени в миллисекундах
 * в удобное представление (год, месяц, день, часы, минуты, секунды).
 * Вывод:
 * Дата: Aug 21 2019
 * Время: 8:19:0
 * Новое время: 10:20:30
 */
class CalendarDemo {
    public static void main(String[] args) {

        String[] months = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"
        };

        // создание объекта календаря статическим методом (открытые конструкторы отсутствуют)
        // содержит значения текущих даты и времени
        // с учётом региональных настроек и часового пояса по умолчанию;
        Calendar cal = Calendar.getInstance();

        // вывод текущих даты и времени
        System.out.print("Дата: ");
        System.out.print(months[cal.get(Calendar.MONTH)]);
        System.out.print(" " + cal.get(Calendar.DATE));
        System.out.print(" " + cal.get(Calendar.YEAR));
        System.out.println();

        System.out.print("Время: ");
        System.out.print(cal.get(Calendar.HOUR) + ":");
        System.out.print(cal.get(Calendar.MINUTE) + ":");
        System.out.print(cal.get(Calendar.SECOND));
        System.out.println();

        // установка нового времени
        cal.set(Calendar.HOUR, 10);
        cal.set(Calendar.MINUTE, 20);
        cal.set(Calendar.SECOND, 30);

        // вывод нового времени
        System.out.print("Новое время: ");
        System.out.print(cal.get(Calendar.HOUR) + ":");
        System.out.print(cal.get(Calendar.MINUTE) + ":");
        System.out.print(cal.get(Calendar.SECOND));
        System.out.println();
    }
}
