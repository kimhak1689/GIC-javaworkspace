// ex01. Check the input number whether it is prime number or not
import java.util.Scanner;

public class PrimeNumber {
	
	private int num;
    private String reason = "";
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number to check whether it is prime number: ");
        PrimeNumber check = new PrimeNumber(Integer.parseInt(sc.nextLine()));

        System.out.println(check.getReason());
    }
    
    public PrimeNumber(int n) {
        num = n;
        isPrime();
    }

    public boolean isPrime() {
        boolean prime = true;
        if (num > 2) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    reason += " " + i;
                }
            }
            if (prime) {
                reason = num + " is a prime number";
                return true;
            } else {
                reason = num + " is not prime, because it is divisible by " + reason + ".";
            }
        } else 
            reason = num + " is not a prime number, because it is smaller or equal to 2";
        return false;
    }
    
    public String getReason() {
    	return reason;
    }
}

