package langPackage01.stringMethod01;

public class _05_StringEx5 {

	public static void main(String[] args) {
		// replace : 글자치환
		String str = "javaprogram java kimjava parkjava";
		String newStr = str.replace("java", "자바");
		System.out.println(newStr);
		
		newStr = str.replace("j", "oi");
		System.out.println(newStr);
		
		newStr = str.replaceFirst("a", "b");
		System.out.println(newStr);
	}
}
