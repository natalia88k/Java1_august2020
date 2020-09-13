package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        while (true) {
            int secretNumber = random.nextInt(10);
            System.out.println("Загадано число от 0 до 9. Угадай число!");
            int count = 0;

            while (count < 3) {
                int userNumber = input.nextInt();
                if (userNumber == secretNumber) {
                    System.out.println("Ты угадал! Молодец :)");
                    break;
                } else if (userNumber > secretNumber) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
                count++;
            }

            if (count == 3) {
                System.out.println();
                System.out.println("Ты проиграл :(");
                System.out.println("Загаданное число было " + secretNumber);
                System.out.println("У тебя обязательно получится в следующий раз!");
            }

            System.out.println();
            System.out.println("Повторим еще раз? 1 - да / 0 - нет");
            int answer = input.nextInt();
            if (answer == 0) {
                break;
            }



        }
    }
}
