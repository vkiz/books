package part01.chapter03;

/**
 * Автоматическое продвижение типов в выражении.
 */
class TypePromote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 12.8f;
        double d = .1;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println("result = " + result);
    }
}
