package student07;

public class Student1Test {

	public static void main(String[] args) {
		Student1 stu1 = new Student1(20230101, "홍길동", "01012345678");
		System.out.println("stu1의 학번: " + stu1.stuNum);
		System.out.println("stu1의 이름: " + stu1.name);
		System.out.println("stu1의 전화번호: " + stu1.phoneNum);
		
		Student1 stu2 = new Student1(20230102, "이순신", "01018535678");
		System.out.println("stu2의 학번: " + stu2.stuNum);
		System.out.println("stu2의 이름: " + stu2.name);
		System.out.println("stu2의 전화번호: " + stu2.phoneNum);
		
		Student1 stu3 = new Student1(20230103, "이요신", "01083155678");
		System.out.println("stu3의 학번: " + stu3.stuNum);
		System.out.println("stu3의 이름: " + stu3.name);
		System.out.println("stu3의 전화번호: " + stu3.phoneNum);
		
		Car car1 = new Car(3);
		Car car2 = new Car("yellow");
		Car car3 = new Car("green", "K7");
		System.out.println("==============================");
		
		Car car4 = new Car();
	}

}
