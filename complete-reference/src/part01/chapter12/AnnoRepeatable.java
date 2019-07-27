package part01.chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

/**
 * Пример объявления, применения и получения повторяющейся аннотации.
 * Вывод:
 * Способ 1:
 * @part01.chapter12.MyContainerAnno(value=[@part01.chapter12.MyRepeatableAnno(str=Первая аннотация, xyz=100), @part01.chapter12.MyRepeatableAnno(str=Вторая аннотация, xyz=200), @part01.chapter12.MyRepeatableAnno(str=Третья аннотация, xyz=300)])
 * Способ 2:
 * @part01.chapter12.MyRepeatableAnno(str=Первая аннотация, xyz=100)
 * @part01.chapter12.MyRepeatableAnno(str=Вторая аннотация, xyz=200)
 * @part01.chapter12.MyRepeatableAnno(str=Третья аннотация, xyz=300)
 */

// Объявление повторяющейся аннотации @MyRepeatableAnno
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyContainerAnno.class) // передача аннотации @MyContainerAnno в качестве аргумента
@interface MyRepeatableAnno {
    String str() default "Default value";
    int xyz() default 1;
}

// Объявление контейнерной аннотации @MyContainerAnno
@Retention(RetentionPolicy.RUNTIME)
@interface MyContainerAnno {
    MyRepeatableAnno[] value();
}

class AnnoRepeatable {

    // Аннотирование повторяющейся аннотацией метода myMeth()
    @MyRepeatableAnno(str = "Первая аннотация", xyz = 100)
    @MyRepeatableAnno(str = "Вторая аннотация", xyz = 200)
    @MyRepeatableAnno(str = "Третья аннотация", xyz = 300)
    public static void myMeth(String s, int i) {

        AnnoRepeatable obj = new AnnoRepeatable();

        try {
            Class<?> cls = obj.getClass();
            Method meth = cls.getMethod("myMeth", String.class, int.class);

            // Получение повторяющихся аннотаций:

            // в виде строки из контейнерной аннотации @MyContainerAnno
            System.out.println("Способ 1:");
            Annotation anno = meth.getAnnotation(MyContainerAnno.class);
            System.out.println(anno); // toString()

            // напрямую массива аннотаций типа @MyRepeatableAnno (начиная с JDK 8)
            System.out.println("Способ 2:");
            Annotation[] annos = meth.getAnnotationsByType(MyRepeatableAnno.class);
            for (Annotation a : annos) {
                System.out.println(a);
            }

        } catch (NoSuchMethodException ex) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("Тест", 123);
    }
}
