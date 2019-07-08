package part01.chapter07;

/**
 * Аргументы командной строки.
 * Передача аргументов во время запуска программы:
 * java CommandLine This is a test 300
 */
class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}

/*
Вывод программы:
args[0]: This
args[1]: is
args[2]: a
args[3]: test
args[4]: 300
 */
