package part01.chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

/**
 * Пример объявления нескольких аннотаций, аннотирования класса и метода,
 * получения с помощью рефлексии всех аннотаций (имеющих правило удержания RUNTIME), связанных с классом и методом.
 * Вывод:
 * Все аннотации класса AnnoReflection2:
 * @part01.chapter12.MyAnno2(description=Первая аннотация класса)
 * @part01.chapter12.MyAnno1(str=Вторая аннотация класса, val=1)
 * Все аннотации метода myMeth:
 * @part01.chapter12.MyAnno2(description=Первая аннотация метода)
 * @part01.chapter12.MyAnno1(str=Вторая аннотация метода, val=2)
 */

// Объявление аннотаций
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1 {
    String str();
    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
    String description();
}

// Аннотированный класс
@MyAnno2(description = "Первая аннотация класса")
@MyAnno1(str = "Вторая аннотация класса", val = 1)
class AnnoReflection2 {

    // Аннотированный метод
    @MyAnno2(description = "Первая аннотация метода")
    @MyAnno1(str = "Вторая аннотация метода", val = 2)
    public static void myMeth() {
        AnnoReflection2 obj = new AnnoReflection2();

        try {
            // получение всех аннотаций класса
            Annotation[] annos = obj.getClass().getAnnotations();
            System.out.println("Все аннотации класса AnnoReflection2:");
            for (Annotation an : annos) {
                System.out.println(an); // toString()
            }

            // получение всех аннотаций метода
            Method meth = obj.getClass().getMethod("myMeth");
            annos = meth.getAnnotations();
            System.out.println("Все аннотации метода myMeth():");
            for (Annotation an : annos) {
                System.out.println(an); // toString()
            }
        } catch (NoSuchMethodException ex) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
