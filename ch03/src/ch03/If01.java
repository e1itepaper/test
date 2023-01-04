package ch03;

public class If01 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		/*
		 * 90 이면 A 80 이면 B 70 이면 C 60 이면 D 이하는 F 점수는 xx이고 학점은 x입니다.
		 */
		
		if (score >= 90) {
			System.out.println("점수는 " + score + "이고 학점은 A입니다.");
		} else if (score >= 80) {
			System.out.println("점수는 " + score + "이고 학점은 B입니다.");
		} else if (score >= 70) {
			System.out.println("점수는 " + score + "이고 학점은 C입니다.");
		} else if (score >= 60) {
			System.out.println("점수는 " + score + "이고 학점은 D입니다.");
		} else {
			System.out.println("점수는 " + score + "이고 학점은 F입니다.");
		}
		
	}

}
