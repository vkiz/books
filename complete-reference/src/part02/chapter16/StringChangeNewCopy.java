package part02.chapter16;

/**
 * Примеры изменения символьных строк.
 * Объекты типа String неизменяемы, методы ниже создают новые копии строк с внесёнными изменениями.
 * substring(), concat(), replace(), trim(), toLowerCase(), toUpperCase(), join() (с JDK 8).
 */
class StringChangeNewCopy {
    public static void main(String[] args) {

        // замена подстрок "is" на "was"
        String src = "This is a test string.";
        String search = "is";
        String sub = "was";
        String res;
        int i;
        do {
            System.out.println(src);
            i = src.indexOf(search);
            if (i != -1) {
                res = src.substring(0, i);
                res = res + sub;
                res = res + src.substring(i + search.length());
                src = res;
            }
        } while (i != -1); // Thwas was a test string.

        // соединение подстрок
        String s1 = "Hello, ";
        String s2 = s1.concat("world!");
        System.out.println(s2); // Hello, world!

        // замена символов
        String s3 = "hello, hi".replace("h", "H");
        System.out.println(s3); // Hello, Hi

        // удаление пробелов в начале и в конце строки
        String s4 = "   Hello, world!   ".trim();
        System.out.println(s4); // Hello, world!

        // преобразование строки к нижнему и верхнему регистру
        String s5 = "Java 8";
        System.out.println(s5.toLowerCase()); // java 8
        System.out.println(s5.toUpperCase()); // JAVA 8

        // соединение двух и более строк
        String s = String.join(", ", "One", "Two", "Three");
        System.out.println(s);
    }
}
