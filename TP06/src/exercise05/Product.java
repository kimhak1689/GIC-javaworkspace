package exercise05;

import java.util.*;

public class Product {
    String name;
    int productNumber, amount;
    double price;
    ArrayList<Product> list = new ArrayList<>();

    public Product() {

    }

    public Product(String name, int productNumber, int amount, double price) {
        this.name = name;
        this.productNumber = productNumber;
        this.amount = amount;
        this.price = price;
    }

    public void addProduct(int index, String[] name, int[] number, double[] price, int[] amount) {
        for (int i = 0; i < index; i++) {
            list.add(i, new Product(name[i], number[i], amount[i], price[i]));
        }
    }

    public void removeIndex(int index) { list.removeIf(product -> product.productNumber == index); }

    public void updateProduct(int number) {
        int index = 0;
        Scanner sc = new Scanner(System.in);
        for (Product product : list) {
            if (product.productNumber == number) {
                System.out.print("Enter the new product's name: ");
                String name = sc.next();
                System.out.print("Enter the new product's number: ");
                int proNumber = sc.nextInt();
                System.out.print("Enter product's new amount: ");
                int newAmount = sc.nextInt();
                System.out.print("Enter product's new price: ");
                double newPrice = sc.nextDouble();
                list.set(index, new Product(name, proNumber, newAmount, newPrice));
            } else
                index++;
        }
        sc.close();
    }

    public void displayList() {
        System.out.println("Number\t\t\t\tName\t\t\t\tPrice\t\tAmount in stock");
        for (Product product : list) {
            System.out.printf("%d\t\t\t\t%s\t\t\t%.2f\t\t%d\n", product.productNumber, product.name, product.price, product.amount);
        }
    }
}