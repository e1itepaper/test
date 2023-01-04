package ch05;

class Person {
	String name, hobby;
	int age;

	public Person() {

	}

	public Person(String n) {
		name = n;
	}

	public Person(String n, int a) {
		name = n;
		age = a;
	}

	public Person(String n, int a, String h) {
		name = n;
		age = a;
		hobby = h;
	}

	void prn() {
		System.out.println("================");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("취미 : " + hobby);
	}
}

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 23;
		p1.name = "유지민";
		p1.hobby = "독서";
		Person p2 = new Person("김민정"); p2.age=22; p2.hobby="영화";
		Person p3 = new Person("박지성", 21);  p3.hobby="영화";
		Person p4 = new Person("나재민", 23, "사진찍기");

		p1.prn();
		p2.prn();
		p3.prn();
		p4.prn();
		

	}
}
