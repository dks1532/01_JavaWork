package student07;

public class Student1 {
	/* 변수 3개
	 * 학번
	 * 이름
	 * 전화번호
	 * 
	 * 생성자(매개변수 3개)
	 * 	인스턴스변수를 초기화
	 */
	
	int stuNum;
	String name;
	String phoneNum;
	
	Student1(int stuNum, String name, String phoneNum){
		this.stuNum = stuNum;
		this.name = name;
		this.phoneNum = phoneNum;
		System.out.println("----------------");
	}
	
}
