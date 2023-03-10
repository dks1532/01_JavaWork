package interface03;

public class TvTest {
	public static void main(String[] args) {
		TvClass tv = new TvClass();
		tv.turnOn();
		tv.setChannel(200);
		tv.setVolume(30);
		tv.search("스마트tv");
		tv.turnOff();
	}

}
