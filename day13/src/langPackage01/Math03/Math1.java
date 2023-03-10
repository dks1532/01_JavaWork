package langPackage01.Math03;

public class Math1 {

	public static void main(String[] args) {
		// 절대값
		System.out.println("-11의 절대값 : " +  Math.abs(-11));
		System.out.println("-11.13의 절대값 : " +  Math.abs(-11.13));
		
		// 소수점 이하 무조건 올림
		System.out.println("13.1의 올림 : " +  Math.ceil(13.1));
		System.out.println("-13.1의 올림 : " +  Math.ceil(-13.1));
		
		// 소수점 이하 무조건 내림
		System.out.println("13.8의 내림 : " +  Math.floor(13.8));
		System.out.println("-13.8의 내림 : " +  Math.floor(-13.8));
		System.out.println("----------------------------");
		
		// 가장 가까운 정수값 반환
		System.out.println("13.1의 가까운 정수값 : " + Math.rint(13.1));
		System.out.println("13.9의 가까운 정수값 : " + Math.rint(13.9));
		System.out.println("13.5의 가까운 정수값 : " + Math.rint(13.5));
		System.out.println("-13.1의 가까운 정수값 : " + Math.rint(-13.1));
		System.out.println("-13.9의 가까운 정수값 : " + Math.rint(-13.9));
		System.out.println("----------------------------");
		
		// 소수점 이하 반올림
		System.out.println("13.6의 반올림 : " + Math.round(13.6));
		System.out.println("13.1의 반올림 : " + Math.round(13.1));
		System.out.println("13.5의 반올림 : " + Math.round(13.5));
		System.out.println("-13.6의 반올림 : " + Math.round(-13.6));
		System.out.println("-13.1의 반올림 : " + Math.round(-13.1));
		System.out.println("----------------------------");
		
		// 둘중 작은수, 큰수
		System.out.println("7과 8중 큰숫자 : " + Math.max(7, 8));
		System.out.println("7과 8중 작은숫자 : " + Math.min(7, 8));
		System.out.println("7.345와 7.545중 큰숫자 : " + Math.max(7.345, 7.545));
		System.out.println("7.345와 7.545중 작은숫자 : " + Math.min(7.345, 7.545));

		// 소수점 2째자리까지 얻기
		double value = 12.34567;
		double value2 = value * 100;
		System.out.println(value2);
		double value3 = Math.round(value2);
		System.out.println(value3);
		System.out.println(value3/100);
		
		System.out.printf("%.2f", 89.456784);
	}
}
