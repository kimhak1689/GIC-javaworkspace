import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int width;	
		int height;
		System.out.println("Please input width (in meter):");
		width = sc.nextInt();
		System.out.println("Please input height (in meter):");
		height = sc.nextInt();
		
		int perimeter = (width + height) * 2;
		int surface = width * height;
		
		System.out.println("Perimeter = ("+ width + " + " + height + ") x 2 = " + perimeter + " m");
		System.out.println("Surface = " + width + " x " + height + " = " + surface + " m^2");
	}

}
