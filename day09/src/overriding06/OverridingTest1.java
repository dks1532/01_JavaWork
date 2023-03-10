package overriding06;
class Ea {
	void print() {
		System.out.println("부모 클래스의 print() 메서드");
	}
}

class Eb extends Ea {
	// 오버라이딩
	void print() {
		System.out.println("자식 클래스의 print() 메서드");
	}
}

public class OverridingTest1 {
	public static void main(String[] args) {
		Eb eb = new Eb();
		eb.print();  // 오버라이딩(상속에서만 사용)
		
		Ob ob = new Ob();
		ob.show();   // 오버로딩(상속, 메서드, 생성자 사용)
		ob.show("인자1개");
	}
}

class Oa {
	void show() {
		System.out.println("부모 show() 메서드");
	}
}

class Ob extends Oa {
	// 오버로딩
	void show(String name) {
		System.out.println("자식 show() 메서드 " + name);
	}
}













