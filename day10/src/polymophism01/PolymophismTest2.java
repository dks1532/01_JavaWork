package polymophism01;
class Parent {
	void method1() {
		System.out.println("Parent-method1()");
	}
	void method2() {
		System.out.println("Parent-method2()");
	}
}
class Child extends Parent {
	@Override
	void method2() {
		System.out.println("Parent-method2()를 오버라이딩");
	}
	void method3() {
		System.out.println("Child-method3()");
	}
	void method4() {
		System.out.println("Child-method4()");
	}
}

public class PolymophismTest2 {
	public static void main(String[] args) {
		/*
		Child c1 = new Child();
		Parent p1 = c1;
		*/
		Parent p1 = new Child();
		// 부모타입으로 형변환을 했기 때문에 부모것만 쓸 수 있다
		p1.method1();
		// 오버라이딩을 한경우 부모타입으로 형변환을 했어도 자식것이 호출됨
		p1.method2();
		
		// p1.method(); 자식것은 호출 불가
	}
}
