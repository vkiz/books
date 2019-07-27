package part01.chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

/**
 * Пример объявления типа аннотации, аннотирования метода, получения метода,
 * получения аннотации и значений её членов во время выполнения с помощью рефлексии.
 * Вывод:
 * Значения членов аннотации @MyAnno: str = Пример аннотации 1, val = 1
 * Значения членов аннотации @MyAnno: str = Пример аннотации 2, val = 2
 */

// Объявление типа аннотации @MyAnno с правилом удержания RUNTIME
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

class AnnoReflection1 {

    // Аннотирование метода myMeth() аннотацией @MyAnno
    @MyAnno(str = "Пример аннотации 1", val = 1) // инициализация членов аннотации
    public static void myMeth() {
        AnnoReflection1 obj = new AnnoReflection1();

        // получение с помощью рефлексии метода, аннотации метода и значений её членов
        try {
            Class<?> cls = obj.getClass();

            // получение метода по его имени
            Method meth = cls.getMethod("myMeth");

            // получение аннотации по литералу класса аннотации
            // MyAnno.class называется "литералом класса"
            // литерал класса можно получить для классов, интерфейсов, примитивных типов и массивов
            MyAnno anno = meth.getAnnotation(MyAnno.class);

            System.out.println("Значения членов аннотации @MyAnno: str = " + anno.str() + ", val = " + anno.val());

        } catch (NoSuchMethodException ex) {
            System.out.println("Метод не найден.");
        }
    }

    // Аннотирование метода с параметрами myMethWithParams(String s, int i) аннотацией @MyAnno
    @MyAnno(str = "Пример аннотации 2", val = 2) // инициализация членов аннотации
    public static void myMethWithParams(String s, int i) {
        AnnoReflection1 obj = new AnnoReflection1();

        try {
            Class<?> cls = obj.getClass();
            // получение метода по его имени и типам параметров метода
            // в качестве аргументов getMethod() кроме имени метода передаются литералы классов его параметров
            Method meth = cls.getMethod("myMethWithParams", String.class, int.class);
            MyAnno anno = meth.getAnnotation(MyAnno.class);
            System.out.println("Значения членов аннотации @MyAnno: str = " + anno.str() + ", val = " + anno.val());
        } catch (NoSuchMethodException ex) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
        myMethWithParams("Строковый аргумент", 300);
    }
}
