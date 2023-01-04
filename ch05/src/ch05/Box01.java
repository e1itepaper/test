package ch05;

public class Box01 {
	int width;
	int height;
//  >>생성자가 없으면<< 컴파일할 때 자동으로 default 생성자를 만들어 준다
	public Box01() { // default생성자 : 매개변수가 없고 public인 생성자
		// TODO Auto-generated constructor stub
	}

	void area() {
		System.out.println("면적 : " + width * height);
	}
}
