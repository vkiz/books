package part01.chapter05;

/**
 * Оператор перехода return.
 */
class ReturnOperator {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println("Перед вызовом return");
        if (b) {
            return; // возврат из main() в вызывающий код (в исполняющую систему Java)
        }
        System.out.println("Этот код не выполнится");
    }
}
