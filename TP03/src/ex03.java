import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for calculating cost of a call.");
		System.out.println("Please input start hours: ");
		int hi = sc.nextInt();
		System.out.println("Please input start minutes: ");
		int mi = sc.nextInt();
		System.out.println("Please input start seconds: ");
		int si = sc.nextInt();
		
		System.out.println("Please input end hours: ");
		int hf = sc.nextInt();
		System.out.println("Please input end minutes: ");
		int mf = sc.nextInt();
		System.out.println("Please input end seconds: ");
		int sf = sc.nextInt();
		
		int h = hf - hi;
		int m = mf - mi;
		int s = sf - si;
		
		int seconds = (h*3600) + (m*60) + s;
		
		int hours = seconds / 3600;
		int minutes  = (seconds % 3600) / 60;
		int sec  = (seconds % 60) % 60;
		
		float cost = (float) (seconds*(0.05/60));
		
		System.out.println("Total call duration: " + hours + "h " + minutes + "mn " + sec + "s");
		System.out.printf("Total cost of this call: %.4f$", cost);
	}
}
