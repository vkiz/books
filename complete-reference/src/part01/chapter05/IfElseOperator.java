package part01.chapter05;

/**
 * Оператор выбора (ветвления) - условный оператор if.
 */
class IfElseOperator {
    public static void main(String[] args) {

        int month = 4; // апрель
        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "зима";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "весна";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "лето";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "осень";
        } else {
            season = "не определён";
        }

        System.out.println("Апрель - это " + season);
    }
}
