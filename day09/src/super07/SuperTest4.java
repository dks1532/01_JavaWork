package super07;
class Parent3 {
	int x;
	Parent3(int x) {
		this.x = x*x;
		//System.out.println(x + "의 제곱 = " + this.x);
	}
}
class Child3 extends Parent3{
	int y;
	Child3(int x, int y) {
		super(x);
		this.y = y*y;
		//System.out.println(y + "의 제곱 = " + this.y);
	}
}
public class SuperTest4 {
	public static void main(String[] args) {
		Child3 ch3 = new Child3(5, 9);
		System.out.println("x변수의 제곱 = " + ch3.x);
		System.out.println("y변수의 제곱 = " + ch3.y);
	}

}
