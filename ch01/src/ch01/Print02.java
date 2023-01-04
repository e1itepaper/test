package ch01;

public class Print02 {

	public static void main(String[] args) {
		String name = "박보검";
		int age = 29;
//		데이터
		System.out.print("이름 : ");
		System.out.println(name);
//		System.out.printf("%s : %s\n","취미","침뱉기");
		System.out.printf("%s\n", "취미: 침뱉기");
		System.out.printf("%s : %d\n", "나이", age);

//		camel type : 단어와 단어를 연결할 때 두 번째부터 시작하는 첫 글자 대문자
//		snake type : hello_java_java : 단어와 단어를 연결할 때 두번째부터 시작하는 첫글자 앞에 _
		int i1 = 7;
		float f1 = 2.4f;
		double d1 = 3.5;
		

	}

}
