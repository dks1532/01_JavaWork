package for01;

public class For01 {

	public static void main(String[] args) {
		// 반복문 : 여러번 반복하여 수행하고자 할때
		System.out.println("안녕하세요 KH정보교육원 입니다");
		System.out.println("안녕하세요 KH정보교육원 입니다");
		System.out.println("안녕하세요 KH정보교육원 입니다");
		System.out.println("안녕하세요 KH정보교육원 입니다");
		System.out.println("안녕하세요 KH정보교육원 입니다");
		System.out.println("---------------------------");
		
		String str = "안녕하세요 KH정보교육원 입니다";
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
		System.out.println("---------------------------");
		
		for(int i=1; i<=5; ++i) 
			System.out.println("안녕하세요 KH정보교육원 입니다");
		System.out.println("---------------------------");
		
		for(int j=1; j<=100; j++)
			System.out.println(str);
		System.out.println("---------------------------");
		
		for(int i=1; i<=100; i++)
			System.out.println(i + ". 안녕하세요 KH정보교육원 입니다");
	}
}
