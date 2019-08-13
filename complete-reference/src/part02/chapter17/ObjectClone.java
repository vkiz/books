package part02.chapter17;

/**
 * Класс, позволяющий клонировать его объекты.
 *
 * Клонировать можно только объекты тех классов, которые реализуют интерфейс java.lang.Cloneable.
 * Если вызвать метод clone() у объекта класса, не реализующего интерфейс Cloneable, то будет сгенерировано исключение
 * типа java.lang.CloneNotSupportedException.
 * Можно создать отдельный метод, вызывающий метод clone() из суперкласса Object (как в данном примере)
 * или переопределить метод protected native Object.clone() как public clone().
 */
class CloneableClass1 implements Cloneable {
    int a;
    double b;

    CloneableClass1 cloneMethod() {
        try {
            return (CloneableClass1) super.clone(); // вызов метода clone() из суперкласса Object
        } catch (CloneNotSupportedException ex) {
            System.out.println("Клонирование объекта невозможно");
            return this;
        }
    }
}

/**
 * Класс, позволяющий клонировать его объекты.
 * Используется второй вариант - переопределение метода protected native Object.clone() как public clone().
 */
class CloneableClass2 implements Cloneable {
    int a;
    double b;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Клонирование объекта невозможно");
            return this;
        }
    }
}

/**
 * Пример клонирования (создания дубликата, точной копии) объекта с помощью метода Object.clone().
 * При клонировании конструктор клонируемого объекта _не вызывается_.
 */
class ObjectClone {
    public static void main(String[] args) {

        // пример клонирования объекта класса CloneableClass1
        CloneableClass1 obj1 = new CloneableClass1();
        CloneableClass1 obj2;

        obj1.a = 300;
        obj1.b = 123.45;
        obj2 = obj1.cloneMethod(); // клонирование

        System.out.println("obj1: " + obj1.a + ", " + obj1.b); // obj1: 300, 123.45
        System.out.println("obj2: " + obj2.a + ", " + obj2.b); // obj2: 300, 123.45

        // пример клонирования объекта класса CloneableClass2
        CloneableClass2 obj3 = new CloneableClass2();
        CloneableClass2 obj4;

        obj3.a = 300;
        obj3.b = 123.45;
        obj4 = (CloneableClass2) obj3.clone(); // клонирование

        System.out.println("obj3: " + obj3.a + ", " + obj3.b); // obj3: 300, 123.45
        System.out.println("obj4: " + obj4.a + ", " + obj4.b); // obj4: 300, 123.45
    }
}
