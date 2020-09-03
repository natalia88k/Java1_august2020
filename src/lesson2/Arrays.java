package lesson2;

public class Arrays {
    public static void main(String[] args) {
        arrayFlip();
        arrayTripple();
        arrayTwice();
        fillDiagonal();
        findMaxMin();
        testEqualsSum();
    }

    public static void arrayFlip() {
        System.out.println("Task 1");
        int[] flip = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < flip.length; i++) {
            if (flip[i] == 0) {
                flip[i] = 1;
            } else {
                flip[i] = 0;
            }
            System.out.print(flip[i] + " ");
        }
    }

    public static void arrayTripple() {
        System.out.println("\nTask 2");
        int[] tripple = new int[8];
        for (int i = 0; i < tripple.length; i++) {
            tripple[i] = i * 3;
            System.out.print(tripple[i] + " ");
        }
    }

    public static void arrayTwice() {
        System.out.println("\nTask 3");
        int[] twice = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < twice.length; i++) {
            if (twice[i] < 6) {
                twice[i] *= 2;
            }
            System.out.print(twice[i] + " ");
        }
    }

    public static void fillDiagonal() {
        System.out.println("\nTask 4");
        int size = 5;
        int[][] diagonal = new int [size][size];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (i == j || (i + j) == size - 1) {
                    diagonal[i][j] = 1;
                }
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findMaxMin() {
        System.out.println("Task 5");
        int[] elements = {12, 5, 0, 3, -3, 1, 1234, 72, -100500};
        int maxElements = elements[0];
        int minElements = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > maxElements) {
                maxElements = elements[i];
            }
            if (elements[i] < minElements) {
                minElements = elements[i];
            }
            System.out.print(elements[i] + " ");
        }
        System.out.println("\nMax element = " + maxElements + "\n" + "Min element = " + minElements);
    }

    public static void testEqualsSum() {
        System.out.println("\nTask 6");
        int [] arr1 = {8, 2, 1, 0, 5, 1, 3};
        System.out.println(equalsSum(arr1));
        int [] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(equalsSum(arr2));
    }

    public static boolean equalsSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
            System.out.print(arr[i] + " ");
        }

        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            sum -= arr[i];
            if (currSum == sum) {
                return true;
            }
        }
        return false;
    }

}
