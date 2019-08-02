package part01.chapter14;

/**
 * Пример эквивалента класса Generic, но без использования обобщения.
 * Вывод:
 * Объект obj имеет тип java.lang.Integer
 * Значение = 300
 * Объект obj имеет тип java.lang.String
 * Значение = Строковое значение
 * Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
 * at part01.chapter14.NonGenericExample.main(NonGenericExample.java:50)
 */

/**
 * Необобщённый класс
 */
class NonGeneric {
    Object obj;

    NonGeneric(Object o) {
        obj = o;
    }

    Object getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Объект obj имеет тип " + obj.getClass().getName());
    }
}

class NonGenericExample {
    public static void main(String[] args) {

        NonGeneric intObj = new NonGeneric(300);
        intObj.showType();
        int i = (Integer) intObj.getObj();
        System.out.println("Значение = " + i);

        NonGeneric strObj = new NonGeneric("Строковое значение");
        strObj.showType();
        String s = (String) strObj.getObj();
        System.out.println("Значение = " + s);

        // код ниже компилируется без ошибки, но будет исключение во время выполнения,
        // т.к. выполняем приведение результата метода getObj() к типу Integer,
        // а в переменной intObj уже содержится ссылка на объект со строковым значением
        intObj = strObj;
        i = (Integer) intObj.getObj(); // ClassCastException
    }
}
