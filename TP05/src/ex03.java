import java.util.Scanner;

public class ex03{
	
	public static void main(String[] args) {
        System.out.println("Input the number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        
        // even
        for(int i=num1; i <= 500; i++) {
        	OddEven odd = new OddEven(i);
        	if(odd.isEven()) {
        		System.out.print(i +" ");
        	}
        }
        sc.close();
    }
 
}
