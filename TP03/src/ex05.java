import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for calculating duration of travel from ITC to Airport.");
		System.out.println("Please input traffic jam factor (in percentage [0-100]): ");
		double fac = sc.nextDouble();
		
		double time =(7*3600)/((30*fac)/100);
		double h = time/3600;
		double m = (time%3600)/60;
		double s = (time%3600)%60;
		
		System.out.printf("Traveling Duration = %02.0f:%02.0f:%02.0f", h, m, s);
	}

}
