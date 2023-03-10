package polymophism01;
class Car {
	private String model;
	private int door;
	
	Car(String model, int door) {
		this.model = model;
		this.door = door;
	}
	
	void drive() {
		System.out.println("운전중");
	}
	void stop() {
		System.out.println("stop!!");
	}
	void call() {
		System.out.println("차를 호출한 곳으로 갑니다");
	}
}

class Ambulance extends Car {
	Ambulance(String model, int door) {
		super(model, door);
	}
	
	@Override
	void call() {
		System.out.println("환자 이송 중");
	}
	
	void firstAid() {
		System.out.println("부상자를 응급처치합니다");
	}
}

class FireEngine extends Car {
	FireEngine(String model, int door) {
		super(model, door);
	}

	@Override
	void call() {
		System.out.println("물을 뿌려 불을 끕니다");
	}
}

public class PolymophismTest3 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe1 = new FireEngine("소방차", 2);
		Ambulance ab1 = new Ambulance("구급차", 3);
		
		car = fe1;
		car.call();
		car.drive();
		car.stop();
		
		car = ab1;
		car.call();
		car.drive();
		car.stop();
		
		ab1 = (Ambulance)car;
		ab1.call();
		ab1.drive();
		ab1.stop();
		ab1.firstAid();
	}
}
