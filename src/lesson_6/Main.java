package lesson_6;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Cat(200, 2.0);
        animals[1] = new Dog(400,10, 0.5);
        animals[2] = new Dog(600,7, 0.3);

        for (int i = 0; i < animals.length; i++) {
            System.out.println("lesson_6.Animal #" + (i + 1));
            animals[i].run(300);
            animals[i].swim(9);
            animals[i].jump(1.0);
        }
    }
}
