import java.util.HashMap;
import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        HashMap<String, BankingOperations> hm = new HashMap<>();

        System.out.println("Welcome to SBI Bank");
        Scanner acc = new Scanner(System.in);
        boolean val = true;

        while (val) {
            System.out.println("1. Create a new account");
            System.out.println("2. Banking operations");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            int option = acc.nextInt();
            acc.nextLine();

            if (option == 1) {
                System.out.println("Enter your Name:");
                String name = acc.nextLine();
                System.out.println("Enter your Mobile number:");
                String mnum = acc.nextLine();

                BankingOperations obj = new BankingOperations(mnum, name);
                hm.put(mnum, obj);
                System.out.println("Account created successfully");
            } else if (option == 3) {
                val = false;
                System.out.println("Exiting...");
            } else if (option == 2) {
                System.out.println("Enter your account number:");
                String mnum = acc.nextLine();

                if (!hm.containsKey(mnum)) {
                    System.out.println("Account not found");
                    continue;
                }

                BankingOperations bs = hm.get(mnum);

                System.out.println("1. Balance check");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("Enter your choice:");
                int oper = acc.nextInt();

                if (oper == 1) {
                    System.out.println("Your Account Balance is: " + bs.getBalance());
                } else if (oper == 2) {
                    System.out.println("Enter amount to withdraw:");
                    double amount = acc.nextDouble();
                    bs.withdraw(amount);
                    System.out.println("Amount withdrawn successfully. Now balance is: " + bs.getBalance());
                } else if (oper == 3) {
                    System.out.println("Enter amount to deposit:");
                    double amount = acc.nextDouble();
                    bs.deposit(amount);
                    System.out.println("Amount deposited successfully. Now balance is: " + bs.getBalance());
                }
            }
        }

        CardDetails cs = new CardDetails();

        System.out.println("Enter your card type:");
        System.out.println("1. Debit Card");
        System.out.println("2. Credit Card");
        System.out.println("3. Prepaid Card");
        System.out.println("4. ATM Card");
        System.out.println("5. End process");

        int car = acc.nextInt();

        switch (car) {
            case 1:
                System.out.println("Welcome to debit card section");
                System.out.println("Card Number: " + cs.getCardNumber());
                System.out.println("Expiry Year: " + cs.getExpYear());
                System.out.println("PIN: " + cs.getPin());
                System.out.println("Thank you to select a Debit card.Now card is added your account ✨"); 
                
                break;
            case 2:
                System.out.println("Welcome to credit card section");
                System.out.println("Card Number: " + cs.getCardNumber());
                System.out.println("Expiry Year: " + cs.getExpYear());
                System.out.println("PIN: " + cs.getPin());
                System.out.println("Thank you to select a Credit card.Now card is added your account ✨"); 
                break;
            case 3:
                System.out.println("Welcome to prepaid card section");
                System.out.println("Card Number: " + cs.getCardNumber());
                System.out.println("Expiry Year: " + cs.getExpYear());
                System.out.println("PIN: " + cs.getPin());
                System.out.println("Thank you to select a Prepaid card.Now card is added your account ✨"); 
                break;
            case 4:
                System.out.println("Welcome to ATM card section");
                System.out.println("Card Number: " + cs.getCardNumber());
                System.out.println("Expiry Year: " + cs.getExpYear());
                System.out.println("PIN: " + cs.getPin());
                System.out.println("Thank you to select a ATM card.Now card is added your account ✨"); 
                break;
            case 5:
                System.out.println("Ending process...");
                break;
            default:
                System.out.println("Invalid option 😥");
                break;
        }

        acc.close();
    }
}
