package part01.chapter11;

/**
 * Пример взаимной блокировки потоков.
 * Вывод:
 * Главный поток зашёл в метод A.foo()
 * Соперничающий поток зашёл в метод B.foo()
 * Главный поток пытается вызвать метод B.last()
 * Соперничающий поток пытается вызвать метод A.last()
 * Далее программа "зависает"
 */

class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " зашёл в метод A.foo()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("sleep() в классе A прерван.");
        }
        System.out.println(name + " пытается вызвать метод B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("Выполняется метод A.last()");
    }
}

class B {
    synchronized void foo(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " зашёл в метод B.foo()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("sleep() в классе B прерван.");
        }
        System.out.println(name + " пытается вызвать метод A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("Выполняется метод B.last()");
    }
}

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();

        a.foo(b);
        System.out.println("Назад в главный поток");
    }

    @Override
    public void run() {
        b.foo(a);
        System.out.println("Назад в соперничающий поток");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
