package simple;

public class Mathd {
	
	public static int lastSum;

	public static void main(String[] args) {

		System.out.println(lastSum);
		System.out.println(add(3,5));		
		
		
		
		System.out.println(lastSum);
		System.out.println(add(3,5));
		
	}

	public static int add(int a, int b) {
		lastSum = a + b;
		return lastSum;
	}

}
