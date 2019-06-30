package part01.chapter02;

/**
 * Блок кода { } логически связывает несколько операторов.
 */
class BlockSample {
    public static void main(String[] args) {
        int x, y;
        y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println("Значение x = " + x);
            System.out.println("Значение y = " + y);
            y = y - 2;
        }
    }
}
