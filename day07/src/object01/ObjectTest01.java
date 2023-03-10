package object01;

import java.util.Scanner;

public class ObjectTest01 {

	public static void main(String[] args) {
		// 실행용 클래스
		
		Object01 ob1 = new Object01();
		
		System.out.println(ob1.name);
		
		ob1.tel = "02-3456-9098";
		System.out.println(ob1.tel);
		
		// addr, num 출력
		System.out.println(ob1.addr);
		System.out.println(ob1.num);
		
		// 주소 변경하여 출력
		ob1.addr = "당산역";
		
		System.out.println("-------------------");
		System.out.println("ob1객체의 주소 : " + ob1.addr);
		System.out.println("ob1객체의 이름 : " + ob1.name);
		System.out.println("ob1객체의 전화 : " + ob1.tel);
		System.out.println("ob1객체의 숫자 : " + ob1.num);
		
		Object01 ob2 = new Object01();
		System.out.println("-------------------");
		System.out.println("ob2객체의 주소 : " + ob2.addr);
		System.out.println("ob2객체의 이름 : " + ob2.name);
		System.out.println("ob2객체의 전화 : " + ob2.tel);
		System.out.println("ob2객체의 숫자 : " + ob2.num);
		
		Car car = new Car();
		System.out.println("-------------------");
		System.out.println("car객체의 회사명: " + car.com);
		System.out.println("car객체의 모델명: " + car.name);
		System.out.println("car객체의 색상: " + car.color);
		System.out.println("car객체의 기어: " + car.gear);
		System.out.println("car객체의 최대속도: " + car.maxSpeed);
		System.out.println();
		
		car.color = "회색";
		System.out.println("car객체의 색상: " + car.color);
	}

}
