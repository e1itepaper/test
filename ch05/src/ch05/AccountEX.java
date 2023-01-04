package ch05;

public class AccountEX {
	public static void main(String[] args) {
		Account ac1 = new Account("국민1234", "나재민", 10000);
		Account ac2 = new Account("우리8254", "박지성", 20000);
		Account ac3 = new Account("하나4754", "김민정", 15000);

		int money = 0;
		for (int i = 0; i < 10; i++) {
			money = (int) (Math.random() * 10000 + 1);
			ac1.deposit(money);
			money = (int) (Math.random() * 10000 + 1);
			ac1.withdraw(money);
		}
		ac1.disp();
		for (int i = 0; i < 10; i++) {
			money = (int) (Math.random() * 10000 + 1);
			ac2.deposit(money);
			money = (int) (Math.random() * 10000 + 1);
			ac2.withdraw(money);
		}
		ac2.disp();
		
		for (int i = 0; i < 10; i++) {
			money = (int) (Math.random() * 10000 + 1);
			ac3.deposit(money);
			money = (int) (Math.random() * 10000 + 1);
			ac3.withdraw(money);
		}
		ac3.disp();
	}
}
