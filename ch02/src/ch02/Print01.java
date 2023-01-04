package ch02;

public class Print01 {

	public static void main(String[] args) {
		System.out.printf("%d\n",16);
		//				   출력할 크기 = 5 @@@@@
		System.out.printf("%5d\n",16); // 16 포함 5칸으로 출력 앞에 공백 16@@@
		System.out.printf("%05d\n",16); //빈칸을 0으로 채우고 5칸으로 출력 00016
		System.out.printf("%-5d\n",16); // - 를 붙이면 16 뒤에 공백 @@@16
	}

}
