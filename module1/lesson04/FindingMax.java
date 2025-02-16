package module1.lesson04;

import java.util.Scanner;

public class FindingMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements:");
        System.out.println();

        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();

        }

        int result = arr[0];

        for (int num : arr) {

            result = Math.max(result, num);

        }

        System.out.println(result);

    }

}
