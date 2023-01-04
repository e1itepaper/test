package ch05;

public class InitBlock {
	int i; // 변수선언
	int j;
	{	// 초기화 블럭
		j = 10;
	}

//	i=10; //실행문 메소드 안에서만 가능
	void a1() {
		i = 10;
	}
}
