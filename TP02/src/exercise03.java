import java.util.Scanner;

public class exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float y;
		float z;
		System.out.println("Program for calculating equation 1/x = 1/y + 1/z");
		System.out.println("Please input y: ");
		y = sc.nextFloat();
		System.out.println("Please input z: ");
		z = sc.nextFloat();
		
		float x  = (y*z)/(y+z);
		
		System.out.println("Result x = " + x);	
	}

}
