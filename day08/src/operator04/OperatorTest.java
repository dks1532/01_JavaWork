package operator04;

import java.util.Arrays;

public class OperatorTest {
	int b = 10;	// 인스턴스 변수(객체생성을 해야만 사용가능)
	static int c = 20;	// 클래스 변수(객체생성을 하지 않고도 사용가능)

	public static void main(String[] args) {
		int a = 30; // 지역변수
		Operator op1 = new Operator();
		System.out.println(op1.add(9.7));
		System.out.println(op1.add(5, 4));
		System.out.println(op1.add(31.56, 83.86));
		System.out.println(op1.add());
		
		int[] arr = {3,8,19,38,100,293,489};
		
		int arr2[] = new int[100];
		int value = 0;
		for(int i=0; i<arr2.length; i++) {
			value += 3;
			arr2[i] = value;
		}
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(op1.add(arr2));
		
		System.out.println("클래스 메서드 호출 : " + msg());
		System.out.println("클래스 변수의 값 : " + c);
		
		OperatorTest ot = new OperatorTest();
		System.out.println("인스턴스 변수 b의 값 : " + ot.b);
		System.out.println("인스턴스 메서드 호출 : " + ot.sum2(op1.num1));
	} // main 메서드 닫는 괄호
	
	static String msg() {
		return "ㅎㅇ";
	}

	int sum2(int a) {
		return a+100;
	}
} // 클래스 닫는 괄호
