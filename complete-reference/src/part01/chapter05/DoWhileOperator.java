package part01.chapter05;

/**
 * Оператор цикла do-while.
 */
class DoWhileOperator {
    public static void main(String[] args) throws java.io.IOException {

        System.out.println("Оператор цикла do-while");
        int n = 10;
        do {
            System.out.println("n = " + n); // значения от 10 до 1
            n--;
        } while (n > 0);

        // Более эффективная форма
        n = 10;
        do {
            System.out.println("n = " + n); // значения от 10 до 1
        } while (--n > 0);

        System.out.println("\nРеализация меню с помощью оператора do-while");
        char choice;
        do {
            System.out.println("Справка по оператору:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for\n");
            System.out.println("Выберите нужный пункт...");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("Вывод справки:");

        switch (choice) {
            case '1':
                System.out.println("Справка по оператору if");
                break;
            case '2':
                System.out.println("Справка по оператору switch");
                break;
            case '3':
                System.out.println("Справка по оператору while");
                break;
            case '4':
                System.out.println("Справка по оператору do-while");
                break;
            case '5':
                System.out.println("Справка по оператору for");
                break;
        }
    }
}
