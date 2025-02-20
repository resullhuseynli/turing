package module1.lesson05;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        int[] arr = makingArray();
        printArrayAndIndex(arr);

    }

    public static void printArrayAndIndex(int[] arr) {

        for (int i = 0 ; i < arr.length; i++) {
            System.out.println("Index: " + i + " Value: " + arr[i]);
        }

    }

    public  static int[] makingArray() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements:");
        System.out.println();

        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();
        }

        scanner.close();

        return arr;

    }

}
