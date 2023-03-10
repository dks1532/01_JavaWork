package interface03;

public class TvClass implements Tv, SmartTv{
	int channel;
	
	@Override
	public void search(String msg) {
		System.out.println(msg + "를 검색한 결과입니다");
	}

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL)
			this.channel = MAX_CHANNEL;
		else if(channel < MIN_CHANNEL)
			this.channel = MIN_CHANNEL;
		else
			this.channel = channel;
		
		System.out.println("현재 채널 : " + this.channel);
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("현재 볼륨 : " + volume );
	}

}
