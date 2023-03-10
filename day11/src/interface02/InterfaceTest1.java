package interface02;

public class InterfaceTest1 {
	public static void main(String[] args) {
		InterClass ic = new InterClass();
		
		// 인터페이스는 객체를 생성할 수 없다
		// 자료형변환은 가능
		Interface interf = ic;
		interf.method();
		System.out.println(interf.MAX);
		
		InterfaceA interA = ic;
		interA.methodA();
		
		InterfaceB interB = ic;
		interB.methodB1();
	}

}
