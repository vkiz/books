package part01.chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

/**
 * Пример объявления одночленной аннотации и аннотирования ею метода,
 * получения аннотации и значения её члена.
 */

// Объявление одночленной аннотации
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoOneMember {
    int value(); // имя единственного члена должно быть "value"
}

// Объявление аннотации, у которой только один член имеет имя "value", но есть и другие члены.
// Остальные члены должны иметь другие имена и значения по умолчанию.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoSomeMembers {
    int     value();
    int     abc() default 100;
    String  str() default "Default string";
}

class AnnoOneMember {

    // Аннотирование метода одночленной аннотацией
    // необязательно указывать имя единственного члена (с именем "value"), а только значение
    @MyAnnoOneMember(300)
    public static void myMeth() {
        AnnoOneMember obj = new AnnoOneMember();

        try {
            Method meth = obj.getClass().getMethod("myMeth");
            MyAnnoOneMember anno = meth.getAnnotation(MyAnnoOneMember.class);
            System.out.println("Значение члена аннотации @MyAnnoOneMember: value = " + anno.value());
        } catch (NoSuchMethodException ex) {
            System.out.println("Метод не найден.");
        }
    }

    // Варианты аннотирования:

    // значение члена value = 300, остальных - по умолчанию
    // @MyAnnoSomeMembers(300)

    // если нужно задать значения остальным членам (не по умолчанию)
    // @MyAnnoSomeMembers(value = 300, abc = 123, str = "New string")

    public static void main(String[] args) {
        myMeth();
    }
}
