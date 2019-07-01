package part01.chapter03;

/**
 * Область действия переменных.
 */
class VariableScope {
    public static void main(String[] args) {

        int x = 10;     // переменная доступна всему коду из метода main()

        if (x == 10) {  // начало блока кода и новой области действия
            int y = 20;
            System.out.println("x и y: " + x + " " + y); // обе переменные доступны
            x = y * 5;
        }               // конец блока кода и области действия

        // y = 100;     // ошибка: переменная y недоступна в этой области действия
        System.out.println("x = " + x);
    }
}
