package part01.chapter14;

/**
 * Пример обобщённого подкласса.
 * Его суперклассом может быть и обычный (необобщённый) класс.
 */

/**
 * Необобщённый класс, являющийся суперклассом для обобщённого подкласса.
 */
class NonGenericSuper {
    int num;

    NonGenericSuper(int i) {
        num = i;
    }

    int getNum() {
        return num;
    }
}

/**
 * Обобщённый подкласс.
 * @param <T> параметр типа
 */
class GenericSub<T> extends NonGenericSuper {
    T obj;

    GenericSub(T o, int i) {
        super(i);
        obj = o;
    }

    T getObj() {
        return obj;
    }
}

class GenericSubclass {
    public static void main(String[] args) {
        GenericSub<String> sub = new GenericSub<String>("Строковое значение", 300);
        System.out.println("Значение объекта T obj (объявленного в подклассе) = " + sub.getObj());
        System.out.println("Значение поля int num (унаследованного от суперкласса) = " + sub.getNum());
    }
}
