import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Input number of seconds: ");
		int seconds = sc.nextInt();
		int hour = seconds / 3600;
		int min  = (seconds % 3660) / 60;
		int sec  = (seconds % 60) % 60;
		System.out.printf("Time corresponding to %dseconds is %02d:%02d:%02d.", seconds, hour, min ,sec);
	}
}
