package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '.';
    public static final char DOT_HUMAN = 'X';
    public static final char DOT_AI = 'O';

    public static final String EMPTY = " ";
    public static final String FIRST_EMPTY_CHAR = "  ";

    public static final char[][] map = new char[SIZE][SIZE];
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) {

        turnGame();

    }

    public static void turnGame() {
        initMap();

        printMap();

        playGame();
    }


    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();

        printMapRows();
    }

    private static void printMapHeader() {
        System.out.print(FIRST_EMPTY_CHAR);
        for (int i = 0; i < SIZE; i++) {
            printNumber(i);
        }
        System.out.println();
    }

    private static void printNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printMapRows() {
        for (int i = 0; i < SIZE; i++) {
            printNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void playGame() {

        while (true) {

            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN, "Ура! Вы выиграли!")) {
                System.exit(0);
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI, "Победил компьютер!")) {
                System.exit(0);
            }

        }
    }


    private static void humanTurn() {

        int rowNumber, columnNumber;

        do {
            System.out.println("Ход человека! Ввведите номер строки и столбца");
            scanner.reset();
            System.out.print("Строка = ");
            rowNumber = scanner.nextInt();
            System.out.print("Столбец = ");
            columnNumber = scanner.nextInt();

        } while (!isCellValid(rowNumber, columnNumber, DOT_HUMAN));

        map[rowNumber - 1][columnNumber - 1] = DOT_HUMAN;

    }

    private static boolean isCellValid(int rowNumber, int columnNumber, char symbol) {
        boolean isHuman = symbol == DOT_HUMAN;

        if (isHuman && ((rowNumber < 1) || (rowNumber > SIZE) || (columnNumber < 1) || (columnNumber > SIZE))) {
            System.out.println("\nПроверьте значение строки и столбца!");
            return false;
        }

        if (map[rowNumber - 1][columnNumber - 1] != DOT_EMPTY) {
            if (isHuman) {
                System.out.println("\nВы выбрали занятую ячейку!");
            }
            return false;
        }

        return true;
    }

    private static boolean checkEnd(char symbol, String winMessage) {

        if (checkWin(symbol))
        {
            System.out.println(winMessage);
            return true;
        }

        if (isMapFull()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean checkWin(char symbol) {
        return checkMainDiagonal(symbol) || checkAdditionalDiagonal(symbol) || checkHorizontal(symbol) || checkVertical(symbol);
    }

    private static boolean checkMainDiagonal(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] != symbol) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkAdditionalDiagonal(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE - 1 - i] != symbol) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkHorizontal(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            boolean isWin = true;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] != symbol) {
                    isWin = false;
                }
            }
            if (isWin) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkVertical(char symbol) {
        for (int j = 0; j < SIZE; j++) {
            boolean isWin = true;
            for (int i = 0; i < SIZE; i++) {
                if (map[i][j] != symbol) {
                    isWin = false;
                }
            }
            if (isWin) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char ch : chars) {
                if (ch == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void aiTurn() {

        int rowNumber, columnNumber;

        do {
            rowNumber = random.nextInt(SIZE) + 1;
            columnNumber = random.nextInt(SIZE) + 1;

        } while (!isCellValid(rowNumber, columnNumber, DOT_AI));

        map[rowNumber - 1][columnNumber - 1] = DOT_AI;
    }






}
