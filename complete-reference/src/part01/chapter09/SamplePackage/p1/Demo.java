package part01.chapter09.SamplePackage.p1;

/**
 * Пример защиты доступа к членам класса
 * с помощью совокупности пакетов и модификаторов доступа.
 */
public class Demo {
    public static void main(String[] args) {
        Protection obj1 = new Protection();
        Derived obj2 = new Derived();
        SamePackage obj3 = new SamePackage();
    }
}
