package part01.chapter02;

/**
 * Условный оператор if.
 */
class IfSample {
    public static void main(String[] args) {

        int x = 10, y = 20;

        if (x < y) {
            System.out.println("x меньше y");
        }

        x = x * 2;
        if (x == y) {
            System.out.println("теперь x равно y");
        }

        x = x * 2;
        if (x > y) {
            System.out.println("теперь x больше y");
        }

        if (x == y) {
            System.out.println("эта строка не выведется");
        }
    }
}
