package resolucao_desafios;

import java.util.Scanner;
import java.util.Locale;

public class Day02Operators {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US); 
		 Scanner input = new Scanner(System.in);
		 
		 
		double meal_cost = input.nextDouble(); 
	        int tip_percent = input.nextInt(); 
	        int tax_percent = input.nextInt(); 
	        
	        
	        double tip = meal_cost * tip_percent / 100;
	        double tax = meal_cost * tax_percent / 100;
	        double total_cost = meal_cost + tip + tax;
	        
	        
	        System.out.println(Math.round(total_cost));
	        
	        input.close();		

	}

}
