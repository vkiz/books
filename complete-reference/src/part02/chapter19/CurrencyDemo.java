package part02.chapter19;

import java.util.Currency;
import java.util.Locale;

/**
 * Пример использования класса Currency.
 * Он инкапсулирует сведения о денежной единице (валюте).
 * Денежная единица идентифицируется кодом, определённым в стандарте ISO 4217 (код валюты).
 * Экземпляр класса создаётся статическим методом getInstance() по локали или коду валюты.
 * Конструкторы не определены.
 */
class CurrencyDemo {
    public static void main(String[] args) {

        Currency cur = Currency.getInstance(Locale.US);

        // символ валюты для заданной локали
        System.out.println("Символ валюты: " + cur.getSymbol(Locale.US)); // $

        // return getSymbol(Locale.getDefault(Locale.Category.DISPLAY));
        System.out.println("Символ валюты из региональных настроек по умолчанию: " + cur.getSymbol()); // USD

        // return getDisplayName(Locale.getDefault(Locale.Category.DISPLAY));
        System.out.println("Имя валюты из региональных настроек по умолчанию: " + cur.getDisplayName()); // US Dollar

        System.out.println("Количество цифр в дробной части числа по умолчанию: " + cur.getDefaultFractionDigits()); // 2

        System.out.println("Код валюты: " + cur.getCurrencyCode()); // USD

        System.out.println("Числовой код валюты: " + cur.getNumericCode()); // 840
    }
}
