package part01.chapter10;

/**
 * Пример использования оператора finally.
 * Блок кода в операторе finally будет выполнен
 * независимо от того сгенерировано исключение или нет.
 */
class FinallyDemo {
    static void methA() {
        try {
            System.out.println("Выполнение метода methA().");
            throw new RuntimeException("Генерация исключения.");
        } finally {
            System.out.println("Выполнение finally в методе methA().");
        }
    }

    static void methB() {
        try {
            System.out.println("Выполнение метода methB().");
            return;
        } finally {
            System.out.println("Выполнение finally в методе methB().");
        }
    }

    static void methC() {
        try {
            System.out.println("Выполнение метода methC().");
        } finally {
            System.out.println("Выполнение finally в методе methC().");
        }
    }

    public static void main(String[] args) {
        try {
            methA();
        } catch (Exception ex) {
            System.out.println("Перехвачено исключение: " + ex);
        }
        methB();
        methC();
    }
}
