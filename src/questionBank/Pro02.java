package questionBank;

class Parent {
	void show() {
		System.out.println("parent");
	}
}

class Child extends Parent {
	void show() {
		System.out.println("child");
	}
}

public class Pro02 {
	public static void main(String[] args) {
		Parent pa = new Child();
		pa.show();
	}
}