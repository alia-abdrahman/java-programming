package exercises.chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        // Get the season
        System.out.println("Enter a season: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // Get the whole number
        System.out.println("Enter a whole number: ");
        int wholeNumber = scanner.nextInt();

        // Get the adjective
        System.out.println("Enter an adjective: ");
        String adjective = scanner.next();

        scanner.close();


        // Display result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}
