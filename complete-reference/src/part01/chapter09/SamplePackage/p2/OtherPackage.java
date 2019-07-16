package part01.chapter09.SamplePackage.p2;

/**
 * Класс из другого пакета.
 */
class OtherPackage {
    OtherPackage() {
        part01.chapter09.SamplePackage.p1.Protection p = new part01.chapter09.SamplePackage.p1.Protection();
        System.out.println("\nКонструктор класса из другого пакета (p2.OtherPackage)");
        System.out.println("Доступные члены: только n_pub");
    }
}
