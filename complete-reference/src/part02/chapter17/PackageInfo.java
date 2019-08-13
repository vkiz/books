package part02.chapter17;

/**
 * Пример получения информации о пакете.
 *
 * Например, часть вывода:
 * Информация о пакете (имя, заголовок, поставщик, версия):
 * sun.reflect, Java Runtime Environment, Oracle Corporation, 1.8.0_144
 * java.util, Java Runtime Environment, Oracle Corporation, 1.8.0_144
 * java.lang, Java Runtime Environment, Oracle Corporation, 1.8.0_144
 * com.intellij.rt.execution.application, null, null, null
 * part02.chapter17, null, null, null
 */
class PackageInfo {
    public static void main(String[] args) {

        // получение пакетов, доступных текущему экземпляру загрузчика классов (ClassLoader)
        // эти пакеты содержат уже загруженные классы,
        // или ещё не загруженные, но доступные для загрузки по имени

        Package packages[] = Package.getPackages();

        System.out.println("Информация о пакете (имя, заголовок, поставщик, версия):");

        for (Package p : packages) {
            System.out.println(
                    p.getName() + ", " +
                    p.getImplementationTitle() + ", " +
                    p.getImplementationVendor() + ", " +
                    p.getImplementationVersion()
            );
        }
    }
}
