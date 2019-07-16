package part01.chapter09.PackageImport.MyPackage;

/**
 * Импорт пакетов.
 * Класс, конструктор и метод являются открытыми (public) и доступны за пределами своего пакета
 * даже для классов, не производных от классов из пакета
 */
public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal > 0) {
            System.out.println("Name: " + name + ", Balance: $" + bal);
        }
    }
}
