package softwareDev;

public class Cashier_Class extends Employee {

//////Variables////////////////////////////////////////////////////////////////////////////////////////////	
	
	private double HourlyRate, HoursWorked, OverTimeHours, Gross, OT, Tax, TotalWages, Credit = 68;

//////Constructors/////////////////////////////////////////////////////////////////////////////////////////
	
	//default constructor
	Cashier_Class()
	{}
	//overload constructor using super to call info from super class
	Cashier_Class(String F, String S, String P, String D)
	{
		super(F, S, P, D);	
	}
	//
	Cashier_Class(String F, String S, String P, String D, double Rate, double Hours, double Wages)
	{
		this(F,S,P,D);
		setHourlyRate(Rate);
		setHoursWorked(Hours);
		setTotalWages(Wages);
	}
//////Methods////////////////////////////////////////////////////////////////////////////////////////////////
	
//////Getters////////////////////////////////////////////////////////////////////////////////////////////////
	public double getHourlyRate() 
	{
	return HourlyRate;
	}
	
	public double getHoursWorked() 
	{
	return HoursWorked;
	}

	public double getTotalWages() 
	{
		if(getHoursWorked() >= 41)
		{
			OverTimeHours = getHoursWorked() - 40;			
			OT = OverTimeHours * (getHourlyRate()*1.5);
			Gross =  (getHourlyRate() * 40) + OT;
			Tax = Gross * 0.23;
			TotalWages = (Gross - Tax) + Credit ;
			
		}
		else if(getHoursWorked() <= 40)
		{
			Gross = getHoursWorked() * getHourlyRate();
			Tax = Gross * 0.23;
			TotalWages = (Gross - Tax) + Credit;
			
		}
		return TotalWages;
	}

//////Setters///////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void setHourlyRate(double hourlyRate) 
	{
		HourlyRate = hourlyRate;
	}

	public void setHoursWorked(double hoursWorked) 
	{
		HoursWorked = hoursWorked;
	}
	
	public void setTotalWages(double totalwages) 
	{
		TotalWages = totalwages;
	}
	
	//toString Method for cashier class
	public String toString()
	{
		return ( "First name: " + getFname() + 
				"\nSurname: " + getSname() );
    }
	
	
}
