package part02.chapter17;

/**
 * Пример запуска процесса (сторонней программы).
 */
class ProcessExec {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p;
        try {
            p = r.exec("notepad");  // запуск Блокнота
            p.waitFor();            // ожидание завершения процесса
            System.out.println("Процесс возвратил значение " + p.exitValue()); // 0

            p = r.exec("calc");     // запуск Калькулятора
            Thread.sleep(3000);     // пауза 3 секунды
            p.destroy();            // прерывание выполнения процесса

        } catch (Exception ex) {
            System.out.println("Ошибка запуска процесса.");
        }
    }
}
