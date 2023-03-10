package inheritance03;
class A1{
	int i;
}

class B1 extends A1 {
	String i;
}

public class InheritanceTest3 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.i = "KH정보교육원";
		System.out.println(b1.i);
		// 우선순위는 자손의 변수가 있으면 먼저 실행됨
		// b1.i = 100;  B1클래스의 i변수를 먼저 수행하므로 자료형이 맞지않음
		
		A1 a1 = new A1();
		a1.i = 100;
		System.out.println(a1.i);
	}
}
