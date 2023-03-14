package thread;

public class Synchronized4 {

	public static void main(String[] args) {
		Synchronized4 sy = new Synchronized4();
		sy.test1();
	}

	private void test1() {
		Drink drink = new Drink(50000);

		Thread th1 = new Thread(new Delivery(drink), "kh지점");
		Thread th2 = new Thread(new Delivery(drink), "종로지점");
		Thread th3 = new Thread(new Delivery(drink), "강남본점");

		th1.start();
		th2.start();
		th3.start();
	}

	class Drink {
		public int stock;

		Drink(int stock) {
			this.stock = stock;
		}

		// 1. 메소드에 직접 동기화
		// public synchronized void sale(int count) {
		public void sale(int count) {
			String name = Thread.currentThread().getName();
			// 2. 동기화 블럭
			synchronized (this) {
				if (stock >= count) {
					stock -= count;
					System.out.printf("[%s] 판매 %d개 | 현재재고 %d개\n", name, count, stock);
				} else {
					System.out.println("재고가 부족합니다");
				}
			}
		}
	}

	class Delivery implements Runnable {
		private Drink drink;

		Delivery(Drink drink) {
			this.drink = drink;
		}

		@Override
		public void run() {
			while (drink.stock > 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int count = (int) (Math.random() * 5 + 1) * 1000; // 1000,2000,3000,4000,5000
				drink.sale(count);
			}
			System.out.println(Thread.currentThread().getName() + "End");
		}
	}
}
