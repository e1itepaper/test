package ch03;

public class Break02 {

	public static void main(String[] args) {
		a: for (int i = 1; i <= 10; i++) {
			for (int j = 1; i <= 10; j++) {
				System.out.println("j = " + j);
//				break는 내부의 for문장 종료
				if (j > 4) break a; //label a에 해당하는 for문 종료
			}

			System.out.println("i = " + i+"\n");
		}
	}

}
