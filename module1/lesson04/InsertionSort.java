package module1.lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements:");
        System.out.println();

        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();

        }

        System.out.println("Before sorting: " + Arrays.toString(arr));

        System.out.println("After sorting: " + Arrays.toString(insertionSort(arr)));

    }

    public static int[] insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;

            }

            arr[j + 1] = key;

        }

        return arr;

    }

}
