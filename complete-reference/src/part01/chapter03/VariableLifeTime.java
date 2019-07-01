package part01.chapter03;

/**
 * Срок действия переменных.
 */
class VariableLifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = 1; // переменная инициализируется при каждом вхождении в блок кода
            System.out.println("y = " + y);
            y = 100;
            System.out.println("Теперь y = " + y);
        }
    }
}
