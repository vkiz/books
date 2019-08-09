# Глава 16. Обработка символьных строк

В языке Java символьная строка (последовательность символов Unicode) _является объектом_ класса **java.lang.String**.

После создания объекта типа String символьная строка является **неизменяемой**, и при операциях изменения строки 
создаётся новый объект типа String, содержащий все внесённые изменения; исходная строка остаётся без изменения.
Это сделано из-за более эффективной реализации неизменяемой строки в Java.

Для изменяемых строк в пакете `java.lang` существуют final-классы StringBuffer, StringBuilder.
Все классы строк реализуют интерфейс CharSequence.

## Класс String

Создание объекта строки:
* с помощью оператора new и конструктора: String str = new String("abcde");
* с помощью строкового литерала: String str = "abcde";

Конструкторы:

| Конструктор                                                                       | Описание                         |
| --------------------------------------------------------------------------------- | -------------------------------- |
| String()                                                                          | строка, не содержащая символов   |
| String(String имя_объекта)                                                        | на основе другого объекта String |
| String(char массив_символов[])                                                    | Unicode (16 бит), 0..FFFF        |
| String(byte массив_символов[])                                                    | ASCII, (8 бит), 0..7F            |
| String(int массив_кодовых_точек[], int начальный_индекс, int количество_символов) | Unicode (32 бита), 0..10FFFF (с JDK 5) |
| String(char массив_символов[], int начальный_индекс, int количество_символов)     |                                  |
| String(byte массив_символов[], int начальный_индекс, int количество_символов)     |                                  |
| String(StringBuffer имя_объекта)                                                  |                                  |
| String(StringBuilder имя_объекта)                                                 |                                  |

**Некоторые методы**:

length, charAt, getChars, getBytes, toCharArray, equals, equalsIgnoreCase, regionMatches, startsWith, endsWith, 
compareTo, indexOf, lastIndexOf, substring, concat, replace, trim, valueOf, toLowerCase, toUpperCase, 
join (c JDK 8), split.

## Класс StringBuffer

Класс java.lang.StringBuffer определяет **изменяемую** строку (в отличие от неизменяемой класса String).
Конструктор по умолчанию резервирует память для 16 символов (capacity буфера), не перераспределяя память.
Класс StringBuffer является синхронизированным - **потокобезопасный**.
Он позволяет обращаться к нему из разных потоков, без внешней синхронизации потоков.

Конструкторы:

| Конструктор                        | Описание                                                                        |
| ---------------------------------- | ------------------------------------------------------------------------------- |
| StringBuffer()                     | резервирует память для 16 символов (capacity), не перераспределяя память        |
| StringBuffer(int размер)           | явно задаёт вместимость (capacity) буфера                                       |
| StringBuffer(String строка)        | после инициализации вместимость = длина строки + 16                             |
| StringBuffer(CharSequence символы) |                                                                                 |

**Некоторые методы**:

length, capacity, ensureCapacity, setLength, charAt, setCharAt, getChars, append, insert, reverse, delete, deleteCharAt,
replace, substring, indexOf, lastIndexOf, trimToSize.

## Класс StringBuilder

Класс java.lang.StringBuilder (появился в JDK 5) так же как и StringBuffer определяет **изменяемую** строку.
Класс StringBuilder быстрее чем StringBuffer, но не синхронизирован - **не потокобезопасный** - 
без внешней синхронизации потоков к нему можно обращаться только из одного потока.
