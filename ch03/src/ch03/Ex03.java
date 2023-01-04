package ch03;

public class Ex03 {

	public static void main(String[] args) {

		int result = 0;

		int num1;
		int num2;
		for (num1 = 1; num1 < 7; num1++) {
			for (num2 = 1; num2 < 7; num2++) {
				result = num1 +num2;
				if(result == 6) {
					System.out.println(num1 +" + "+num2+" = "+result);
				}
			}
		}
	}

}
