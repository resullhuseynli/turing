package module1.lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements:");
        System.out.println();

        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();

        }

        System.out.println("Before sorting: " + Arrays.toString(arr));

        System.out.println("After sorting: " + Arrays.toString(bubbleSort(arr)));

    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }

        return arr;

    }

}
