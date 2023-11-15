// exercício de fixação

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		double priceOff = 1 - 0.25;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is %.2f%n%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		
		System.out.printf("Measure with eight decimal places: %.8f", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("In United States decimal point: %.6f%n%n", measure);
		
		System.out.printf("The new prices with your discounts:%n");
		
		System.out.printf("The new price of %s is $ %.2f%n", product1, price1 * priceOff);
		System.out.printf("The new price of %s is $ %.2f", product2, price2 * priceOff);
	} 

};

