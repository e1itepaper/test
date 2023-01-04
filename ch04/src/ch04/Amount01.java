package ch04;

public class Amount01 {

	public static void main(String[] args) {
		String title = "\t\t      <<매출현황>>";
		String[] subject = { "제품명", "1월", "2월", "3월", "4월", "합계", "평균" };
		String[] name = { "냉장고", "TV", "청소기" };
		int[][] amt = { { 250, 170, 900, 780 }, { 170, 120, 150, 220 }, { 450, 230, 400, 250 } };
		int len = 54, sum = 0;
		int[] tot = new int[amt[0].length]; //4 : 0 ~ 3
//		int[] tot = {0,0,0,0};
		
		System.out.println(title);
		for (int i = 0; i < len; i++) {
		System.out.print("=");
		}
		System.out.println();
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < len; i++) {
			System.out.print("=");
		}
		System.out.println();

		for (int i = 0; i < amt.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < amt[i].length; j++) {
				System.out.print(amt[i][j] + "\t");
				sum += amt[i][j];
				tot[j]+= amt[i][j];
				
			}
			System.out.print(sum + "\t" + (sum / amt[i].length));
			sum = 0;
			System.out.println();
		}
		for (int i = 0; i < len; i++) {
			System.out.print("=");
		}
		System.out.println();

		System.out.print("합계\t");
		for (int j = 0; j < tot.length; j++) {
			sum += tot[j];
			System.out.print(tot[j] + "\t");

		}
		System.out.print(sum + "\t"+(sum/tot.length/name.length));
		
	}

}
