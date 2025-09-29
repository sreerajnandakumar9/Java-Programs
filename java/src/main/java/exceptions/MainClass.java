package exceptions;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount bc = new BankAccount(5000, "Sree");
		System.out.println("Current Balance - "+bc.getBalance());

		try {

			bc.WithdrawAmount(4000.00);
			System.out.println("Balance After First Withdrawl - "+bc.getBalance());


		} catch (InsufficientBalanceException e) {
			System.out.println("Transaction failed: " + e.getMessage());

		}
		try {
			bc.WithdrawAmount(3000.00); // Valid withdrawal
		//	System.out.println("Balance After Second Withdrawl - "+bc.getBalance());

		} catch (InsufficientBalanceException e) {
			System.out.println("Transaction failed: " + e.getMessage());

		}
	}

}
