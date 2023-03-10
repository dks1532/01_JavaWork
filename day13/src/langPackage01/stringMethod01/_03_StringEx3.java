package langPackage01.stringMethod01;

public class _03_StringEx3 {
	public static void main(String[] args) {
		// indexOf(문자열) : 문자열의 시작 index번호를 얻어옴
		String str = "java program";
		int index = str.indexOf("program");
		System.out.println(index);
		
		index = str.indexOf("pro");
		System.out.println(index);
		
		index = str.indexOf("por");
		System.out.println(index);
		
		if(str.indexOf("java") == -1)
			System.out.println("자바프로그램이 아닙니다");
		else
			System.out.println("자바프로그램 입니다");
		
		if(str.indexOf("java") < 0)
			System.out.println("자바프로그램이 아닙니다");
		else
			System.out.println("자바프로그램 입니다");
		
		if(str.indexOf("java") >= 0)
			System.out.println("자바프로그램 입니다");
		else
			System.out.println("자바프로그램이 아닙니다");
		
		str = "java program kim java park java";
		index = str.lastIndexOf("java");
		System.out.println(index);
	}
}
