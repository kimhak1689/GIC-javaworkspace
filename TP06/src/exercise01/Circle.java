package exercise01;

import java.util.Scanner;

public class Circle {
	
    private Point center, p;
    private static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Point center = new Point();
        Point p = new Point();
        Circle cir = new Circle(center, p);
        System.out.println("Enter the coordinate of the first point: ");
        System.out.print("x1: ");
        center.x = sc.nextInt();
        System.out.print("y1: ");
        center.y = sc.nextInt();

        System.out.println("\nEnter the coordinate of the second point: ");
        System.out.print("x2: ");
        p.x = sc.nextInt();
        System.out.print("y2: ");
        p.y = sc.nextInt();

        double radius = cir.radius();
        double length = cir.length();
        double area = cir.area();

        System.out.printf("\nThe circle have: \nRadius: %.2f\nlength: %.2f\nArea: %.2f", radius, length, area);
    }

    public Circle(Point center, Point p) {
        this.center = center;
        this.p = p;
    }

    
    public double radius() {
        return center.distance(p);
    }

    public double length() {
        return 2 * Math.PI * radius();
    }

    public double area() {
        return Math.PI * (Math.pow(radius(), 2));
    }
}

