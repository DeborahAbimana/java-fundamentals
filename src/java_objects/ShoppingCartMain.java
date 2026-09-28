package java_objects;

import java.util.Scanner;

public class ShoppingCartMain {




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        System.out.println("===== SHOPPING CART =====");

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter price per item: ");
        double price = input.nextDouble();

        // Add each item according to quantity
        for (int i = 0; i < quantity; i++) {
            cart.addItem(price);
        }

        System.out.println("\nProduct added: " + itemName);
        System.out.println("Total products: " + cart.getTotalItems());
        System.out.printf("Total price: $%.2f%n", cart.getTotalPrice());

        
        System.out.print("\nDo you want to remove an item? (yes/no): ");
        String answer = input.next();

        if (answer.equalsIgnoreCase("yes")) {

            cart.removeItem(price);

            System.out.println("Total products: "
                    + cart.getTotalItems());

            System.out.printf("Total price: $%.2f%n",
                    cart.getTotalPrice());
        }

        input.close();
    }
}

