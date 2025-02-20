package module1.lesson04;

import java.util.Scanner;

public class FindingMax extends ArrayOperations {

    public static void main(String[] args) {

        int[] arr = makingArray();

        int result = arr[0];

        for (int num : arr) {

            result = Math.max(result, num);

        }

        System.out.println(printArray(arr));

    }

}
