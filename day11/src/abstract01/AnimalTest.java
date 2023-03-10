package abstract01;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Frog frog = new Frog();
		
		dog.sound();
		cat.sound();
		frog.sound();
		System.out.println("--------");
		// 추상클래스는 객체 생성안됨
		// Animal a = new Animal();
		
		// 형변환은 가능
		Animal ani = dog; // 오버라이딩된것은 무조건 자식것이 호출됨
		ani.sound();
		
		ani = cat;
		ani.sound();
		
		ani = frog;
		ani.sound();
		System.out.println("--------");
		
		aniSound(new Cat());
		aniSound(new Dog());
		aniSound(new Frog());
	}
	
	static void aniSound(Animal ani) {
		ani.sound();
	}

}
