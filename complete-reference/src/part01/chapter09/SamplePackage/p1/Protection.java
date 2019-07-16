package part01.chapter09.SamplePackage.p1;

/**
 * Суперкласс.
 */
public class Protection {
    int             n_def = 1;
    private     int n_priv = 2;
    protected   int n_prot = 3;
    public      int n_pub = 4;

    public Protection() {
        System.out.println("\nКонструктор базового класса (Protection)");
        System.out.println("Доступны все члены из этого класса");
    }
}
