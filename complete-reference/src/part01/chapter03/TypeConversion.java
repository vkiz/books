package part01.chapter03;

/**
 * Приведение типов данных.
 */
class TypeConversion {
    public static void main(String[] args) {

        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("Преобразование типа int в тип byte:");
        b = (byte) i;
        System.out.println("i и b: " + i + " " + b);    // 257 и 1 (1 т.к. остаток от деления 257 на 256)

        System.out.println("\nПреобразование типа double в тип int:");
        i = (int) d;
        System.out.println("d и i: " + d + " " + i);    // 323.142 и 323 (323 т.к. дробная часть отбрасывается)

        System.out.println("\nПреобразование типа double в тип byte:");
        b = (byte) d;
        System.out.println("d и b: " + d + " " + b);    // 323.142 и 67 (67 т.к. дробная часть отбрасывается,
                                                        // а затем остаётся остаток от деления 323 на 256)
    }
}
