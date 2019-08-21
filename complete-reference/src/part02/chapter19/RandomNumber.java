package part02.chapter19;

import java.util.Random;

/**
 * Пример генерации псевдослучайных чисел с нормальным распределением (Gaussian).
 *
 * Вывод:
 * Среднее всех значений: -0.007118612095061757
 * *
 * ***
 * **********
 * ************
 * ************************
 * ***********************
 * ***************
 * *****
 * ******
 * *
 */
class RandomNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        double value;
        double sum = 0;
        int[] bell = new int[10];

        // генерация значений и их усреднение
        for (int i = 0; i < 100; i++) {
            value = rand.nextGaussian();
            sum += value;
            double t = -2;

            // подсчёт количества значений, попадающих в пределы двух стандартных отклонений
            // с шагом 0.5 в положительную или отрицательную сторону
            for (int x = 0; x < 10; x++, t += 0.5) {
                if (value < t) {
                    bell[x]++;
                    break;
                }
            }
        }

        System.out.println("Среднее всех значений: " + sum / 100);

        // вывод кривой распределения в консоль
        for (int i = 0; i < 10; i++) {
            for (int x = bell[i]; x > 0; x--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
