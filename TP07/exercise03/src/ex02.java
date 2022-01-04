

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex02 {
	public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        Encryption enc = new Encryption();
        SMS messages = new SMS();
        int key, index = 0;
        String fromNumber;
        String receiveNumber;
        String subject;
        String type;
        String content;
        while (true) {
            System.out.println("""
                    1. Send new SMS with Encrypted content using password method
                    2. View SMS detail
                    3. List SMSes
                    4. Remove SMSes by index
                    5. Quit """);
            System.out.print("Enter your option: ");
            key = Integer.parseInt(sc.nextLine());
            switch (key) {
                case 1:
                    System.out.print("Enter the type of message (text or MMS): ");
                    type = sc.nextLine();
                    System.out.print("Enter phone number that will send message: ");
                    fromNumber = sc.nextLine();
                    System.out.print("Enter the receive number: ");
                    receiveNumber = sc.nextLine();
                    System.out.print("Enter the subject: ");
                    subject = sc.nextLine();
                    subject = subject + ".txt";
                    File file = new File(subject);
                    if (file.createNewFile()) {
                        System.out.println("File is created.");
                        System.out.print("Enter your password: ");
                        String password = sc.nextLine();
                        System.out.print("Enter the your message: ");
                        content = sc.nextLine();
                        try (FileWriter outfile = new FileWriter(subject);
                                BufferedWriter bwrite = new BufferedWriter(outfile)) {
                            bwrite.write(content);
                            enc.encrypt(subject, password);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        messages.sendMessage(index, fromNumber, receiveNumber, subject, type);
                        index++;
                    } else {
                        System.out.print("This message already existed");
                    }
                    break;
                case 2:
                    System.out.print("Enter the phone number that you have sent: ");
                    receiveNumber = sc.nextLine();
                    messages.viewDetail(receiveNumber);
                    break;
                case 3:
                    messages.listDetail();
                    break;
                case 4:
                    System.out.print("Enter the receive number that you want to remove: ");
                    receiveNumber = sc.nextLine();
                    messages.listRemoved(receiveNumber);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your input is incorrect !!!!!");
                    break;
            }
        }
    }
}
