package interface03;

public interface Tv {
	int MAX_CHANNEL = 100;
	int MIN_CHANNEL = 1;
	
	void turnOn();
	void turnOff();
	void setChannel(int channel);
	void setVolume(int volume);
}
