/**
 * 
 */

/**
 * @author 2058146 Arun Sharma
 *
 */
public class Main {

	public static void main (String[] args) {
		
		Account myaccount = new Account (1000); //Starting with $1000
		
		System.out.println("Initial balance: $" + myaccount.getBalance());
		
		myaccount.deposit(500); //Deposit $500
		System.out.println("After Deposit: $" + myaccount.getBalance());

		myaccount.withdraw(200); //Deposit $200
		System.out.println("After withdrawal: $" + myaccount.getBalance());
	}
}
