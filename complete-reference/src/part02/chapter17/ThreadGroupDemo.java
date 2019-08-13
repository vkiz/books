package part02.chapter17;

/**
 * Класс потока исполнения.
 * Применяется рекомендованный подход для приостановки и возобновления потока
 * (без использования не рекомендованных к употреблению методов suspend() и resume()).
 */
class NewThread extends Thread {

    private boolean suspendFlag; // флаг приостановки выполнения потока

    NewThread(String threadName, ThreadGroup threadGroup) {
        super(threadGroup, threadName);
        System.out.println("Новый поток: " + this);
        suspendFlag = false;
        start(); // запуск выполнения потока
    }

    /**
     * Точка входа в поток исполнения.
     * Код в этом методе выполняется в потоке.
     */
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait(); // приостановить поток
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Исключение в потоке " + getName());
        }
        System.out.println("Завершается поток " + getName());
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify(); // пробудить поток
    }
}

/**
 * Пример создания группы потоков исполнения (2 группы по 2 потока).
 */
class ThreadGroupDemo {
    public static void main(String[] args) {

        ThreadGroup group1 = new ThreadGroup("Группа 1");
        ThreadGroup group2 = new ThreadGroup("Группа 2");

        NewThread thread1 = new NewThread("Поток 1", group1);
        NewThread thread2 = new NewThread("Поток 2", group1);
        NewThread thread3 = new NewThread("Поток 3", group2);
        NewThread thread4 = new NewThread("Поток 4", group2);

        System.out.println("Список потоков:");
        group1.list();
        group2.list();
        System.out.println();

        Thread tg1[] = new Thread[group1.activeCount()];
        group1.enumerate(tg1);

        System.out.println("Приостановка выполнения потоков из группы 1");
        for (int i = 0; i < tg1.length; i++) {
            ((NewThread)tg1[i]).mySuspend(); // приостановить выполнение потока
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            System.out.println("Главный поток исполнения прерван.");
        }

        System.out.println("Возобновление выполнения потоков из группы 1");
        for (int i = 0; i < tg1.length; i++) {
            ((NewThread)tg1[i]).myResume(); // возобновить выполнение потока
        }

        // ожидать завершения всех потоков
        try {
            System.out.println("Ожидание завершения всех потоков исполнения");
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException ex) {
            System.out.println("Главный поток исполнения прерван.");
        }
        System.out.println("Главный поток исполнения завершён.");
    }
}
