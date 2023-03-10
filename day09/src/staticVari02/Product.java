package staticVari02;

public class Product {
	static int count;  
	int proNo = 20230000; 
	
	Product() {
		++count;
		proNo += count;
	}
	
	/*
	{
		++count;
		proNo = count;
	}
	*/
}
