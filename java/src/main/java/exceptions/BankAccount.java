package exceptions;

public class BankAccount {

	private double Balance;
	private String AccountHolder;

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public BankAccount(double balance, String accountHolder) {
		this.Balance = balance;
		this.AccountHolder = accountHolder;
	}

	public void WithdrawAmount(double amount) throws InsufficientBalanceException {

		if (amount > Balance) {

			throw new InsufficientBalanceException("Insufficient Balance " + Balance);
		}
		Balance -= amount;
	}

}
