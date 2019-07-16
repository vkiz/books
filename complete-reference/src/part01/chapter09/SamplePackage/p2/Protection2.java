package part01.chapter09.SamplePackage.p2;

/**
 * Подкласс суперкласса Protection из другого пакета p1.
 */
class Protection2 extends part01.chapter09.SamplePackage.p1.Protection {
    Protection2() {
        System.out.println("\nКонструктор класса Protection2, унаследованный из другого пакета");
        System.out.println("Доступные члены: n_prot, n_pub");
    }
}
