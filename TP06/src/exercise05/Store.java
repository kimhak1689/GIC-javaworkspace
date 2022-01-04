package exercise05;

import java.util.*;

public class Store {
	
	public static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
        int[] amount = {10,15,20};
        String[] name = {"Toy Cars","Alarm Clock","Handbags"};
        int[] number = {11,22,33};
        double[] price = { 5.50, 1.25, 7.75 };
        int index;
        Product products = new Product();
        products.addProduct(3,name, number, price, amount);
        while (true) {
            System.out.println();
            System.out.println("1.List all products in shop.");
            System.out.println("2.Add new product to the list.");
            System.out.println("3.Remove from list by index.");
            System.out.println("4.Update product in list.");
            System.out.println("5.Exit from program.");
            System.out.print("Input your option: ");
            int key = sc.nextInt();
            switch (key) {
                case 1 -> products.displayList();
                case 2 -> {
                    System.err.print("Enter the total number of product that you will add: ");
                    index = sc.nextInt();
                    for (int i = 0; i < index; i++) {
                        System.out.print("Enter the name of product: ");
                        name[i] = sc.next();
                        System.out.print("Enter the product number: ");
                        number[i] = sc.nextInt();
                        System.out.print("Enter the price: ");
                        price[i] = sc.nextDouble();
                        System.out.print("Enter the amount of product: ");
                        amount[i] = sc.nextInt();
                    }
                    products.addProduct(index, name, number, price, amount);
                }
                case 3 -> {
                    System.out.print("Enter the index(product's number) that you want to remove: ");
                    index = sc.nextInt();
                    products.removeIndex(index);
                }
                case 4 -> {
                    System.out.print("Enter product's number that you want to update: ");
                    int num = sc.nextInt();
                    products.updateProduct(num);
                }
                case 5 -> System.exit(0);
                default -> System.err.println("Your input is incorrect !!!!!!!");
            }
        }
    }
}  