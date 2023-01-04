package ch05;

public class Account {
	String accountNo; // 계좌번호
	String name; // 예금주
	int balance; // 잔액

	public Account(String accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	void deposit(int money) {// 예금
		balance += money;
		System.out.println(name + " 입금: " + money);
	}

	void withdraw(int money) {// 출금
		if (balance >= money) {
			balance -= money;
			System.out.println(name + " 출금 : " + money);
		} else {
			System.out.println("잔액부족");
		}

	}

	void disp() {
		System.out.println("================");
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주 : " + name);
		System.out.println("잔액 : " + balance);

		System.out.println("================");
	}

}
