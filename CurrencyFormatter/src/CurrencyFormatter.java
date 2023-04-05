// Import required classes
import java.util.*;
import java.text.*;

// Define a public class named currencyFormatter
public class CurrencyFormatter {
    // Define a main method that takes in user input for a payment value and formats it in different currencies
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Read the payment value from the user and store it in a double variable
        double payment = scanner.nextDouble();

        // Close the scanner object
        scanner.close();

        // Create Locale objects for India and Turkey with their respective language and region codes
        Locale indiaLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        Locale turkiyeLocale = new Locale.Builder().setLanguage("tr").setRegion("TR").build();

        // Format the payment value in different currencies using NumberFormat class and the specified Locales
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String turkey = NumberFormat.getCurrencyInstance(turkiyeLocale).format(payment);

        // Print the formatted payment values for each currency
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        System.out.println("Turkiye: " + turkey);
    }
}