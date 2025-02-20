package module1.lesson04;

import java.util.Scanner;

public class ArrayOperations {

    public  static int[] makingArray() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements:");
        System.out.println();

        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();
        }

        scanner.close() ;

        return arr;

    }

    public static String printArray(int[] arr) {

        StringBuilder result = new StringBuilder();

        for (int j : arr) {

            result.append(j).append(" ");
        }

        return "Sorted array: " + result;
    }

}
