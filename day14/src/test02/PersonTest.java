package test02;
class Person {
	private String name;
	private int age;
	Person() { }
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("홍길동", 25);
		System.out.println(p2.getName());
		p1.setName("아무개");
		System.out.println(p1.getName());
		System.out.printf("이름: %s, 나이: %d\n", p2.getName(), p2.getAge());
		
		Person p3 = new Person("이순신", 23);
		Person p4 = new Person("이율곡", 53);
		System.out.printf("이름: %s, 나이: %d\n", p3.getName(), p4.getAge());
		System.out.printf("이름: %s, 나이: %d\n", p4.getName(), p4.getAge());
		System.out.println("--------------------");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}
