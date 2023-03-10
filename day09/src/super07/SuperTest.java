package super07;

class Parent{
	int x = 10;
}
class Child extends Parent{
	int x = 100;
	void method() {
		int x = 500;
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}	
}

public class SuperTest {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.method();
	}

}
