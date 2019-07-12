package part01.chapter08;

/**
 * Переопределение метода.
 * Вывод программы:
 * k: 300
 */
class Ac {
    int i, j;

    Ac(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i, j: " + i + " " + j);
    }
}

class Bc extends Ac {
    int k;

    Bc(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Переопределённый метод show() - он переопределяет метод show() класса Ac (скрывает имя и заменяет реализацию)
    @Override
    void show() {
        System.out.println("k: " + k);
    }
}

class OverrideMethod {
    public static void main(String[] args) {
        Bc bcObj = new Bc(100, 200, 300);
        bcObj.show(); // вызов переопределённого метода show() из класса Bc. Выведет "k: 300".
    }
}
