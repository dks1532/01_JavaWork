package userException02;

public class Account {
	private int balance;

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
		System.out.printf("입금액 : %d원이 입금됨\n", money);
	}
	public void withdraw(int money) throws NotSufficientException {
		if(balance < money) {
			throw new NotSufficientException("잔고 " + (money-balance) + "원 부족");
		}
		balance -= money;
	}
}
