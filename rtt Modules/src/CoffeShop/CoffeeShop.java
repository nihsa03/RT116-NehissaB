package CoffeShop;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {

    private Scanner scanner= new Scanner(System.in);

    // this is a class level variable that will contain our list of products for sale
    // best practice is to define these at the top of the class
    private List<Product> products = new ArrayList<>();
    private List<Product> cart= new ArrayList<>();

    private void initProducts() {
        Product p1 = new Product("Small Coffee", 4.57, 0);
        products.add(p1);

        Product p2 = new Product("Large Coffee", 7.99, 0);
        products.add(p2);

        Product p3 = new Product("Sugar Cookie", 5.89, 0);
        products.add(p3);

        Product p4 = new Product("Egg Sandwich", 6.49, 0);
        products.add(p4);
    }

    private void printProductMenu() {
        for ( int count = 0 ; count < products.size() ; count++ ) {
            Product p = products.get(count);
            // count + 1 the complier will recognize the math and increment the value of count
            // before using it to create the string that is printed
            System.out.println((count+1) + ") " + p.getName() + " \t " + p.getPrice());
        }
        System.out.println();
    }

    private int printMainMenu() {
        System.out.println();
        System.out.println("1) See Menu");
        System.out.println("2) Purchase Products");
        System.out.println("3) Checkout Products");
        System.out.println("4) Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
        System.out.println();
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public void addProductToCart(){
        printProductMenu();
        System.out.println();
        System.out.print("Enter product number: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if((choice >= 1)&&(choice <= products.size())){

            Product p = products.get(choice-1);
            cart.add(p);
            System.out.println("Added product to the cart: "+ p.getName());
        }else{
            System.out.println("Invalid choice");

        }

    }

    public void checkout(){
        System.out.println();
        System.out.println("======Items in cart==== ");
        double subtotal = 0;
        for (Product p : cart) {
            System.out.println(p.getName()+ "\t" + p.getPrice());
            subtotal += p.getPrice();
        }
        System.out.println();
        System.out.println("Subtotal:\t\t$" + subtotal);

        double tax=subtotal*0.89;
        System.out.println("Tax:\t\t\t$"+tax);

        double Total=subtotal+tax;
        System.out.println("Total:\t\t\t2$"+Total);

        System.out.println();
    }



    public void start() {
        // this becomes similar to the main method in that it will be where our project starts and runs
        // 1) initialize the products for sale
        initProducts();

        // 2) print the list of products for sale

       while ( true ) {
           int choice = printMainMenu();

           if (choice == 1) {
               System.out.println("\nWelcome to Coffee Shop!\n");
               printProductMenu();

           } else if (choice == 2) {
               addProductToCart();
           } else if (choice == 3) {
               checkout();
           } else if (choice == 4) {
               System.out.println("\nGoodbye! Can't wait to see you again.\n");
               System.exit(0);
           }else{
               System.out.println("Invalid choice"+ choice+"\n");
           }
       }
    }

    public static void main(String[] args) {
        CoffeeShop cs = new CoffeeShop();
        cs.start();
    }
}