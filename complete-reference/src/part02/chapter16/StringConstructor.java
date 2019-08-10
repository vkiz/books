package part02.chapter16;

/**
 * Примеры конструкторов символьных строк.
 */
class StringConstructor {
    public static void main(String[] args) {

        char chars[] = { 'J', 'a', 'v', 'a', ' ', '8' };
        byte bytes[] = {  74,  97, 118,  97,  32,  56 };

        String s0 = new String();               // строка, не содержащая символов

        String s1 = "Java";                     // создание объекта на основе строкового литерала
        String s2 = new String("Java");
        String s3 = new String(s2);             // на основе другого объекта String

        String s4 = new String(chars);          // из массива символов char (Unicode, 16 бит, диапазон 0..FFFF)
        String s5 = new String(chars, 0, 4);    // из массива символов char, начиная с индекса 0, количество символов 4

        String s6 = new String(bytes);          // из массива байтов (ASCII-коды символов, 8 бит, диапазон 0..7F)
        String s7 = new String(bytes, 0, 4);    // из массива байтов, начиная с индекса 0, количество символов 4

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
    }
}
