package exercise02;

import java.util.*;

public class Operator {
	
	public static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
        int num; // input the total student
        System.out.print("Input the total number of students: ");
        num = sc.nextInt();
        Student student = new Student();
        String[] name = new String[num];
        int[] id = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.printf("Enter the name for student%d: ",i);
            name[i] = sc.next();
            System.out.printf("Enter the id for student%d: ",i);
            id[i] = sc.nextInt();
        }
        student.addStudent(name, id, num);
        while (true) {
            System.out.println();
            System.out.println("1.Add more student.");
            System.out.println("2.Remove student.");
            System.out.println("3.Update student info.");
            System.out.println("4.Display list");
            System.out.println("5.Exit the program.");
            System.out.print("\nChoose your option: ");
            int key = sc.nextInt();
            switch (key) {
                case 1 -> {
                    System.out.print("Enter the total number of student that you want add more: ");
                    int index = sc.nextInt();
                    for (int i = 0; i < index; i++) {
                        System.out.printf("Enter the name for student%d: ", i);
                        name[i] = sc.next();
                        System.out.printf("Enter the id for student%d: ", i);
                        id[i] = sc.nextInt();
                    }
                    student.addStudent(name, id, index);
                }
                case 2 -> {
                    System.out.print("Enter the student's name that you want to remove: ");
                    String rmName = sc.next();
                    student.removeStudent(rmName);
                }
                case 3 -> {
                    System.out.print("Enter student's id that you want to update: ");
                    int oldId = sc.nextInt();
                    student.updateInfo(oldId);
                }
                case 4 -> student.printList();
                case 5 -> System.exit(0);
                default -> System.out.print("Please input a correct option !!!!!!");
            }
        }
    }
}