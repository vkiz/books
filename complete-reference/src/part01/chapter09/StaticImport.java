package part01.chapter09;

// Импорт статических методов
import static java.lang.Math.sqrt;  // квадратный корень
import static java.lang.Math.pow;   // возведение x в степень y

// Импорт статического поля System.out
import static java.lang.System.out; // стандартный поток вывода out

/**
 * Статический импорт (импорт статических членов класса или интерфейса).
 */
public class StaticImport {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double hypot = sqrt(pow(a, 2) + pow(b, 2));                         // вместо Math.sqrt() и Math.pow()
        out.println("Гипотенуза прямоугольного треугольника = " + hypot);   // вместо System.out.println()
    }
}
