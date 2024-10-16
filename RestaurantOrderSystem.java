/*
James Arnold S. Nieves
October 5, 2024
Restaurant Order System
*/
import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuItem, quantity;
        double total = 0;

        // The menu
        System.out.println("----------------------");
        System.out.println("\t\tMENU");
        System.out.println("----------------------");
        System.out.println("1. Burger    - PHP 100");
        System.out.println("2. Fries     - PHP 50");
        System.out.println("3. Soda      - PHP 30");
        System.out.println("4. Ice Cream - PHP 45");
        System.out.println("5. Exit");
        System.out.print("\nPlease select an item by entering the corresponding number: ");

        // user put a order
        menuItem = scanner.nextInt();

        // exit condition
        if (menuItem == 5) {
            System.out.println("Thank you for visiting!");
        } else if (menuItem < 1 || menuItem > 5) {
            // validate menu selection
            System.out.println("Invalid selection. Please choose a valid menu item.");
        } else {
            // get user input for quantity
            System.out.print("\nEnter the quantity: ");
            quantity = scanner.nextInt();

            // validate quantity input
            if (quantity <= 0) {
                System.out.println("Invalid quantity. Please enter a positive integer.");
            } else {
                // Calculate the total amount with the quantify
                switch (menuItem) {
                    case 1:
                        total = 100 * quantity;
                        break;
                    case 2:
                        total = 50 * quantity;
                        break;
                    case 3:
                        total = 30 * quantity;
                        break;
                    case 4:
                        total = 45 + quantity;
                        break;
                }

                // Display the total bill
                System.out.printf("\nThe total bill for your order is: PHP %.2f%n", total);
            }
        }

        scanner.close();
    }
}
