package variable02;

public class Variable02 {

	public static void main(String[] args) {
		int x = 10;
		double pi = 3.141519;
		char ch = 'a'; // 반드시 1글자만, 외따옴표 (많이 사용은 안함)
		boolean bool = false;
		String str = "abcdefg"; // 안넣어도되고 1글자이상이어도됨
		
		System.out.println(x);
		System.out.println(pi);
		System.out.println(bool);
		System.out.println(str);
		System.out.println("--------------");
		
		bool = 50 > 40;
		System.out.println(bool);
		System.out.println("==============");
		
		// long형은 반드시 뒤에 L자를 붙여줌 안그러면 int로 인식
		long long1 = 12345645796481L; // 소문자 L도 가능 하지만 숫자 1과 혼동되기 때문에 보통 대문자 L을 씀
		
		// float형은 뒤에 f를 붙여줌
		float fl = 45.372f; // f는 혼동되지 않기 때문에 소문자를 주로 씀
		
	}

}
