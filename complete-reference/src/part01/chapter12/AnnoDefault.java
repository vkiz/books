package part01.chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

/**
 * Пример объявления и использования аннотации с значениями членов аннотации по умолчанию.
 * Возможные варианты аннотирования:
 * @MyAnno3()                                   // значения str и val принимаются по умолчанию
 * @MyAnno3(str = "Тестирование")               // значение val - по умолчанию
 * @MyAnno3(val = 300)                          // значение str - по умолчанию
 * @MyAnno3(str = "Тестирование", val = 300)    // значения str и val - не по умолчанию
 */

// Объявление аннотации @MyAnno3 с значениями членов по умолчанию
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
    String str() default "Default value";
    int val() default 100;
}

class AnnoDefault {

    // Аннотирование метода myMeth() аннотацией @MyAnno3
    // без задания значений членам аннотации - используются значения по умолчанию
    @MyAnno3()
    public static void myMeth() {
        AnnoDefault obj = new AnnoDefault();

        try {
            Class<?> cls = obj.getClass();
            Method meth = cls.getMethod("myMeth");
            MyAnno3 anno = meth.getAnnotation(MyAnno3.class);
            System.out.println("Значения членов аннотации @MyAnno3: str = " + anno.str() + ", val = " + anno.val());
        } catch (NoSuchMethodException ex) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
