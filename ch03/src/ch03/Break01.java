package ch03;

public class Break01 {

	public static void main(String[] args) {
//		break는 반복문을 빠져나온다.
		int sum = 0, i=0;
		while(true) {
			sum +=i;
			i++;
			if(i>100) break;
		}
		System.out.println("합계 : " + sum);
	}

}
