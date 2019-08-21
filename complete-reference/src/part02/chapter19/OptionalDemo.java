package part02.chapter19;

import java.util.Optional;

/**
 * Пример использования обобщённого класса Optional.
 * Экземпляр класса Optional может содержать значение типа T или быть пустым (null).
 * Некоторые методы: empty, of, isPresent, get, orElse.
 */
class OptionalDemo {
    public static void main(String[] args) {

        // создание экземпляров класса Optional c помощью вызова статических методов,
        // в Optional конструкторы не определены

        // объект не содержит значения
        Optional<String> noValue = Optional.empty();

        // объект содержит значение (не null, иначе NullPointerException)
        Optional<String> hasValue = Optional.of("ABCDE");

        if (noValue.isPresent()) { // = false
            System.out.println("Значение предоставлено.");
        } else {
            System.out.println("Объект noValue не содержит значения."); // вывод
        }

        if (hasValue.isPresent()) { // = true
            System.out.println("Значение предоставлено.");
            System.out.println("Объект hasValue содержит значение: " + hasValue.get()); // ABCDE
            // если значение не предоставлено, то вызов get() вернёт NoSuchElementException
        }

        // метод orElse() возвращает значение по умолчанию если Optional-объект не содержит значения,
        // или само значение, если оно предоставлено
        String value = noValue.orElse("Значение по умолчанию");
        System.out.println(value); // Значение по умолчанию
    }
}
