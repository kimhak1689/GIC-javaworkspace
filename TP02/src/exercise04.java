import java.util.Scanner;

public class exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Program for counting the number of hundreds.");
		System.out.println("Please input a positive number: ");
		a = sc.nextInt();
		System.out.println("There are " + (a/100) + " hundreds in number " + a + ".");
	}
}
