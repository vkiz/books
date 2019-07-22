package part01.chapter11;

/**
 * Пример синхронизации с помощью синхронизированного блока кода.
 * Вывод:
 * [Добро пожаловать]
 * [в синхронизированный]
 * [мир!]
 * Возможен другой порядок вывода строк.
 */
class CallMe2 {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Ожидание прервано.");
        }
        System.out.println("]");
    }
}

class Caller2 implements Runnable {
    String message;
    CallMe2 target;
    Thread t;

    Caller2(CallMe2 targ, String msg) {
        target = targ;
        message = msg;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {     // синхронизированный блок кода
            target.call(message);   // синхронизированный вызов метода call()
        }
    }
}

class SynchronizedBlock {
    public static void main(String[] args) {
        CallMe2 target = new CallMe2();
        Caller2 obj1 = new Caller2(target, "Добро пожаловать");
        Caller2 obj2 = new Caller2(target, "в синхронизированный");
        Caller2 obj3 = new Caller2(target, "мир!");

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
