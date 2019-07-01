package part01.chapter03;

/**
 * Двумерный массив (матрица).
 * Вывод программы:
 * 0   1   2   3   4
 * 5   6   7   8   9
 * 10   11   12   13   14
 * 15   16   17   18   19
 */
public class TwoDimArray {
    public static void main(String[] args) {

        int twoDimArr[][] = new int[4][5];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                twoDimArr[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoDimArr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
