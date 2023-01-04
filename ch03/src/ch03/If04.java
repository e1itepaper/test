package ch03;

public class If04 {

	public static void main(String[] args) {
		/*int num = 8;

		if (num >= 1000) {
			System.out.println("1000이상의 값입니다.");
		} else if (num < 1000 && num >= 100) {
			System.out.println("100이상 1000미만의 값입니다.");
		} else if (num < 100 && num >= 10) {
			System.out.println("10이상 100미만의 값입니다.");
		} else if (num < 10) {
			System.out.println("10미만의 값입니다.");
		}*/
		
		int num = Integer.parseInt(args[0]);
		if (num >= 1000) {
			System.out.println("1000이상의 값입니다.");
		} else if (num < 1000 && num >= 100) {
			System.out.println("100이상 1000미만의 값입니다.");
		} else if (num < 100 && num >= 10) {
			System.out.println("10이상 100미만의 값입니다.");
		} else if (num < 10) {
			System.out.println("10미만의 값입니다.");
		}
	}

}
