package part01.chapter09.SamplePackage.p1;

/**
 * Класс из этого же пакета, но не подкласс.
 */
class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("\nКонструктор класса из этого же пакета (SamePackage)");
        System.out.println("Доступные члены: p.n_def, p.n_prot, p.n_pub");
    }
}
