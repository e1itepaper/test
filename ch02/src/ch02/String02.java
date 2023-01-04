package ch02;

public class String02 {

	public static void main(String[] args) {
		String str1 = "안녕 ";
		String str2 = "자바 ";
		String str3 = "반갑다 ";
		int age = 2022 - 1999 - 1;
		/* 응용문제02
		 * str1 + str2 + str3 출력
		 * 나이 : age + 살 출력
		 * 5칸 확보해서 나이
		 * 5칸 확보해서 빈칸은 0 대입하여 출력
		*/
		System.out.println(str1 + str2 + str3);
		System.out.println("나이 : " + age + "살");
		System.out.printf("%5d\n", age);
		System.out.printf("%05d", age);

	}

}
