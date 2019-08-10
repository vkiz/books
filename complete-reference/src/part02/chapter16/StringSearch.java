package part02.chapter16;

/**
 * Примеры поиска символа или подстроки в строке с помощью методов
 * indexOf(), lastIndexOf().
 */
class StringSearch {
    public static void main(String[] args) {

        String s = "Now is the time for all good men to come to the aid of their country.";

        System.out.println(s);

        System.out.println("indexOf('t') = " + s.indexOf('t'));                         // 7
        System.out.println("lastIndexOf('t') = " + s.lastIndexOf('t'));                 // 65

        System.out.println("indexOf(\"the\") = " + s.indexOf("the"));                   // 7
        System.out.println("lastIndexOf(\"the\") = " + s.lastIndexOf("the"));           // 55

        System.out.println("indexOf('t', 10) = " + s.indexOf('t', 10));                 // 11
        System.out.println("lastIndexOf('t', 60) = " + s.lastIndexOf('t', 60));         // 55

        System.out.println("indexOf(\"the\", 10) = " + s.indexOf("the", 10));           // 44
        System.out.println("lastIndexOf(\"the\", 60) = " + s.lastIndexOf("the", 60));   // 55
    }
}
