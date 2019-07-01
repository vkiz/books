package part01.chapter03;

/**
 * Тип данных long. Вычисление расстояния, проходимого светом.
 */
class LightLong {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000; // миль в сек.
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдёт около ");
        System.out.println(distance + " миль.");
    }
}
