package ch04;

public class Ex01 {

	public static void main(String[] args) {
		int[] i1 = new int[] { 76, 45, 34, 89, 100, 50, 90, 92 };
		int max = i1[0];
		int min = i1[0];
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < i1.length; i++) {
			sum += i1[i];
			if (i1[i] > max)
				max = i1[i];
			if (i1[i] < min)
				min = i1[i];

		}
		avg = sum / i1.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("==================");
		sum = 0; max = i1[0]; min = i1[0]; // 다시 초기화
		
		for (int sc : i1) {
			sum += sc;
			if (sc > max)
				max = sc;
			if (sc < min)
				min = sc;

		}
		avg = sum / i1.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
