package interface03;

public class SmartPhone implements Phone, Searchable{
	int volume;
	
	@Override
	public void search(String msg) {
		System.out.println(msg + "를 검색한 결과입니다");
	}

	@Override
	public void turnOn() {
		System.out.println("전화를 받습니다");
	}

	@Override
	public void turnOff() {
		System.out.println("전화를 끊습니다");
	}

	@Override
	public void setVolume(int volume) {
		if(Phone.MAX_VOLUME < volume)
			this.volume = Phone.MAX_VOLUME;
		else if(Phone.MIN_VOLUME > volume)
			this.volume = Phone.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("현재 볼륨 : " + this.volume);
	}
	/*
	@Override
	public void internet(String url) {
		System.out.println(url + "을 검색");
	}
	*/
}
