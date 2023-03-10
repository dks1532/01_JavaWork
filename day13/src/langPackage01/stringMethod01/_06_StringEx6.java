package langPackage01.stringMethod01;

public class _06_StringEx6 {

	public static void main(String[] args) {
		// substring(시작index, 끝index) : 시작index ~ 끝index 직전까지
		// substring(시작index) : 시작index부터 끝까지 
		String str = "공공데이터 융합 웹 애플리케이션 개발자 양성과정2";

		System.out.println(str.substring(6, 8));
		System.out.println(str.substring(9));
		
		String sn = "041121-3789760";
		/*
		String gender = sn.substring(7,8);
		if(gender.equals("1") || gender.equals("3"))
		
		int gender = Integer.parseInt(sn.substring(7,8));
		if(gender == 1 || gender == 3)
			System.out.println("남자");
		else
			System.out.println("여자");
		*/
		String gender = sn.substring(7,8);
		switch(gender) {
		case "1": case "3":
			System.out.println("남자");
			break;
		case "2": case "4":
			System.out.println("여자");
		}
		
		// String birthday = sn.substring(2,4) + "월 " + sn.substring(4,6) + "일";
		System.out.println(sn.substring(2,4) + "월 " + sn.substring(4,6) + "일");
		
		int year = Integer.parseInt(sn.substring(0,2)) + 2000;
		System.out.println(2023-year + "세");		
	}
}
