package part01.chapter05;

/**
 * Оператор выбора (ветвления) switch.
 */
class SwitchOperator {
    public static void main(String[] args) {

        System.out.println("Оператор switch");
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i = 0");
                    break;
                case 1:
                    System.out.println("i = 1");
                    break;
                case 2:
                    System.out.println("i = 2");
                    break;
                case 3:
                    System.out.println("i = 3");
                    break;
                default:
                    System.out.println("i > 3");
            }
        }

        System.out.println("\nОператор switch без оператора break");
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i < 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i < 10");
                    break;
                default:
                    System.out.println("i >= 10");
            }
        }

        System.out.println("\nИспользование символьных строк для управления оператором switch");
        String str = "три";
        switch (str) {
            case "один":
                System.out.println("один");
                break;
            case "два":
                System.out.println("два");
                break;
            case "три":
                System.out.println("три");
                break;
            default:
                System.out.println("нет совпадений");
        }

        System.out.println("\nВложенные операторы switch");
        int count = 1;
        int target = 1;
        switch (count) {
            case 1:
                System.out.println("count = 1");
                switch (target) {
                    case 0:
                        System.out.println("target = 0");
                        break;
                    case 1:
                        System.out.println("target = 1");
                        break;
                }
                break;
            case 2:
                System.out.println("count = 2");
                // ...
                break;
        }
    }
}
