
public class ParkingCharges {

	private double timeParked, totalCost;
	private double minCharge = 2.00;
	private double maxCharge = 10.00;
	
	
	//constructor
	public ParkingCharges(double time)//calculates parking charges
	{
		timeParked = time;
		
		if (timeParked <= 3.0)
		{
			totalCost = minCharge;
		}
		else if (timeParked > 3.0 && timeParked < 24.00)
		{
		    totalCost = 2.00 + ((timeParked - 3) * 0.5);
		}
		else
		{
		    totalCost = maxCharge;	
		}
		
	}
	{
	}
	
	//Methods
	

	public double getTimeParked()//returns the time parked
	{
		return timeParked;
	}
	
	

	public double getTotalCost()//returns the total cost
	{
		return totalCost;
	}
	
}
