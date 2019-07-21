package part01.chapter11;

/**
 * Пример использования метода join() для ожидания завершения
 * дочерних потоков исполнения до завершения главного потока.
 */
class MyThread implements Runnable {

    String name;
    Thread t;

    MyThread(String threadName) {
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

class ThreadAliveJoin {
    public static void main(String[] args) {
        MyThread obj1 = new MyThread("Один");
        MyThread obj2 = new MyThread("Два");
        MyThread obj3 = new MyThread("Три");

        System.out.println("Поток Один запущен: " + obj1.t.isAlive());
        System.out.println("Поток Два запущен: " + obj2.t.isAlive());
        System.out.println("Поток Три запущен: " + obj3.t.isAlive());

        // ожидание завершения потоков
        try {
            System.out.println("Ожидание завершения потоков.");
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException ex) {
            System.out.println("Главный поток прерван.");
        }

        System.out.println("Поток Один запущен: " + obj1.t.isAlive());
        System.out.println("Поток Два запущен: " + obj2.t.isAlive());
        System.out.println("Поток Три запущен: " + obj3.t.isAlive());

        System.out.println("Главный поток завершён.");
    }
}
