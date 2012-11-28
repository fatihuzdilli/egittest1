package ch.zhaw.chronontest;

public class ChrononTest1Main {

	private static final int LOOPS = 10000000;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		double a = 0;
		for (int i = 0; i < LOOPS; i++) {
			a = Math.pow(i, 2);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println("LAST a: " + a);
	}
	
	
	private void unnecessaryMethod() {
	}
	
	private void notAProgrammersMethod() {

	}

}
