import java.util.Scanner;
public class Main {

    private static double balance = 1000;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("-----------------------------------");
        System.out.println("Welcome To The ATM Machine!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("-----------------------------------");

        boolean exit = false;

        while(!exit) {
            System.out.println("Enter A Selection: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank You For Using The ATM Machine!");
                default:
                    System.out.println("Invalid Input. Try Again!");
                    break;
            }
        }
        scanner.close();
    }

    private static void checkBalance() {
        System.out.println("Your Current Balance Is: $" + balance);
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Amount To Deposit: ");
        double amount = scanner.nextDouble();
        if(amount > 0 ) {
            balance += amount;
            System.out.println("Deposit Successful. Your New Balance Is: $" + balance);
        } else {
            System.out.println("Invalid Amount. Please Enter A Positive Value.");
        }
    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Amount To Withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal Successful. Your New Balance Is: $" + balance);
            } else {
                System.out.println("Insufficient Funds! Your Current Balance Is: $" + balance);
            }
        } else {
            System.out.println("Invalid Amount. Please Enter A Positive Value");
        }
    }
}