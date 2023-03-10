package langPackage03;

public class _02_HashCode {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}
