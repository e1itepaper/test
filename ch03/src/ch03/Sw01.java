package ch03;

public class Sw01 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		// break는 switch문을 빠져 나간다.
		switch (num) {
		case 1:
			System.out.println("L");
			break;
		case 2:
			System.out.println("O");
			break;
		case 3:
			System.out.println("V");
			break;
		case 4:
			System.out.println("E");
			break;
		default:
			System.out.println("1/2/3/4 중에서 입력하세요");
		}
	}

}
