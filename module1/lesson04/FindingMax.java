package module1.lesson04;

import java.util.Scanner;

public class FindingMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];

        int result = 0;

        for (int i=0 ; i<arr.length ; i++) {

            arr[i] = scanner.nextInt();

            result = Math.max(result, arr[i]);

        }

        System.out.println(result);

    }

}
