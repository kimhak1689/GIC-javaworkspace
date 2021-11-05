import java.util.Scanner;

public class exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Program for guessing your luckiness.");
		System.out.println("Please input a positive number: ");
		
		num = sc.nextInt();
		
		System.out.println("I got " + (num+1) + ". I am luckier.");
	}

}
