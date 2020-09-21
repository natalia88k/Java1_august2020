package lesson_7;

public class Test {

    private static Cat[] cats;
    private static Plate[] plates;

    public static void whoLetTheCatsOut() {
        for (Cat cat : cats) {
            for (Plate plate : plates) {
                if (!cat.isSatiety()) {
                    cat.eat(plate);
                }
            }
            System.out.println("---");
        }
    }

    public static void printCatsInfo() {
        for (Cat cat : cats) {
            if (cat.isSatiety()) {
                System.out.println(cat.getName() + " накушался.");
            } else {
                System.out.println(cat.getName() + " голодный.");
            }
        }
        System.out.println("---");
    }

    public static void main(String[] args) {

        cats = new Cat[3];
        plates = new Plate[3];

        cats[0] = new Cat("Булочка", 5);
        cats[1] = new Cat("Пирожок", 10);
        cats[2] = new Cat("Пончик", 2);

        plates[0] = new Plate(5);
        plates[1] = new Plate(5);
        plates[2] = new Plate(5);

        whoLetTheCatsOut();
        printCatsInfo();

        System.out.println("*Звук открывающейся упаковки с фрикадельками*");
        plates[2].addFood(5);

        whoLetTheCatsOut();
        printCatsInfo();
    }
}
