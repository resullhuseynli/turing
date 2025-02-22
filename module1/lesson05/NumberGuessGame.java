package module1.lesson05;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }


    private static void start() {

        System.out.println("Let the game begin!");

        String name = getName();
        int randomNumber = generateRandomNumber();

        int[] numbers = new int[100];
        int index = 0;

        boolean isGuessed = false;
        int number;

        while (!isGuessed) {
            number = isNumber();
            isGuessed = checkNumber(number, randomNumber, name);
            numbers[index] = number;
            index++;
        }

        decreaseTheArray(numbers, index);

        showTheResult(numbers, index);

    }

    private static void showTheResult(int[] numbers, int index) {
        System.out.print("Your Numbers: ");

        for (int j = 0; j < index; j++) {
            System.out.print(numbers[j] + " ");
        }
    }


    private static void decreaseTheArray(int[] numbers, int index) {

        for (int i = 1; i < index + 1; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] < key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }

    }


    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }


    private static int isNumber() {

        int number = 0;
        boolean isNumber = false;

        while (!isNumber) {
            System.out.println("Enter your number: ");

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine();
                if (number > 100 || number < 0) {
                    System.out.println(
                            "You entered a number that is not in the range from 0 to 100. Try again.");
                    continue;
                }
                isNumber = true;

            } else {
                System.out.println("You entered not a number. Try again.");
                scanner.nextLine();
            }
        }
        return number;
    }


    private static boolean checkNumber(int number, int randomNumber, String name) {

        if (number == randomNumber) {
            System.out.println("Congratulations, " + name + "!");
            return true;

        } else if (number > randomNumber) {
            System.out.println("Your number is too big. Please, try again.");

        } else {
            System.out.println("Your number is too small. Please, try again.");
        }
        return false;
    }


    private static String getName() {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }


}
