package init01;

public class Init {
	int num = 10;
	static int sNum = 100;
	
	// 인스턴스 초기화 블럭 : 객체가 생성될 때 호출
	{
		System.out.println();
		System.out.println("인스턴스 초기화 블럭");
		System.out.println("인스턴스 변수 num = " + num);
		num = 1;
	}
	
	// 클래스 초기화 블럭 : 클래스가 올라올때 호출
	static {
		System.out.println("클래스 초기화 블럭");
		System.out.println("클래스 변수 sNum = " + sNum);
		sNum = 200;
	}
	
	// 생성자 : 객체가 생성될 때
	Init() {
		System.out.println();
		System.out.println("생성자 호출");
		System.out.println("인스턴스 변수 num = " + num);
		System.out.println("클래스 변수 sNum = " + sNum);
		num = 2;
		sNum = 500;
	}
}
