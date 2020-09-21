package lesson_6;

public class Cat extends Animal {

    private int runDistanceLimit;
    private double jumpHeightLimit;

    public Cat(int runDistanceLimit, double jumpHeightLimit) {
        this.runDistanceLimit = runDistanceLimit;
        this.jumpHeightLimit = jumpHeightLimit;
    }

    @Override
    public void run(int distance) {

        if (distance <= runDistanceLimit) {
            System.out.println("run: true");
        } else {
            System.out.println("run: false");
        }

    }

    @Override
    public void swim(int distance) {
        System.out.println("swim: can't swim");

    }

    @Override
    public void jump(double height) {

        if (height <= jumpHeightLimit) {
            System.out.println("jump: true");
        } else {
            System.out.println("jump: false");
        }
    }

}
