package part01.chapter03;

/**
 * Трёхмерный массив.
 * Вывод программы:
 * 0   0   0   0   0
 * 0   0   0   0   0
 * 0   0   0   0   0
 * 0   0   0   0   0
 *
 * 0   0   0   0   0
 * 0   1   2   3   4
 * 0   2   4   6   8
 * 0   3   6   9   12
 *
 * 0   0   0   0   0
 * 0   2   4   6   8
 * 0   4   8   12   16
 * 0   6   12   18   24
 */
class ThreeDimArray {
    public static void main(String[] args) {

        int threeDimArr[][][] = new int[3][4][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    threeDimArr[i][j][k] = i * j * k;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(threeDimArr[i][j][k] + "   ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
