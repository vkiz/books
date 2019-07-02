package part01.chapter04;

/**
 * Поразрядные операции сдвига.
 */
class BitwiseShiftOperations {
    public static void main(String[] args) {

        byte a = 64;
        byte b;
        int i;

        System.out.println("Сдвиг влево");
        i = a << 2;             // 256
        b = (byte) (a << 2);    // 0
        System.out.println("i и b: " + i + "  " + b);

        System.out.println("\nСдвиг вправо");
        b = (byte) 0xF1;        // 11110001 = 0xF1 = -15
        b = (byte) (b >> 4);    // 11111111 = 0xFF = -1
        i = 35;                 // 00100011
        i = i >> 2;             // 00001000 = 0x08 = 8
        System.out.println("b = " + b);
        System.out.println("i = " + i);

        System.out.println("\nБеззнаковый сдвиг вправо");
        b = (byte) 0xF1;        // 11110001
        b = (byte) (b >>> 4);   // 11111111 = 0xFF = -1;
        // значение b должно было бы быть (00001111 = 0x0F), но оказывается равным 0xFF из-за расширения знака,
        // которое произошло при автоматическом продвижении типа переменной b к типу int со сдвигом.
        System.out.println("b = " + b);
    }
}
