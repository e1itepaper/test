package ch05;

public class ScoreEx {
	public static void main(String[] args) {
//		String title = "\t\t<<성적표>>";
//		String[] subject = { "이름", "국어", "영어", "수학", "한국사", "총점", "평균" };
//		String[] name = { "유지민", "김민정", "박지성", "나재민", "이제노" };
//		int[][] score = { { 90, 80, 70, 70 }, { 76, 86, 90, 70 }, { 90, 78, 90, 70 }, { 80, 80, 80, 70 },
//				{ 98, 80, 80, 70 } };
//		int[] tot = new int[score[0].length];
//		int len = 53;
		String title = "\t\t      <<매출현황>>";
		String[] subject = { "제품명", "1월", "2월", "3월", "4월", "합계", "평균" };
		String[] name = { "냉장고", "TV", "청소기" };
		int[][] amt = { { 250, 170, 900, 780 }, { 170, 120, 150, 220 }, { 450, 230, 400, 250 } };
		int len = 54, sum = 0;
		int[] tot = new int[amt[0].length];

		Score sc1 = new Score(title, subject, name, amt, len);
		sc1.print();
	}
}
