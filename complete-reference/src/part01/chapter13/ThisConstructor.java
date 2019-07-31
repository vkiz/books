package part01.chapter13;

/**
 * Пример вызова перегружаемых конструкторов по ссылке this().
 */

class ThisConstructor {
    int a;
    int b;

    // конструктор инициализирует поля a и b по отдельности (i, j)
    ThisConstructor(int i, int j) {
        a = i;
        b = j;
    }

    /*
    // конструктор инициализирует поля a и b одним и тем же значением (i)
    ThisConstructor(int i) {
        a = i;
        b = i;
    }

    // конструктор инициализирует поля a и b значением по умолчанию (0)
    ThisConstructor() {
        a = 0;
        b = 0;
    }
    */

    // конструктор инициализирует поля a и b одним и тем же значением (i)
    ThisConstructor(int i) {
        this(i, i); // по ссылке this вызывается конструктор ThisConstructor(i, i);
    }

    // конструктор инициализирует поля a и b значением по умолчанию (0)
    ThisConstructor() {
        this(0);    // по ссылке this вызывается конструктор ThisConstructor(0);
    }

    public static void main(String[] args) {
        ThisConstructor obj = new ThisConstructor();
    }
}
