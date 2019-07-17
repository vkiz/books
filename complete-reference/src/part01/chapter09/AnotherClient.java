package part01.chapter09;

/**
 * Ещё одна реализация интерфейса Callback.
 */
class AnotherClient implements Callback {
    @Override
    public void callback(int p) {
        System.out.print("Ещё одна реализация метода callback(), ");
        System.out.println("p * p = " + (p*p));
    }
}
