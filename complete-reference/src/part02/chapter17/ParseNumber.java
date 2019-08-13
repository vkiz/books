package part02.chapter17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Пример преобразования строки в число и числа в строку.
 */
class ParseNumber {
    public static void main(String[] args) throws IOException {

        // преобразование введённых строк в целые числа и нахождение их суммы
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // буферизированный поток для чтения строк
        String str;
        int i;
        int sum = 0;
        System.out.println("Введите целое число, 0 - для выхода");
        do {
            str = br.readLine();
            try {
                i = Integer.parseInt(str); // преобразование строки в число
            } catch (NumberFormatException ex) {
                System.out.println("Неверный формат числа");
                i = 0;
            }
            sum += i;
            System.out.println("Значение суммы чисел: " + sum);
        } while (i != 0);

        // преобразование целого числа в строку
        int num = 300;
        System.out.println("Число " + num + " в двоичной форме: " + Integer.toBinaryString(num));       // 100101100
        System.out.println("Число " + num + " в восьмеричной форме: " + Integer.toOctalString(num));    // 454
        System.out.println("Число " + num + " в шестнадцатеричной форме: " + Integer.toHexString(num)); // 12c
    }
}
