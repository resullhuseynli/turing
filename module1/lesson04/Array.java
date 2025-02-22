package module1.lesson04;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // Array declaration
        int[] numbers;

        // Array initialization
        numbers = new int[5];

        // Array declaration and initialization
        int[] numbers2 = new int[5];

        // Array initialization with values
        int[] numbers3 = {1, 2, 3, 4, 5};

        // Accessing array elements
        System.out.println(numbers3[0]); // 1
        System.out.println(numbers3[1]); // 2
        System.out.println(numbers3[2]); // 3
        System.out.println(numbers3[3]); // 4
        System.out.println(numbers3[4]); // 5

        // Array length
        System.out.println(numbers3.length); // 5

        // Iterating over an array
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }

        // Enhanced for loop
        for (int number : numbers3) {
            System.out.println(number);
        }

        // Array of strings
        String[] names = {"John", "Jane", "Joe"};

        // Iterating over an array of strings
        for (String name : names) {
            System.out.println(name);
        }

        // Array of doubles
        double[] prices = {1.99, 2.99, 3.99};

        // Iterating over an array of doubles
        for (double price : prices) {
            System.out.println(price);
        }

        // Array of booleans
        boolean[] flags = {true, false, true};

        // Iterating over an array of booleans
        for (boolean flag : flags) {
            System.out.println(flag);
        }

        // Array of chars
        char[] letters = {'a', 'b', 'c'};

        // Iterating over an array of chars
        for (char letter : letters) {
            System.out.println(letter);
        }

        // Array of arrays
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing elements of a 2D array
        System.out.println(matrix[0][0]); // 1
        System.out.println(matrix[0][1]); // 2
        System.out.println(matrix[0][2]); // 3
        System.out.println(matrix[1][0]); // 4
        System.out.println(matrix[1][1]); // 5
        System.out.println(matrix[1][2]); // 6
        System.out.println(matrix[2][0]); // 7
        System.out.println(matrix[2][1]); // 8
        System.out.println(matrix[2][2]); // 9

        System.out.println(Arrays.toString(flags));  //toString in Arrays utils

    }


}
