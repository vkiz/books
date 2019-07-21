package part01.chapter11;

/**
 * Пример создания нескольких потоков исполнения.
 */
class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); // запуск потока
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Поток " + name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Поток " + name + " прерван.");
        }
        System.out.println("Поток " + name + " завершён.");
    }
}

class MultiThread {
    public static void main(String[] args) {
        // создание потоков
        new NewThread("Один");
        new NewThread("Два");
        new NewThread("Три");

        try {
            // задержка гарантирует завершение главного потока последним
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершён.");
    }
}
