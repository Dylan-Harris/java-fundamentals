package Main;

//import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println(add(1, 5));
		System.out.println(concat("Hello", "World"));
		System.out.println(divide(6, 0));
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static String concat(String a, String b) {
		return a + b;
	}
	
	public static int divide(int a, int b) {
		return a / b;
	}
}
