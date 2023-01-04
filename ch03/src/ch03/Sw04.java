package ch03;

public class Sw04 {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String msg = "";
		int etc = month % 3;

		switch (etc) {
		case 0 : msg ="초";break;
		case 1:msg="찐"; break;
		case 2:msg="늦"; 
		}
		
		switch (month) {
		case 1: case 12 : case 2:
			msg +="겨울";
			break;
		case 3: case 4: case 5:
			msg += "봄";
			break;
		case 6: case 7: case 8:
			msg += "여름";
			break;
		case 9:case 10: case 11:
			msg += "가을";
			break;
		default:
			msg = "옳은 숫자가 아닙니다.";
		}
		System.out.println(msg);
	}

}
