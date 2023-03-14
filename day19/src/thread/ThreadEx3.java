package thread;

import java.util.Scanner;

public class ThreadEx3 {
	public static void main(String[] args) {
		ThreadEx3 th = new ThreadEx3();
		th.test1();
		System.out.println(Thread.currentThread().getName() + "End!");
	}
	
	private void test1() {
		Thread th1 = new Thread(new MultiplyThread(2,1000), "2배수쓰레드");
		Thread th2 = new Thread(new MultiplyThread(3,2000), "3배수쓰레드");
		
		th1.start();
		th2.start();
		
		System.out.println("엔터를 치면 종료됩니다");
		new Scanner(System.in).nextLine();
		
		th1.interrupt();
		th2.interrupt();
		
		// th1.setName("2배수쓰레드");		쓰레드 이름을 나중에 설정할 때
	}
	
	class MultiplyThread implements Runnable {
		private int num;
		private int millis;
		
		public MultiplyThread(int num, int millis) {
			this.num = num;
			this.millis = millis;
		}
		
		@Override
		public void run() {
			String name = Thread.currentThread().getName();
			int i = 1;
			while(true) {
				try {
					System.out.println("[" + name + "]" + num*i++);
					Thread.sleep(millis);
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}
	
//	public static void main(String[] args) {
//		ThreadEx3 th = new ThreadEx3();
//		th.test();
//		System.out.println(Thread.currentThread().getName() + "End!");
//	}
//
//	private void test() {
//		Thread th = new Thread(new SleepThread(), "실습 문제 ");
//		th.start();
//		
//		System.out.println("엔터를 치면 쓰레드가 멈춥니다");
//		new Scanner(System.in).nextLine();
//		th.interrupt();
//	}
//
//	class SleepThread implements Runnable {
//		@Override
//		public void run() {
//			for (int i = 1; i <= 200; i++) {
//				if(i % 2 == 0) {
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						System.out.println("쓰레드를 종료합니다");
//						break;
//					}
//					if(i % 3 == 0) {
//						System.out.println("[2와 3의 공배수] " + i);
//						continue;
//					}
//					System.out.println("[2의 배수] " + i);
//				} else if(i % 3 == 0) {
//					try {
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//						System.out.println("쓰레드를 종료합니다");
//						break;
//					}
//					System.out.println("[3의 배수] " + i);
//				}
//			}
//			System.out.println(Thread.currentThread().getName() + "End!");
//		}
//	}
}
