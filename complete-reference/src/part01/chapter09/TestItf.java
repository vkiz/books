package part01.chapter09;

/**
 * Доступ к реализации класса через ссылку на интерфейс.
 */
class TestItf {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(300);
    }
}
