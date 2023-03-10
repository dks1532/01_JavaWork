package for01;

public class ForMulti07 {

	public static void main(String[] args) {
		// for문 안에 변수가 여러개이어도 된다
		// 단, 조건식은 반드시 1개 여야한다.
		for(int i=1, j=10, x=100; j>=1; i++, j--, x+=2) {
			System.out.println("i="+ i + ", j=" + j + ", x=" + x);
		}
		System.out.println("------------------");
		
		int num1 = 10;
		for(;;) {			
			num1++;
			System.out.println(num1);			
			if(num1 == 20)
				break;  // 반복문을 빠져나올때 사용		
		}	
	}
}
