package lesson1;

public class FirstClass {
    public static void main(String[] args) {

        byte s = 125;
        short h = 634;
        int z = 12047;
        long y = 2_000_000_000_000L;
        float e = 5.21f;
        double f = 87.00344824873;
        char g = 'd';
        boolean isNow = true;

        System.out.println(task3(0.1f, 2.8f, 58.0f, 7.3f));
        System.out.println(task4(5, 7));
        task5(-579);
        System.out.println(task6(10));
        System.out.println(task7("Natalia"));
        task8(3200);

    }

    public static float task3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task4(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }

    public static void task5(int a){

        if (a >= 0) {
            System.out.println("Это число положительное");
        } else {
            System.out.println("Это число отрицательное");
        }
    }

    public static boolean task6(int a) {
        return (a < 0);
    }

    public static String task7(String name) {
        return ("Привет, " + name);
    }

    public static void task8(int a) {

        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0 ) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Этот год невисокосный");
        }

    }


}
