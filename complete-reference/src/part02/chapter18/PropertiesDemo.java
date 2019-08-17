package part02.chapter18;

import java.util.Properties;
import java.util.Set;

/**
 * Пример использования класса Properties
 * (набор свойств, расширяет Hashtable).
 *
 * Вывод:
 * Столица штата Калифорния - Сакраменто
 * Столица штата Иллинойс - Спрингфилд
 * Столица штата Вашингтон - Олимпия
 * Столица штата Миссури - Джефферсон-Сити
 * Столица штата Индиана - Индианаполис
 * Столица штата Флорида - не найдена
 */
class PropertiesDemo {
    public static void main(String[] args) {
        // создание набора свойств, где ключами являются названия штатов,
        // а значениями - названия их столиц
        Properties capitals = new Properties();
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        // получение множества ключей
        Set<?> states = capitals.keySet();

        // вывод значений штатов и их столиц
        // (порядок не совпадает с порядком добавления в набор свойств)
        for (Object name : states) {
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String)name));
        }

        // вывод столицы штата, отсутствующего в наборе.
        // Используется значение свойства по умолчанию.
        String cap = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Столица штата Флорида - " + cap);

        // другой способ указания значений по умолчанию -
        // передача значений по умолчанию при создании набора свойств
        /*
        Properties defaults = new Properties();
        defaults.put("Флорида", "Тэллэхасси");
        defaults.put("Висконсин", "Мэдисон");
        Properties capitals = new Properties(defaults);
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");
        String cap = capitals.getProperty("Флорида"); // Тэллэхасси
        System.out.println("Столица штата Флорида - " + cap);
        */
    }
}
