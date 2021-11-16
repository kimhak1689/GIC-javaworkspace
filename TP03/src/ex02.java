import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for converting time to seconds.");
		
		int h;
		int min;
		int sec;
		
		System.out.println("Please input hours: ");
		h = sc.nextInt();
		System.out.println("Please input minutes: ");
		min = sc.nextInt();
		System.out.println("Please input seconds: ");
		sec = sc.nextInt();
		
		int result = h*(3600) + min*(60) + sec;
		
		System.out.println("Number of seconds= " + h + "x3600 + " + min + "x60  + " + sec + " = " + result);
	}

}
