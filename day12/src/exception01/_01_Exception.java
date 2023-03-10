package exception01;

public class _01_Exception {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			// 예외가 발생할 상황
			int result = 5/0;
			System.out.println(3);
			System.out.println(4);
		} catch(Exception e) {
			// 예외가 발생 했을 때 실행
			System.out.println("0으로 나눌수 없습니다");
			System.out.println(5);
		}
		
		System.out.println(6);
	}

}
