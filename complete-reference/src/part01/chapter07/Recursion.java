package part01.chapter07;

/**
 * Рекурсия (вычисление факториала числа).
 */
class Factorial {
    int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));
    }
}
