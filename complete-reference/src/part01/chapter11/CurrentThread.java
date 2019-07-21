package part01.chapter11;

/**
 * Пример управления главным потоком исполнения.
 */
class CurrentThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток исполнения: " + t);

        t.setName("New name");
        System.out.println("После изменения имени: " + t);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Текущий поток исполнения прерван.");
        }
    }
}
