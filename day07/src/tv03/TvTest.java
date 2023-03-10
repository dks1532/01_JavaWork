package tv03;

public class TvTest {

	public static void main(String[] args) {
		// Tv객체 생성
		Tv tv1 = new Tv();
		tv1.company = "삼성";
		tv1.model = "UHD 50인치";
		
		System.out.printf("어느회사 tv인가요? %s\n", tv1.company);
		System.out.println("모델명은 무엇인가요? " + tv1.model);
		
		tv1.power();
		
		tv1.channelUp();
		System.out.printf("현재 채널은 %d 입니다\n", tv1.channel);
		
		tv1.channelUp();
		System.out.printf("현재 채널은 %d 입니다\n", tv1.channel);
		
		tv1.channelDown();
		System.out.printf("현재 채널은 %d입니다\n", tv1.channel);
		
		tv1.volumeUp();
		System.out.printf("현재 볼륨은 %d입니다\n", tv1.volume);
		
		tv1.volumeDown();
		System.out.printf("현재 볼륨은 %d입니다\n", tv1.volume);
		
		tv1.power();
		tv1.power();
		System.out.println("=============================");
		
		Tv2 tv2 = new Tv2();
		tv2.company = "LG";
		tv2.model = "HD 70인치";
		System.out.printf("어느회사 tv인가요? %s\n", tv2.company);
		System.out.println("모델명은 무엇인가요? " + tv2.model);
		
		tv2.power();
		int volume = tv2.volumeUp();
		System.out.printf("현재 볼륨은 %d입니다\n", volume);
		System.out.println("현재 볼륨은 " + tv2.volumeUp() + "입니다");
		
		volume = tv2.volumeDown();
		System.out.printf("현재 볼륨은 %d입니다\n", volume);
		
		int channel = tv2.channelUp();
		System.out.printf("현재 채널은 %d입니다\n", channel);
		
		channel = tv2.channelDown();
		System.out.printf("현재 채널은 %d입니다\n", channel);
		System.out.println("=============================");
		
		Tv3 tv3 = new Tv3();
		System.out.printf("현재 볼륨은 %d입니다\n", tv3.volume(20));
		System.out.printf("현재 볼륨은 %d입니다\n", tv3.volume(15));
		System.out.printf("현재 볼륨은 %d입니다\n", tv3.volumeUp(10));
		System.out.printf("현재 볼륨은 %d입니다\n", tv3.volumeDown(5));
		
	}

}
