package java1;

import java.util.Scanner;
public class project1 {
// java program to convert minutes into number of years and days.
   public static void main(String[]args){
	   Scanner sc = new Scanner(System.in);
	   int min = sc.nextInt();
	   System.out.println("min: "+min);

	     // Number of minutes in a year
	   int year1 = min/ 525600;
	   float year2 = (float)min/525600;
	   int mult1=year1*365;
	   float mult2 = year2*365;
	   int sub = (int) (mult2-mult1);

	    System.out.println( min+ " min consist of "+year1+"  years and " +sub+ "  days.");
	    

	    }

   }
  
 
