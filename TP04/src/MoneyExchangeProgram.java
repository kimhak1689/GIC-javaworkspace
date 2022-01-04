// ex04
import java.util.*;

public class MoneyExchangeProgram {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        moneyExchange me= new moneyExchange();
        int option;
        System.out.println("1. Riel to dollar.");
        System.out.println("2. Riel to baht.");
        System.out.println("3. Dollar to riel.");
        System.out.println("4. Dollar to baht.");
        System.out.println("5. Baht to dollar.");
        System.out.println("6. Baht to riel.");
        System.out.print("Please choose your option: ");
        option = sc.nextInt();
        if (option == 1 || option == 2) {
            System.out.print("Enter the amount in khmer riel: ");
            int riel = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("%d Riel = %.2f Dollar.",riel,me.rielToDollar(riel));
                    break;
                case 2:
                    System.out.printf("%d Riel = %.2f Baht", riel, me.rielToBaht(riel));
                    break;
                default:
                    break;
            }
        }else if (option == 3 || option == 4) {
            System.out.print("Enter the amount in US dollarl: ");
            int dollar = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("%d Dollar = %.2f Riel.", dollar, me.dollarToRiel(dollar));
                    break;
                case 2:
                    System.out.printf("%d Dollar = %.2f Baht", dollar, me.dollarToBaht(dollar));
                    break;
                default:
                    break;
            }
        } else if (option == 5 || option == 6) {
            System.out.print("Enter the amount in thai baht: ");
            int baht = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("%d Baht = %.2f Riel.", baht, me.bahtToRile(baht));
                    break;
                case 2:
                    System.out.printf("%d Baht = %.2f Dollar", baht, me.bahtToDollar(baht));
                    break;
                default:
                    break;
            }
        } else {
            System.out.print("Please enter the correct option.");
        }
    }
}

class moneyExchange {
    double rielToDollar(int riel) {
        double dollar = (float) (riel / 4000.000);
        return dollar;
    }

    double rielToBaht(int riel) {
        double baht = (float) (riel / 130.000);// 10 thai baht = 13000 khmer riel
        return baht;
    }
    
    int dollarToRiel(int dollar) {
        int riel = (int) (dollar * 4000.000);
        return riel;
    }

    double dollarToBaht(int dollar) {
        int baht = dollar * 30;
        return baht;
    }
    
    double bahtToDollar(int baht) {
        double dollar = (float) (baht / 30.000);
        return dollar;
    }

    double bahtToRile(int baht) {
        double riel = (float) (baht * 130.000);// 10 thai baht = 1300 khmer riel
        return riel;
    }
}