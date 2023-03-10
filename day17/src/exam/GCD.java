package exam;

public class GCD {
	public void gcd(int num1, int num2) {
		for(int i=num1; ;i--) {
			if(num1 % i ==0 && num2 % i == 0) {
				System.out.println("최대공약수: " + i);
				break;
			}
		}
	}
}
