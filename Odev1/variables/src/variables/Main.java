package variables;

import java.util.Scanner;

public static void menudekileriSayma() {
	for (int i = 0; i < 4; i++) {
		
		System.out.println()
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, order;
		String[] menu = {"Iced Americano", "Iced Latte", "Cappucino", "Cold Brew"};
		
		
		System.out.print("Welcome to Su Cafe. Please tell your name: " );
		name = scanner.nextLine();
		System.out.println("Hello " + name + "! " + "What would you like to get from our menu? Here is what we got: " + menu);
		order = scanner.nextLine();
		
		if(menu.equals(order)) {
			
			System.out.println("Awesome Choice. Your order will be ready in a moment. Your total is 6 dolar.");
		}
		
		else {
			System.out.println("Okay, your total is 2 dollar");
		}
		
	}

}
