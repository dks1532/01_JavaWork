package exception01;
import java.util.InputMismatchException;
import java.util.Scanner;
public class _06_InputMismatchException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		int sum = 0;
		for(int i=1; i<=3; i++) {
			System.out.println(i + "번째 정수 입력 : ");
			try {
				int num = sc.nextInt();
				sum += num;
			} catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다");
				// e.printStackTrace();
				// System.out.println("예외메시지 : " + e.getMessage());
				sc.next();
				--i;
			}
		}
		System.out.printf("합 = %d", sum);
	}
}
