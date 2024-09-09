import java.util.Scanner;

public class ATM {

     
    private static final int pinNo = 8520; 
    private static double balance = 0.0;
    
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("welocome to  the atm dear customer ");
        
        System.out.print("please enter your PIN: ");
        
        int pinEntered = scanner.nextInt();

        if (pinEntered != pinNo) {
            System.out.println("WRONG PIN,PLEASE ENTER A VALID PIN:");
            return;
        }

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1.Withdraw Money");
            System.out.println("2.add Money");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Select an a action ");
            
            
            int option = scanner.nextInt();
            
            switch (option) {
                case 1:
                	withdrawMoney(scanner);
                    break;
                case 2:
                    addMoney(scanner);
                    break;
                case 3:
                	checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for visiting the ATM. have a good day.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid action. Please select an action from 1 to 4.");
            }
        }
    }
    
    private static void withdrawMoney(Scanner scanner) {
    	
        System.out.print("Enter amount to withdraw: ");
        
        double Amount = scanner.nextDouble();
        if (Amount > 0 && Amount <= balance) {
            balance -= Amount;
            System.out.println("Withdrew: $" + Amount);
        } else if (Amount > balance) {
            System.out.println("Insufficient balance.please enter amount between"+balance);
        } else {
            System.out.println("Please enter a valid value.");
        }
        System.out.println("AVAILABLE BALANCE:"+balance);
    }
    private static void checkBalance() {
    	
    	System.out.println("AVAILABLE BALANCE:"+balance);
    }

    private static void addMoney(Scanner scanner) {
    	
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        
        if (amount > 0) {
            balance += amount;
            System.out.println("money added" + amount);
        } else {
            System.out.println("Please enter a valid amount.");
        }
        System.out.println("AVAILABLE BALANCE:"+balance);
    }

   
}
