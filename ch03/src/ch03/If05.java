package ch03;

public class If05 {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String msg = "";
		if (month == 12 || month == 1 || month == 2) {
			msg = "겨울입니다.";
		} else if (month == 3 || month == 4 || month == 5) {
			msg = "봄입니다.";
		} else if (month == 6 || month == 7 || month == 8) {
			msg = "여름입니다.";
		} else if (month == 9 || month == 10 || month == 11) {
			msg = "가을입니다.";
		} else {
			msg = "옳은 숫자가 아닙니다.";
		}
		System.out.println(msg);
	}

}
