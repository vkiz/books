package part01.chapter12;

/**
 * Примеры упаковки/распаковки,
 * автоупаковки/автораспаковки при присваивании значения, передаче/возврате значений в/из метода, в выражениях.
 */
class BoxingUnboxing {

    public static void main(String[] args) {

        // до JDK 5:
        Integer intObj1 = new Integer(100); // упаковка
        int i1 = intObj1.intValue();        // распаковка

        // начиная с JDK 5:
        Integer intObj2 = 100;  // автоупаковка с помощью оператора "="
        int i2 = intObj2;       // автораспаковка с помощью оператора "="

        // автоупаковка значения 100 при передаче аргумента методу
        Integer intObj3 = boxUnbox(100);

        // объект intObj3 распаковывается и вычисляется выражение,
        // результат снова упаковывается и присваивается объекту intObj4
        Integer intObj4 = intObj3 + 2 * intObj3;

        // сочетание числовых объектов разных типов
        Double dblObj = 100.5;
        dblObj = dblObj + intObj4;

        Character chObj = 'a';  // автоупаковка значения типа char (литерала 'a')
        char ch = chObj;        // автораспаковка значения типа char

        // автораспаковка объекта intObj в операторе switch
        Integer intObj = 3;
        switch (intObj) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            default:
                System.out.println("Другое");
        }

        // автораспаковка объекта b в условном операторе if
        Boolean b = true;
        if (b) {
            System.out.println("b = true");
        }

        // автораспаковка объекта b в операторе цикла
        // while (b) { ... }
    }

    static int boxUnbox(Integer i) {
        return i; // автораспаковка при возврате из метода значения типа int
    }
}
