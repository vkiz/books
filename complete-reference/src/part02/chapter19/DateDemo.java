package part02.chapter19;

import java.util.Date;

/**
 * Класс Date устанавливает или возвращает текущую дату и время
 * в виде количества миллисекунд, прошедших с полуночи 1 января 1970 года.
 *
 * Основные методы (рекомендованные к использованию, не deprecated):
 * after, before, clone, compareTo, equals, getTime, hashCode, setTime, toString.
 */
class DateDemo {
    public static void main(String[] args) {

        Date date = new Date();

        // вывод текущей даты и времени с помощью метода toString(),
        // формат вывода: "EEE MMM dd HH:mm:ss zzz yyyy"
        System.out.println(date); // Wed Aug 21 20:22:33 SAMT 2019

        // вывод текущей даты и времени методом getTime(),
        // в виде количества миллисекунд, прошедших с полуночи 1 января 1970 года (по Гринвичу),
        // т.е. с January 1, 1970, 00:00:00 GMT
        long msec = date.getTime();
        System.out.println(msec); // 1566404553331
    }
}
