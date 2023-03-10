package for01;

public class ForMulti05 {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			for(int j=9; j>4; j--) {
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println("----------------");
		
		// 구구단 출력
		for(int dan=2; dan<=9; dan++) {
			System.out.println(dan + "단");
			for(int i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			}
			System.out.println();
		}
	}
}







