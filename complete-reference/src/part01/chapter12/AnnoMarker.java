package part01.chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

/**
 * Пример объявления аннотации-маркера, аннотирования ею метода,
 * определения наличия аннотации у метода (isAnnotationPresent()).
 */

// Объявление аннотации-маркера ( @interface MyAnnoMarker { } )
// с правилом удержания RUNTIME ( @Retention(RetentionPolicy.RUNTIME) )
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoMarker { }

class AnnoMarker {

    // Аннотирование метода аннотацией-маркером
    // можно @MyAnnoMarker(), но скобки после имени аннотации-маркера указывать необязательно
    @MyAnnoMarker
    public static void myMeth() {
        AnnoMarker obj = new AnnoMarker();

        try {
            // определение наличия аннотации у метода
            Method meth = obj.getClass().getMethod("myMeth");
            if (meth.isAnnotationPresent(MyAnnoMarker.class)) {
                System.out.println("Аннотация-маркер @MyAnnoMarker присутствует.");
            }
        } catch (NoSuchMethodException ex) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
