package ch05;

class Box {
	int width, height, depth;

	public Box(int width) {
		this.width = width;
	}

	public Box(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	void square() {
		System.out.println("정사각형면적 : " + width * width);
	}

	void rectangle() {
		System.out.println("직사각형면적 : " + width * height);
	}

	void volume() {
		System.out.println("직육면체 부피 : " + width * height * depth);
	}
}

public class Box02Ex {
	public static void main(String[] args) {
		Box square = new Box(10);
		Box rectangle = new Box(10, 20);
		Box volume = new Box(10, 20, 30);
		square.square();
		rectangle.rectangle();
		volume.volume();
	}
}
