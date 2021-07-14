import java.util.*;

public class BankATM {

	Scanner key = new Scanner(System.in);
	private String name;
	private int id;
	private int deposit;
	private int withdrawal;
	private int balance;
	private int options;
	private int previousTransaction;

	public BankATM(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void makeDeposit(int deposit) {
		balance = balance + deposit;
		previousTransaction = deposit;
	}

	public void makeWithdrawal(int withdrawal) {
		balance = balance - withdrawal;
		previousTransaction = withdrawal;
	}

	public void showList() {
		System.out.println("Welcome, " + name + " | ID: " + id + "\n");

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~ Choose an Option ~~\n~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.println("(1) Check the Account Balance ");
		System.out.println("(2) Deposit Cash ");
		System.out.println("(3) Get Cash ");
		System.out.println("(4) Previous Transaction");
		System.out.println("(5) Exit");

		
		do {
			
			options = key.nextInt();

			while (options > 5) {
				System.out.println("Alert: Please Choose correct option");
				options = key.nextInt();
			}
			
			switch (options) {

			case 1:
				System.out.println("Current Balance: $" + balance);
				break;

			case 2:
				System.out.println("Enter the amount to deposit");
				deposit = key.nextInt();
				makeDeposit(deposit);
				System.out.println("new Balance: $" + balance);
				break;

			case 3:
				System.out.println("Enter the amount to Withdrawal");
				withdrawal = key.nextInt();
				makeWithdrawal(withdrawal);
				System.out.println("new Balance: $" + balance);
				break;

			case 4:
				System.out.println("Previous Transaction: $" + previousTransaction);
				break;

			case 5:
				System.out.println("Thank You for using our Banking Service\n");
				break;
			}

		} while (options < 5);
	}
}
