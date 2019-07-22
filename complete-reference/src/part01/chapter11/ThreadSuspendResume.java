package part01.chapter11;

/**
 * Пример управления выполнением потока.
 * С помощью проверки флаговой переменной и методов wait() и notify()
 * выполняется приостановка и возобновление выполнения потока.
 */

class NThread implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException ex) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершён.");
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}

class ThreadSuspendResume {
    public static void main(String[] args) {
        NThread obj1 = new NThread("Один");
        NThread obj2 = new NThread("Два");

        try {
            Thread.sleep(1000);
            obj1.mySuspend();
            System.out.println("Приостановка потока Один");

            Thread.sleep(1000);
            obj1.myResume();
            System.out.println("Возобновление потока Один");

            obj2.mySuspend();
            System.out.println("Приостановка потока Два");

            Thread.sleep(1000);
            obj2.myResume();
            System.out.println("Возобновление потока Два");

        } catch (InterruptedException ex) {
            System.out.println("Главный поток прерван.");
        }

        // ожидание завершения потоков
        try {
            System.out.println("Ожидание завершения потоков");
            obj1.t.join();
            obj2.t.join();
        } catch (InterruptedException ex) {
            System.out.println("Главный поток прерван.");
        }

        System.out.println("Главный поток завершён.");
    }
}
