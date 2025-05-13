package resolucao_desafios;

import java.util.Scanner;
import java.util.Locale;

public class Day01DataTypes {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US); 
	     
	     
	     int i = 4;
	     double d = 4.0;
	     String s = "HackerRank ";
	     
	     Scanner input = new Scanner(System.in);

	     int i2;
	     double d2;
	     String s2;
	     
	     i2 = input.nextInt();       
	     d2 = input.nextDouble();    
	     input.nextLine();           
	     s2 = input.nextLine();  
	     
	     System.out.println(i + i2);                   
	     System.out.printf("%.1f\n", d + d2);         
	     System.out.println(s + s2);                  

	        input.close();


	}

}
