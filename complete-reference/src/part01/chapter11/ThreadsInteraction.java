package part01.chapter11;

/**
 * Взаимодействие потоков на примере создания поставщика и потребителя данных.
 * Организуется очередь, когда данные поставляются в одном потоке поставщиком,
 * а обрабатываются потребителем в другом потоке.
 * Поставщик данных ожидает завершения работы потребителя,
 * прежде чем сформировать новые данные.
 *
 * Вывод:
 * Отправлено: 1
 * Получено: 1
 * Отправлено: 2
 * Получено: 2
 * Отправлено: 3
 * Получено: 3
 * и т.д.
 */

/**
 * Класс очереди с синхронизированными методами добавления и извлечения данных.
 */
class Queue {
    int n;
    boolean valueSet = false;

    /**
     * Метод извлекает данные из очереди.
     * После вызова метода wait() исполнение потока приостанавливается до тех пор,
     * пока объект класса Producer не уведомит, что данные прочитаны.
     * Как только данные будут получены, то вызовется метод notify().
     * Этим объект класса Producer уведомляется о том, что всё в порядке
     * и в очереди можно разместить следующий элемент данных.
     */
    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Перехвачено исключение.");
            }
        }

        System.out.println("Получено: " + n);
        valueSet = false;
        notify();

        return n;
    }

    /**
     * Метод помещает данные в очередь.
     * После вызова метода wait() исполнение потока приостанавливается до тех пор,
     * пока объект класса Consumer не извлечёт элемент из очереди.
     * Когда исполнение потока возобновится, то следующий элемент данных
     * размещается в очереди и вызывается метод notify().
     * Этим объект класса Consumer уведомляется, что он теперь может извлечь элемент из очереди.
     */
    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Перехвачено исключение.");
            }
        }

        this.n = n;
        valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}

/**
 * Класс поставщика данных, добавляющий данные в очередь.
 */
class Producer implements Runnable {
    Queue q;

    Producer(Queue q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

/**
 * Класс потребителя данных, извлекающий данные из очереди.
 */
class Consumer implements Runnable {
    Queue q;

    Consumer(Queue q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}

class ThreadsInteraction {
    public static void main(String[] args) {
        Queue q = new Queue();
        new Producer(q);
        new Consumer(q);
    }
}
