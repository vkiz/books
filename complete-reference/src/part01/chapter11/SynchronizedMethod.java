package part01.chapter11;

/**
 * Пример синхронизации с помощью синхронизированного метода.
 * Вывод:
 * [Добро пожаловать]
 * [в синхронизированный]
 * [мир!]
 * Возможен другой порядок вывода строк.
 */
class CallMe1 {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Ожидание прервано.");
        }
        System.out.println("]");
    }
}

class Caller1 implements Runnable {
    String message;
    CallMe1 target;
    Thread t;

    Caller1(CallMe1 targ, String msg) {
        target = targ;
        message = msg;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(message);
    }
}

class SynchronizedMethod {
    public static void main(String[] args) {
        CallMe1 target = new CallMe1();
        Caller1 obj1 = new Caller1(target, "Добро пожаловать");
        Caller1 obj2 = new Caller1(target, "в синхронизированный");
        Caller1 obj3 = new Caller1(target, "мир!");

        // ожидание завершения потока
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException ex) {
            System.out.println("Поток прерван.");
        }
    }
}
