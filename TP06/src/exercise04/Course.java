package exercise04;

import java.util.*;

public class Course {
    private static Scanner sc;

    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        sc = new Scanner(System.in);
        // let's add 5 course as a base course.
        courses.add("Software Engineering");
        courses.add("Advanced Database");
        courses.add("Internet Programming");
        courses.add("Operating System");
        courses.add("Networking");
        while (true) {
            System.out.println();
            System.out.println("1. List all courses.");
            System.out.println("2. Find courses by name.");
            System.out.println("3. Add new course.");
            System.out.println("4. Quit");
            System.out.print("Enter your option: ");
            int key = sc.nextInt();
            switch (key) {
                case 1 -> {
                    for (String i : courses) {
                        System.out.println(i);
                    }
                }
                case 2 -> {
                    System.out.print("Enter the course's name: ");
                    String course = sc.next();
                    for (String i : courses) {
                        if (i.equals(course)) {
                            System.out.print(i);
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Enter the new course's name: ");
                    String newCourse = sc.next();
                    courses.add(newCourse);
                }
                case 4 -> System.exit(0);
                default -> System.err.println("Your input is incorrect !!!!!!");
            }
        }
    }
}
