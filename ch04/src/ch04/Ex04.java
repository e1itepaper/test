package ch04;

public class Ex04 {

	public static void main(String[] args) {
//		거스름돈 372000원을 50000, 10000, 5000, 1000 몇 개씩 주어야하나?
		int money = 172000;
		int[] unit = { 50000, 10000, 5000, 1000 };

		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d원 : %d장\n", unit[i], money / unit[i]);
			money %= unit[i];
		}

	}

}
