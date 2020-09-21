package lesson_6;

public class Dog extends Animal {

    private int runDistanceLimit;
    private int swimDistanceLimit;
    private double jumpHeightLimit;

    public Dog(int runDistanceLimit, int swimDistanceLimit, double jumpHeightLimit) {
        this.runDistanceLimit = runDistanceLimit;
        this.swimDistanceLimit = swimDistanceLimit;
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

        if (distance <= swimDistanceLimit) {
            System.out.println("swim: true");
        } else {
            System.out.println("swim: false");
        }
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
