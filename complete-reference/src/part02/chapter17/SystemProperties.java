package part02.chapter17;

import java.util.Map.Entry;

/**
 * Пример чтения переменных окружения операционной системы
 * и свойств JVM (конфигурации текущей рабочей среды, Java platform working environment).
 */
class SystemProperties {
    public static void main(String[] args) {

        System.out.println("Переменные окружения:");

        //System.out.println(System.getenv().toString());

        for (Entry<String, String> entry : System.getenv().entrySet()) {
            System.out.print(entry.getKey() + " = " + entry.getValue() + "\n");
        }

        System.out.println();

        System.out.println("Свойства JVM:");

        // System.out.println(System.getProperties().toString());
        // System.getProperties().list(System.out);

        for (Entry<Object, Object> entry : System.getProperties().entrySet()) {
            System.out.print(entry.getKey().toString() + " = " + entry.getValue().toString() + "\n");
        }

        System.out.println();

        System.out.println("Свойство user.name = " + System.getProperty("user.name"));
    }
}
