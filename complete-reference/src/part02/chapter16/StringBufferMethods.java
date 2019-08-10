package part02.chapter16;

import java.util.Arrays;

/**
 * Класс java.lang.StringBuffer определяет изменяемую строку.
 * Конструктор по умолчанию резервирует память для 16 символов (capacity буфера) не перераспределяя память.
 *
 * Класс StringBuffer является синхронизированным, следовательно, потокобезопасным (в отличие от класса StringBuilder).
 * Класс StringBuilder быстрее, но не является потокобезопасным - без внешней синхронизации потоков к нему можно
 * обращаться только из одного потока).
 *
 * Примеры использования методов класса StringBuffer
 *
 * length(), setLength(), capacity(), ensureCapacity(), charAt(), setChatAt(), getChars(),
 * append(), insert(), reverse(), delete(), deleteCharAt(), replace(), substring(), indexOf(), lastIndexOf().
 */
class StringBufferMethods {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer();              // конструктор по умолчанию
        System.out.println("Ёмкость: " + sb1.capacity());   // 16
        sb1.ensureCapacity(100);                            // выделение места (100 символов) _после_ создания объекта
        System.out.println("Ёмкость: " + sb1.capacity());   // 100
        sb1.append("abcde");
        System.out.println("Ёмкость: " + sb1.capacity());   // 100

        // текущая длина (length) и выделенная ёмкость (capacity) буфера в символах
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("Буфер: " + sb2);                // Hello
        System.out.println("Длина: " + sb2.length());       // 5
        System.out.println("Ёмкость: " + sb2.capacity());   // 21 (5 + 16)

        sb2.append(", world!");
        System.out.println("Длина \"" + sb2 + "\": " + sb2.length()); // Hello, world!, 13

        // задание длины символьной строки в буфере
        // либо добавляются пустые символы в конце, либо удаляются
        sb2.setLength(2);
        System.out.println(sb2); // He

        // чтение и запись значения отдельного символа
        System.out.println(sb2.charAt(1)); // e
        sb2.setCharAt(1, 'i');
        System.out.println(sb2); // Hi

        // копирование подстроки из буфера в массив символов
        StringBuffer sb3 = new StringBuffer("Java");
        char arr[] = new char[sb3.length()];
        sb3.getChars(0, sb3.length(), arr, 0);
        System.out.println(Arrays.toString(arr)); // [J, a, v, a]

        // присоединение строкового представления любого объекта к буферу в конце
        // строковое представление получается неявно с помощью методов String.valueOf() или Object.toString()
        StringBuffer sb4 = new StringBuffer();
        sb4.append("int a = ").append(300).append(';');
        System.out.println(sb4); // int a = 300;

        // вставка строки символов
        StringBuffer sb5 = new StringBuffer("Мне Java!");
        sb5.insert(4, "нравится ");
        System.out.println(sb5); // Мне нравится Java!

        // изменение порядка символов в буфере на обратный
        StringBuffer sb6 = new StringBuffer("abcde");
        sb6.reverse();
        System.out.println(sb6); // edcba

        // удаление последовательности символов и одного символа из буфера
        StringBuffer sb7 = new StringBuffer("Это простой тест.");
        sb7.delete(3, 11);       // " простой"
        System.out.println(sb7); // Это тест.
        sb7.deleteCharAt(8);     // '.'
        System.out.println(sb7); // Это тест

        // замена подстроки символов
        sb7.replace(4, 8, "замена");
        System.out.println(sb7); // Это замена

        // получение подстроки символов
        System.out.println(sb7.substring(0, 3)); // с 0 по 3 символ: "Это"
        System.out.println(sb7.substring(4));    // с 4 символа до конца: "замена"

        // получение индекса символа (поиск) вхождения подстроки в буфер
        StringBuffer sb8 = new StringBuffer("one two one");
        System.out.println("Индeкc первого вхождения: " + sb8.indexOf("one")); // 0
        System.out.println("Индeкc последнего вхождения: " + sb8.lastIndexOf("one")); // 8
    }
}
