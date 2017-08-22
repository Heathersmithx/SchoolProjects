/**************************************************************************************************
 * Heather M Smith
 * ParkingCharges.java
 * CSIS 1410
 * 5/20/2017
 * 
 * Purpose: Program that Calculates charges for each car parked in the garage, and displays a
 * running total at the end of the day along with how many cars parked that day.
 **************************************************************************************************/

import java.text.NumberFormat;
import java.util.Scanner;

public class ParkingChargesApp  
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		int carCount = 0;
		double currentCar;
		double dailyTotal = 0;
		double hours;
		String answer;
		Boolean stillOpen = true;
		
		do
		{
			carCount++;
			System.out.println("Enter the hours parked:\n");
		    hours = scan.nextDouble();
		    ParkingCharges car = new ParkingCharges(hours);
		    currentCar = car.calcParkingCharges();
		    dailyTotal = currentCar + dailyTotal;
		    
		    System.out.println("The time you Parked: " + (int)hours +  
		    "\nYour Total Cost: " + money.format(currentCar) + "\n");
		    System.out.println("The Daily Running Total:\n"
		    + money.format(dailyTotal) + "\n\n");
		    
		    System.out.println("Start New Car (y/n)?\n");
		    answer = scan.next();
		    
		    if (answer.equals("n"))
		     {
		    	stillOpen = false;
		    	break;
		     }
		   
		}while(stillOpen);
		 
		
		System.out.println("The Daily Totals are: " 
		+ money.format(dailyTotal) + "\nTotal Cars Parked: " 
		+ carCount);
		scan.close();
		
	}
	
}


