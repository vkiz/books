package part02.chapter18;

import java.util.EnumSet;
import java.util.Set;

/**
 * Пример использования класса EnumSet.
 * Ключи множества имеют тип перечисления enum.
 * Для создания объекта применяется не конструктор, а статические фабричные методы
 * класса EnumSet: allOf, complementOf, copyOf, noneOf, of, range.
 */
class EnumSetDemo {

    private enum Color {

        RED(255, 0, 0),
        GREEN(0, 255, 0),
        BLUE(0, 0, 255);

        private int r;
        private int g;
        private int b;

        private Color(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public int getR() {
            return r;
        }

        public int getG() {
            return g;
        }

        public int getB() {
            return b;
        }
    }

    private static void drawLine(Set<Color> colors) {
        System.out.println("Цвета для рисования линий: " + colors);
        for (Color c : colors) {
            System.out.println("Рисование линии цветом: " + c);
        }
    }

    public static void main(String[] args) {

        EnumSet<Color> yellow = EnumSet.of(Color.RED, Color.GREEN);
        drawLine(yellow); // [RED, GREEN]

        EnumSet<Color> white = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        drawLine(white); // [RED, GREEN, BLUE]

        EnumSet<Color> pink = EnumSet.of(Color.RED, Color.BLUE);
        drawLine(pink); // [RED, BLUE]
    }
}
