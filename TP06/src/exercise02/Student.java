package exercise02;

import java.util.ArrayList;
import java.util.Scanner;

public  class Student {
    String name;
    int id;
    public Student() {
    }
    ArrayList<Student> list = new ArrayList<>();
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void addStudent(String[] name, int[] id, int index){

        for (int i = 0; i < index; i++) {
            list.add(i, new Student(name[i], id[i]));
        }
    }
    public void removeStudent(String name){ list.removeIf(student -> student.name.equals(name)); }
    // for(student student: list { if (student.name == name){list.remove();}}
    public void updateInfo(int id){
        Scanner sc = new Scanner(System.in);
        int index = 0;
        for (Student student:list) {
            if (student.id == id){
                System.out.println("Enter a updated info: ");
                System.out.print("Enter a new ID: ");
                int newId = sc.nextInt();
                System.out.print("Enter a new name: ");
                String newName = sc.next();

                list.set(index,new Student(newName, newId));
            } else index++;
        }
        sc.close();
    }
    public void printList(){
        for (Student student: list) {
            System.out.printf("%d \t %s \n", student.id, student.name);
        }
    }
}
