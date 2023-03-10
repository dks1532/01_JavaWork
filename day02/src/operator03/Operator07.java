package operator03;

public class Operator07 {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		
		x=40;
		y=-9;
		z=0;
		
		absX = x >= 0 ? x : -x;
		System.out.println(absX);
		absY = y >= 0 ? y : -y;
		System.out.println(absY);
		System.out.println("-----------");
		
		String signX = (x == 0 ? 0 : x) > 0 ? "+" + x : ""+x;
		System.out.println(signX);
		
		String signY = (y == 0 ? 0 : y) > 0 ? "+" + y : ""+y;
		System.out.println(signY);
		
		String signZ = (z == 0 ? 0 : z) > 0 ? "+" + z : ""+z;	
		System.out.println(signZ);
		
	}

}
