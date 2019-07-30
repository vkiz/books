package part01.chapter13;

/**
 * Пример использования метода System.out.write()
 * класса потока вывода байтов PrintStream.
 */
class PrintStreamWrite {
    public static void main(String[] args) {
        int i = 'A';
        System.out.write(i); // выводится байтовое значение, записываются только 8 младших бит значения int.
        System.out.write('\n');
    }
}
