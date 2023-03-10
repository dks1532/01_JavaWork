package varargs05;

public class VarargsTest {

	public static void main(String[] args) {
		int[] a = {100,200,300,400,500};
		
		for(int i=0; i<a.length-1; i++)
			System.out.println(a[i+1]);
		System.out.println("--------------");
		
		for(int b : a) // 향상된 for문
			System.out.println(b);
		
		System.out.println(con("a","b","c","d","e"));
		System.out.println(con2("-","a","b","c","d","e"));
		System.out.println(con2(",","a","b","c","d","e"));
		
	}
	
	static String con(String... str) { // 0개~무한대까지 문자열을 받을수 있다
		String result = "";
		for(String arst : str) {
			result += arst + " ";
		}
		return result;
	}
				// 인자가 1개이상 들어와야 한다
	static String con2(String format1, String... str) {
		String result = "";
		for(String arst : str) {
			result += arst + format1;
		}
		return result;
	}
}
