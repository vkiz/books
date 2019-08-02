package part01.chapter14;

/**
 * Пример ограниченного метасимвольного аргумента (?) в методе обобщённого класса.
 *
 * Вывод:
 * Содержимое объекта twoDimCoords:
 * Координаты X, Y:
 * 1, 2
 * 5, 10
 * 15, 20
 * 25, 30
 *
 * Содержимое объекта fourDimCoords:
 * Координаты X, Y:
 * 1, 2
 * 5, 7
 * 5, 10
 * -1, -2
 *
 * Координаты X, Y, Z:
 * 1, 2, 3
 * 5, 7, 10
 * 5, 10, 15
 * -1, -2, -3
 *
 * Координаты X, Y, Z, K:
 * 1, 2, 3, 4
 * 5, 7, 10, 15
 * 5, 10, 15, 20
 * -1, -2, -3, 0
 *
 */

class TwoDim {
    int x, y;

    TwoDim(int a, int b) {
        x = a;
        y = b;
    }
}

class ThreeDim extends TwoDim {
    int z;

    ThreeDim(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

class FourDim extends ThreeDim {
    int k;

    FourDim(int a, int b, int c, int d) {
        super(a, b, c);
        k = d;
    }
}

/**
 * Класс хранит массив координатных объектов.
 * @param <T> ограниченный параметр типа
 */
class Coords<T extends TwoDim> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}

/**
 * Применение ограниченных метасимволов.
 */
class GenericMetaArgBounded {

    static void showXY(Coords<?> c) {
        System.out.println("Координаты X, Y: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + ", " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeDim> c) {
        System.out.println("Координаты X, Y, Z: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + ", " + c.coords[i].y + ", " + c.coords[i].z);
        }
        System.out.println();
    }

    static void showXYZK(Coords<? extends FourDim> c) {
        System.out.println("Координаты X, Y, Z, K: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + ", " + c.coords[i].y + ", " + c.coords[i].z + ", " + c.coords[i].k);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        TwoDim twoDim[] = {
                new TwoDim(1, 2),
                new TwoDim(5, 10),
                new TwoDim(15, 20),
                new TwoDim(25, 30)
        };

        Coords<TwoDim> twoDimCoords = new Coords<TwoDim>(twoDim);
        System.out.println("Содержимое объекта twoDimCoords:");
        showXY(twoDimCoords);       // OK, т.к. аргумент имеет тип TwoDim
        // showXYZ(twoDimCoords);   // ошибка компиляции, т.к. аргумент не типа ThreeDim
        // showXYZK(twoDimCoords);  // ошибка компиляции, т.к. аргумент не типа FourDim

        FourDim fourDim[] = {
                new FourDim(1, 2, 3, 4),
                new FourDim(5, 7, 10, 15),
                new FourDim(5, 10, 15, 20),
                new FourDim(-1, -2, -3, 0)
        };

        Coords<FourDim> fourDimCoords = new Coords<FourDim>(fourDim);
        System.out.println("Содержимое объекта fourDimCoords:");
        showXY(fourDimCoords);      // OK
        showXYZ(fourDimCoords);     // OK
        showXYZK(fourDimCoords);    // OK
    }
}
