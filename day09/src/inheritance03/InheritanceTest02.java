package inheritance03;
class AA{
	int i, j;
	void setIJ(int x, int y) {
		i = x;
		j = y;
	}
}

class BB extends AA {
	int total;
	int sum() {
		total = i+j;
		return total;
	}
}

public class InheritanceTest02 {
	public static void main(String[] args) {
		BB b1 = new BB();
		b1.setIJ(30, 70);
		System.out.println(b1.sum());
	}
}
