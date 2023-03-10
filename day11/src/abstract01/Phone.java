package abstract01;

abstract public class Phone {

	void receive() {
		System.out.println("전화를 받습니다");
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}
	
	abstract void sound();
}
