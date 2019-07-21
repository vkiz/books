package part01.chapter11;

/**
 * Пример создания и запуска нового потока
 * с помощью класса, реализующего интерфейс Runnable.
 */
class NewThread1 implements Runnable {

    NewThread1() {
        // создание нового потока
        Thread t = new Thread(this, "NewThreadName");
        System.out.println("Создан новый дочерний поток: " + t);
        t.start(); // запуск потока
    }

    /**
     * Точка входа в новый поток исполнения.
     * Код внутри метода выполняется в отдельном потоке.
     */
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершён.");
    }
}

class NewThread1Demo {
    public static void main(String[] args) {
        new NewThread1();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершён.");
    }
}
