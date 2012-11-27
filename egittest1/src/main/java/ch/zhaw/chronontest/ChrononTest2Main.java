package ch.zhaw.chronontest;

public class ChrononTest2Main {

	private static final int LOOPS = 10000000;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < LOOPS; i++) {
			double a = Math.pow(i, 2);
			s = ""+a;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println("LAST s: " + s);
	}

}
