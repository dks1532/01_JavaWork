package langPackage01.stringMethod01;

public class _02_StringEx2 {

	public static void main(String[] args) {
		// chatAt(index) : index번호에 해당하는 문자 1개 반환
		String str = "123456-5234567";
		char ch1 = str.charAt(7);
		switch(ch1) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		default :
			System.out.println("잘못입력했습니다");
		}
	}
}
