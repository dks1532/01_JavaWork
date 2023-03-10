package tv04;

public class Tvtest {

	public static void main(String[] args) {
		SmartTv st1 = new SmartTv();
		st1.power();
		st1.channelUp();
		st1.search("java");
		st1.netflix("피지컬100");
		st1.power();
	}
}
