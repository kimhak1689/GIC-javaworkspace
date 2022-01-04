// ex02. Check the 6 digits number and tell if it is a lucky number or not
import java.util.*;

public class LuckyNumber {
    int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        LuckyNumber t = new LuckyNumber(sc.nextInt());
        t.countDigit();
    }

    public LuckyNumber(int n) {
        num = n;
        if (countDigit() == 6) {
            checkLucky(num);
        } else {
            System.out.println("Please enter the 6 digits numbers.");
        }
    }

    int countDigit() {
        int number = num;
        int count = 0;
        while (number > 0) {
            number /= 10;
            ++count;
        }
        return count;
    }
    
    public void checkLucky(int number) {
        int sum1 = 0, sum2 = 0;
        int digit = 0;
        while (number > 0) {
            if (digit <= 2) {
                digit++;
                sum1 = sum1 + number % 10;
                number /= 10;
            } else {
                sum2 = sum2 + number % 10;
                number /= 10;
            }
        }
        System.out.println(sum1);
        if (sum1 == sum2) {
            System.out.println("This is a lucky number.");
        } else {
            System.out.println("This is not a lucky number.");
        }
    }
}
