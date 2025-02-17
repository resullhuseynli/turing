package module1.lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements:");
        System.out.println();

        int[] arr = new int[scanner.nextInt()];

        for (
                int i = 0;
                i < arr.length; i++) {

            arr[i] = scanner.nextInt();

        }

        System.out.println("Before sorting: " + Arrays.toString(arr));

        System.out.println("After sorting: " + Arrays.toString(selectionSort(arr)));

    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {

                    minIndex = j;

                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

        return arr;

    }

}
