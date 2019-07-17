package part01.chapter09;

/**
 * Пример использования двух реализаций интерфейса стека.
 * Применяется ссылка на интерфейс IntStack.
 * Поиск реализации при вызове методов push() и pop()
 * осуществляется во время выполнения, а не во время компиляции.
 *
 * Обращение к нескольким реализациям интерфейса через ссылочную переменную интерфейса
 * является эффективным средством для поддержки полиморфизма во время выполнения.
 */
public class DynFixStackTest {
    public static void main(String[] args) {

        IntStack st; // ссылка на интерфейс

        DynStack dynSt = new DynStack(5);
        FixedStack fixSt = new FixedStack(8);

        st = dynSt;
        for (int i = 0; i < 12; i++) {
            st.push(i);
        }

        st = fixSt;
        for (int i = 0; i < 8; i++) {
            st.push(i);
        }

        st = dynSt;
        System.out.println("Значения в динамическом стеке:");
        for (int i = 0; i < 12; i++) {
            System.out.println(st.pop());
        }

        st = fixSt;
        System.out.println("Значения в фиксированном стеке:");
        for (int i = 0; i < 8; i++) {
            System.out.println(st.pop());
        }
    }
}
