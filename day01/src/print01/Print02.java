package print01;

public class Print02 {

	public static void main(String[] args) {
		// 문자열에서 +는 연결기호, 숫자에서는 연산자
		System.out.println(5 + 3 + " : 5+3의 연산결과 출력");
		
		// +,-는 문자열 뒤에서 연산하고자하면 반드시 괄호 안에 넣어야한다
		System.out.println("5+3의 연산결과 : " + 5 + 3);
		System.out.println("5+3의 연산결과 : " + (5 + 3));
		System.out.println("5+3의 연산결과 : " + (5-3));
		
		// *,/ 은 상관없음
		System.out.println("5*3의 연산결과 : " + 5*3);
		System.out.println("5/3의 연산결과 : "  + 5/3);
		
	}

}
