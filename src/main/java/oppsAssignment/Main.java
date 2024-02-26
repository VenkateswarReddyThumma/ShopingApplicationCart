package oppsAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Purchasable> cart = new ArrayList<>();
        Electronics electronics = new Electronics("Laptop", "CH001", 500, 11, "Electronics");
        System.out.println(electronics);
        electronics.addToCart();

        Clothing clothing = new Clothing("Shirt", "G210", 0, "large", "T shirts", 2);
        System.out.println(clothing);
        clothing.addToCart();

        Cosmetics cosmetics = new Cosmetics("LipStick", "SH22", 0, "Red", 2);
        System.out.println(cosmetics);
        cosmetics.addToCart();

        Food food = new Food("Burger", "FD200", 0, "chicken", 2);
        System.out.println(food);
        food.addToCart();

        FootWear footWear = new FootWear("Shoes", "SH300", 0, "10", 2);
        System.out.println(footWear);
        footWear.addToCart();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product Info ");

        int productInfo = scanner.nextInt();
        System.out.println("Enter the product Name ");

        String productName = scanner.next();
        System.out.println("Enter the product Id ");

        String productId = scanner.next();
        System.out.println("Enter the price ");

        double price = scanner.nextDouble();
        System.out.println("Enter the quantity ");
        int quantity = scanner.nextInt();

        double totalForProduct ;
        if (productInfo == 1) {
            System.out.println("enter the type");
            String type = scanner.next();
            electronics.addToCart();
            cart.add(electronics);
            Electronics electronics1 = new Electronics(productName,productId,price,quantity,type);
            totalForProduct=electronics1.calculateTotalPrice();
            System.out.println("Total for the Electronics " + totalForProduct);
        }
        else if (productInfo == 2) {
            System.out.println("enter the type");
            String size = scanner.next();
            cart.add(clothing);
            System.out.println("enter the size");
            String type = scanner.next();
            Clothing clothing1 = new Clothing(productName,productId,price,size,type,quantity);
            totalForProduct= clothing1.calculateTotalPrice();
            System.out.println("Total for the Clothing " + totalForProduct);
        }
        else if (productInfo == 3) {
            System.out.println("enter the color");
            String color = scanner.next();
            cart.add(cosmetics);
            Cosmetics cosmetics1 = new Cosmetics(productName,productId,price,color,quantity);
            totalForProduct = cosmetics1.calculateTotalPrice();
            System.out.println("Total for the Cosmetics " + totalForProduct);

        } else if (productInfo == 4) {

            System.out.println("enter the Ingredients");
            String ingredients = scanner.next();
            cart.add(food);
            Food food1 = new Food(productName,productId,price,ingredients,quantity);
            totalForProduct = food1.calculateTotalPrice();
            System.out.println("Total for the Food " + totalForProduct);


        } else if (productInfo == 5) {

            System.out.println("enter the size");
            String size = scanner.next();
            cart.add(footWear);
            FootWear footWear1 = new FootWear(productName,productId,price,size,quantity);
            totalForProduct = footWear1.calculateTotalPrice();
            System.out.println("Total for the FootWear " + totalForProduct);

        }
        else {
            System.out.println("Invalid type");
        }

        double Total = calculateTotalPrice(cart);
        System.out.println("Total price of products in the cart " + Total);
    }

    private static double calculateTotalPrice(List<Purchasable> cart) {

        double Total = 0;
        for (Purchasable item : cart) {
            Total += item.calculateTotalPrice();
        }
        return Total;
    }
}