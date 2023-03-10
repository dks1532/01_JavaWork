package polymophism01;
class Animal {
	void breathe() {
		System.out.println("숨을 쉽니다");
	}
	void sound() {
		System.out.println("울음소리 입니다");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("야옹");
	}
}
public class PolymophismTest {
	public static void main(String[] args) {
		Animal a1;
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		a1 = dog;
		dog.sound();
		a1.breathe();
		dog = (Dog)a1;
		
		a1 = cat;
		cat.sound();
		a1.breathe();
		
		cat = (Cat)a1;
		
		Animal a2 = new Animal();
		// cat = (Cat)a2;	강제 형변환 안됨.
		// Animal객체만 생성되어 있기 때문(Cat객체가 아예 만들어지지 않았음)
		
		// 클래스명 instanceof 클래스명
		// 왼쪽의 객체가 오른쪽의 객체의 타입으로 만들어졌느냐를 검사
		
		Animal a3 = new Cat();
		if(a3 instanceof Cat) {
			Cat cat1 = (Cat)a3;
			System.out.println("자식클래스로 변환됨");
		} else {
			System.out.println("자식클래스로 강제 형변환 안됨");
		}
		
		Animal a4 = new Animal();
		if(a4 instanceof Cat) {
			Cat cat1 = (Cat)a4;
			System.out.println("자식클래스로 변환됨");
		} else {
			System.out.println("자식클래스로 강제 형변환 안됨");
		}
	}
}
