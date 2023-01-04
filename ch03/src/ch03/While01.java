package ch03;

public class While01 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
//		while은 조건을 변경하는 식이 없으면 무한정 작업이 진행되다가 메모리 부족으로 종료
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1부터 100까지 합은 " + sum);
	}

}
