import java.util.Scanner;
// ex01. Prime Number
public class ex01 {
 
    public static void main(String[] args) {
    	
        System.out.println("Input number to list prime numbers from 2 to it: ");
        Scanner sc = new Scanner(System.in);
        int n1 = 2;
        int n2 = sc.nextInt();
 
        if (n1 >= n2) {
            System.out.println("Number must be greater than 2.");
            System.exit(0);
        }
        while (n1 <= n2) {
            int i = 2, count = 0;
            while (i <= n1 / 2) {
                if (n1 % i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0) {
                System.out.print(n1 + " ");
            }
            n1++;
        }
        System.out.print("is prime number.");
    }
    
}