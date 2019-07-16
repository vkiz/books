package part01.chapter09.PackageImport;

import part01.chapter09.PackageImport.MyPackage.*;            // импорт всех классов из пакета MyPackage
// import part01.chapter09.PackageImport.MyPackage.Balance;   // импорт только класса Balance

/**
 * Пример импорта класса из пакета.
 */
class TestBalance {
    public static void main(String[] args) {
        Balance test = new Balance("Vladimir", 1_000_000);
        test.show();
    }
}
