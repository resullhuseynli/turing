package secondLesson;

import java.util.Scanner;

public class SeasonChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month number: ");
        int month = scanner.nextInt();

        if (month == 12 || month == 1 || month == 2) {

            System.out.println("It Is Winter!");

        } else if (month >= 3 && month <= 5) {

            System.out.println("It Is Spring!");

        } else if (month >= 6 && month <= 8) {

            System.out.println("It Is Summer!");

        } else if (month >= 9 && month <= 11) {

            System.out.println("It Is Autumn!");

        } else {

            System.out.println("Wrong month number");

        }


    }

}
