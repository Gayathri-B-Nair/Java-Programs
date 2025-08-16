/*5. Create a class BankAccount with:
• Variables: accountNumber, accountHolder, balance
• Constructor to initialize details
• Methods: deposit(amount) and displayDetails()
🟢 Perform deposit and show updated balance
 */
package tutorial4;
import java.util.Scanner;
class BankAccount{
	long accountNumber;
	String accountHolder;
	double balance;
	BankAccount(long accountNumber,String accountHolder,double balance){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	 void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Amount " + amount + " deposited successfully.");
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }
	 void displayDetails() {
	        System.out.println("\n--- Account Details ---");
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Balance: " + balance);
	    }
}
public class BankAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author:Gayathri B Nair
		 * Date:02/08/2025
		 */
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Account Number: ");
	        long accountNumber = sc.nextLong();
	        System.out.print("Enter Account Holder Name: ");
	        String accountholder = sc.next();
	        System.out.print("Enter Balance: ");
	        double balance = sc.nextDouble();
	        BankAccount account1 = new BankAccount(accountNumber, accountholder, balance);
	        account1.displayDetails();
	        System.out.print("\nEnter amount to deposit: ");
	        double amount = sc.nextDouble();
	        account1.deposit(amount);
	        account1.displayDetails();
	        sc.close();

	}

}
