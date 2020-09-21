package lesson_7;

public class Cat {

    protected final String name;
    private int appetite;
    private boolean satiety = false;
    private int satietyCount;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satietyCount = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        if (!isSatiety() && plate.getFood() > 0) {
            plate.info();
            System.out.println(name + " ест");
            doEat(plate);
            plate.info();
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    private void doEat(Plate plate) {
        int needToEat = Math.min(satietyCount, plate.getFood());
        plate.decreaseFood(needToEat);
        System.out.println("Съели: " + needToEat + " фрикаделек.");
        satietyCount -= needToEat;

        if (satietyCount == 0) {
            satiety = true;
        }
    }








}
