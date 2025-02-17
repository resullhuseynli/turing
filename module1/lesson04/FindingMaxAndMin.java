package module1.lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMaxAndMin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter The Number Of Arrays: ");
        int length = scanner.nextInt();
        System.out.println();

        System.out.print("Please Enter Length Of Arrays: ");
        int arrayLength = scanner.nextInt();
        System.out.println();

        int[][] arr = new int[length][arrayLength];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Please Enter The Elements Of Array " + (i + 1) + ":");

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = scanner.nextInt();

            }
        }

        System.out.println("Your Array Is: " + Arrays.deepToString(arr));

        System.out.println(findMaxAndMin(arr));

    }

    public static String findMaxAndMin(int[][] arr) {

        int max = arr[0][0];
        int min = arr[0][0];

        for (int[] subArr : arr) {

            for (int num : subArr) {

                max = Math.max(max, num);
                min = Math.min(min, num);

            }

        }

        return "Max: " + max + ",\nMin: " + min;

    }

}
