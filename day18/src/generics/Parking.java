package generics;

import java.util.ArrayList;
import java.util.List;

public class Parking<T> {
	private T[] elems;
	private int index;
	
	public Parking() {
		this.elems = (T[]) new Object[16];
	}
	
	public void add(T t) {
		this.elems[index++] = t;
	}
	
	public T get(int index) {
		return this.elems[index];
	}
	
	public int size() {
		return this.index;
	}
	
	public String indexOf(String r) {
		return r;
	}
	
	public static void main(String[] args) {
		// test1();
		test2();
	}
	
	// 클래스 레벨의 제네릭
	public static void test1() {
		Parking<String> strPark = new Parking<>();
		strPark.add("SM7");
		strPark.add("GENESIS");
		
		System.out.println(strPark.get(0));
		System.out.println(strPark.get(1));
		System.out.println("------------");
		
		for(int i=0; i<strPark.size(); i++) {
			System.out.println(strPark.get(i));
		}
		System.out.println("------------");
		
		System.out.println(strPark.indexOf("SM7"));
		System.out.println(strPark.indexOf("GENESIS"));
		System.out.println(strPark.indexOf("ZZZ"));
	}
	
	// 메소드레벨 제네릭
	public static void test2() {
		int num1 = run(10);
		int num2 = run(20);
		String str = run("abc");
		
		System.out.println(num1+num2);
		System.out.println(str+num1+num2);
		
		List<Integer> intList = of(1,3,5,9,7);
		System.out.println(intList);
		
		List<String> strList = of("5교시","졸려요","제네릭","쉬워요");
		System.out.println((strList));
		
		// 자바에서 Array를 List 변환해주는 메소드 Arrays.asList(array) 사용
		// JDK 9버전부터 List.of(array)라는 새로운 팩토리 메소드 사용
		
		// Arrays.asList, List.of : 변경불가 list임. 삽입, 삭제 불가
		List<String> strList2 = List.of("자요","졸면안되요");
		System.out.println(strList2);
		// strList2.add("말똥말똥");		// 오류
	}
	
	public static <T> T run(T t) {
		return t;
	}
	
	public static <E> List<E> of(E... elems) {
		List<E> list = new ArrayList<>();
		
		for(E e : elems) {
			list.add(e);
		}
		return list;
	}
}
