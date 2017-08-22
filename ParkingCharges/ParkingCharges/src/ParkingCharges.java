/********************************************************
 *
 *  Project :  M1-A2: JUnit Lab
 *  File    :  ParkingCharges\src\ParkingCharges.java
 *  Name    :  Heather M Smith
 *  Date    :  05/20/2017
 *
 *  Description : This is the class used to create objects to calculate parking charges
 *  
 *    1) This code calculates and displays the parking charges;
 *
 *    2) I'm still trying to figure out data-structures
 *
 *    3) What algorithms, techniques, etc. are used in implementing the data structures.
 *    //Still trying to define and understand data-structures meaning
 ********************************************************/
public class ParkingCharges 
{

	private double timeParked, totalCost;
	private double minCharge = 2.00;
	private double maxCharge = 10.00;

	/****************************************************
	 * Method     : ParkingCharges
	 *
	 * Purpose    : The ParkingCharges Constructor constructs a new ParkingCharges object
	 * 				
	 *
	 * Parameters : time             - a double of the time parked
	 *
	 * Returns    : This constructor does not return a value.
	 *
	 ****************************************************/
	
	
	public ParkingCharges(double time)//calculates parking charges
	{
		timeParked = time;	
	}

	/****************************************************
	 * Method     : calcParkingCharges
	 *
	 * Purpose    : Calculates the total parking charges of the ParkingCharges object
	 * 				and returns the total cost
	 * 
	 * Parameters : none
	 *
	 * Returns    : The total cost of ParkingCharges object
	 *
	 ****************************************************/
	
	public double calcParkingCharges()//returns the total cost
	{
		if (timeParked <= 3.0)
		{
			totalCost = minCharge;
		}
		else if (timeParked > 3.00 && timeParked < 19.00)
		{
		    totalCost = ((timeParked - 3) * 0.50) + 2.00;
		}
		else
		{
		    totalCost = maxCharge;	
		}
		return totalCost;
	}
	
}

