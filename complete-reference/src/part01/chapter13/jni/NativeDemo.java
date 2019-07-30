package part01.chapter13.jni;

/**
 * Пример использования платформенно-ориентированного метода,
 * механизм Java Native Interface (JNI).
 */
public class NativeDemo {
    int i;

    public native void test(); // объявление метода, реализация которого будет в нативной библиотеке (коде на C/C++)

    public static void main(String[] args) {
        NativeDemo obj = new NativeDemo();
        obj.i = 100;
        System.out.println("Значение переменной obj.i перед вызовом native-метода: " + obj.i);
        obj.test(); // вызов метода из нативной библиотеки
        System.out.println("Значение переменной obj.i после вызова native-метода: " + obj.i);
    }

    static {
        // загрузка нативной библиотеки по её имени
        // (без зависимого от платформы пути, префикса и расширения dll, so, jnilib/dylib);
        // библиотека ищется по путям, хранящимся в системном свойстве "java.library.path"
        // String libPaths = System.getProperty("java.library.path");
        System.loadLibrary("NativeDemo");

        // загрузка нативной библиотеки по полному имени файла
        // System.load("D:/Projects/Java/java-books/complete-reference/src/part01/chapter13/jni/NativeDemo.dll");
    }
}
