package part01.chapter08;

/**
 * Наследование классов.
 * Подкласс включает в себя все члены суперкласса,
 * но у него нет доступа к членам суперкласса, объявленным как private.
 */

class AA {                  // Суперкласс
    int i;
    private int j;          // член j доступен только в этом классе

    void setIJ(int x, int y) {
        i = x;
        j = y;
    }
}

class BB extends AA {       // Подкласс
    void printIJ() {
        // System.out.println("i, j: " + i + " " + j); // Ошибка, т.к. член j недоступен в подклассе BB
    }
}
class InheritancePrivate {
    public static void main(String[] args) {
        BB subClassObj = new BB();
        subClassObj.setIJ(300, 100);
        subClassObj.printIJ();
    }
}
