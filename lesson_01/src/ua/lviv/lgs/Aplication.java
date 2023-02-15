package ua.lviv.lgs;

public class Aplication {
	public static void main(String[] args) {
//		Завдання 1
		int a = 10;
		System.out.println("a: " + a);
		byte b = 29;
		System.out.println("b: " + b);
		short sh = 124;
		long l1 = 1245121;
		System.out.println("long: " + l1 + "\nshort: " + sh);
		boolean t = true;
		boolean f = false;
		System.out.println("True: " + t + "\n" + "False: " + f);
		char ch1 = 'X';
		char ch2 = 89;
		System.out.println("ch1: " + ch1 + " ch2: " + ch2);
		float fl = 21.4f;
		double db = 45.23;
		System.out.println("float: " + fl + "\ndouble: " + db);
//		Завдання 2
		System.out.println("Byte min value = " + Byte.MIN_VALUE + " Byte max value = " + Byte.MAX_VALUE);
		System.out.println("Integer min value = " + Integer.MIN_VALUE + " Byte max value = " + Integer.MAX_VALUE);
		System.out.println("Long min value = " + Long.MIN_VALUE + " Long max value = " + Long.MAX_VALUE);
		System.out.println("Short min value = " + Short.MIN_VALUE + " Short max value = " + Short.MAX_VALUE);
		System.out.println("Float min value = " + Float.MIN_VALUE + " Float max value = " + Float.MAX_VALUE);
		System.out.println("Double min value = " + Double.MIN_VALUE + " Double max value = " + Double.MAX_VALUE);
//		Завдання 3
		int max = 0;
		int min = Integer.MAX_VALUE;
		int[] array = { 234, 23, 145, 12, 54, 11, 2, 8, 22, 15 };
		for (int i = 0; i < 10; i++) {
			if (max < array[i]) {
				max = array[i];
			} else if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Найбільше значення масиву :" + max);
		System.out.println("Найменше значення масиву :" + min);

	}
}
