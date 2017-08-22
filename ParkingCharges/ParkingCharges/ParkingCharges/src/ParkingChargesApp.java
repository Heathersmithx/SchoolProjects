/*
 * Heather M Smith
 * Parking Charges
 * CSIS 1410
 * 5/20/2017
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class ParkingChargesApp  {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		String answer = "y";
		ParkingCharges car = new ParkingCharges();
	
		
		while (answer != "n")
		{
			System.out.println("Start New Car (y/n)?");
		    answer = scan.nextLine();
		    if (answer == "n")
		    {
		    	break;
		    }
			
			System.out.println("Enter the time parked:");
		    double time = scan.nextDouble();
		    car.setTimeParked(time);
		    car.calcParkingCharges();
		    System.out.println("The time you Parked: " + car.getTimeParked() 
		    + "\nTotal Cost: " + money.format(car.getTotalCost()) + "\n");
		    
	     }

	}
}
