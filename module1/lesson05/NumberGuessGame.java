package module1.lesson05;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {

        int number = getNumberFromUser();
        int randomNumber = getRandomNumber();
        checkNumber(number, randomNumber);

    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number between 1-10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        return scanner.nextInt();
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public static void checkNumber(int number, int randomNumber) {
        if (number == randomNumber) {
            System.out.println("Congratulations! You guessed the number.");
        } else {
            System.out.println("Sorry! The number was " + randomNumber);
        }
    }

}
