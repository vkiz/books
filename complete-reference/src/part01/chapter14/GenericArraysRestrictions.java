package part01.chapter14;

/**
 * Ограничения на обобщенные массивы:
 * 1. нельзя создать экземпляр массива, тип элемента которого определяется параметром типа;
 * 2. нельзя создать массив специфических для типа обобщённых ссылок.
 */

class Gen<T extends Number> {
    T obj;
    T vals[];                   // верно
    Gen(T o, T[] nums) {
        obj = o;
        vals = nums;            // верно, можно присвоить ссылку существующему массиву
        // vals = new T[10];    // ошибка, нельзя создать экземпляр массива типа T
    }
}

class GenericArraysRestrictions {
    public static void main(String[] args) {

        Integer arr[] = { 1, 2, 3, 4, 5 };
        Gen<Integer> intGen = new Gen<Integer>(300, arr);

        Gen<?> gens[] = new Gen<?>[100]; // верно

        // нельзя создать массив специфических для типа обобщённых ссылок
        // Gen<Integer> gens[] = new Gen<Integer>[100]; // ошибка
    }
}
