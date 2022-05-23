package Interfaces.OnlineShop;

import java.util.Scanner;

public class Store {

    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }
    
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }
            if (warehouse.stock(product) > 0) {
                warehouse.take(product);
                cart.add(product, warehouse.price(product));
            } else {
                System.out.println("Sorry we have ran out of stock for that item.");
            }
        }

        System.out.println("Your shopping cart contents:");
        cart.print();
        System.out.println("Total: " + cart.price());
    }
}
