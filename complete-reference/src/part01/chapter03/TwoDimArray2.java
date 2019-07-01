package part01.chapter03;

/**
 * Двумерный массив с разной размерностью второго измерения.
 * (Неоднородный, нерегулярный массив)
 * Вывод программы:
 * 0
 * 1   2
 * 3   4   5
 * 6   7   8   9
 */
public class TwoDimArray2 {
    public static void main(String[] args) {

        int twoDimArr[][] = new int[4][]; // отдельное резервирование памяти для второго измерения массива
        twoDimArr[0] = new int[1];
        twoDimArr[1] = new int[2];
        twoDimArr[2] = new int[3];
        twoDimArr[3] = new int[4];

        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                twoDimArr[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(twoDimArr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
