package part02.chapter17;

/**
 * Пример запуска процесса с помощью метода start() класса ProcessBuilder.
 */
class ProcessStart {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("notepad", "D://file.txt");
            pb.start();
        } catch (Exception ex) {
            System.out.println("Ошибка запуска процесса.");
        }
    }
}
