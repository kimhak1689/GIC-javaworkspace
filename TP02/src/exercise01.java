import java.util.Scanner;

public class exercise01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String name;
      System.out.print("Input your name: ");
      
      name = sc.nextLine();
      
      System.out.println("Hello "+name+"!");
  }

}