package part01.chapter09.SamplePackage.p1;

/**
 * Подкласс суперкласса Protection из этого же пакета.
 */
class Derived extends Protection {
    Derived() {
        System.out.println("\nКонструктор подкласса (Derived)");
        System.out.println("Доступные члены: n_def, n_prot, n_pub");
    }
}
