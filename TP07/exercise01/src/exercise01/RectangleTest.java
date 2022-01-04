package exercise01;

import java.util.Scanner;

public class RectangleTest {
	private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int height, width;
        System.out.print("Enter the height of rectangle: ");
        height = sc.nextInt();
        System.out.print("Enter the width of rectangle: ");
        width = sc.nextInt();
        Rectangle rec = new Rectangle(width, height);

        System.out.println("\nParameter: " + rec.calculatePerimeter());
        System.out.println("Surface: " + rec.calculateSurface());
    }
}
