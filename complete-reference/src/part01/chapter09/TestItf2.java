package part01.chapter09;

/**
 * Какой метод будет вызван зависит от конкретного экземпляра интерфейса.
 * Результат:
 * Вызов метода callback(), значение p = 300
 * Ещё одна реализация метода callback(), p * p = 90000
 */
class TestItf2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient obj = new AnotherClient();
        c.callback(300);
        c = obj;
        c.callback(300);
    }
}
