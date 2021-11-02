package Main;

//import java.util.Iterator;

import Main.lemonadestand.Water;

public class Main {

	public static void main(String[] args) {
		
		Water waterOne = new Water(5, "cups");
		
		System.out.println(waterOne.drink(3));
		
		System.out.println(waterOne.amount + " " + waterOne.unit);
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
