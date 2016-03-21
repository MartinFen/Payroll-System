package softwareDev;

public class SalesRep_Class extends Employee {
//////variables///////////////////////////////////////////////////////////
	private double Rate, Hours, Wages, Commission, CommissionPercent , OverTimeHours, OT, Gross, Tax, Credit=68;
	
//////Constructors/////////////////////////////////////////////////////////////////////////////////////////
	//default constructor
	SalesRep_Class()
	{
		
	}
	
	//overload constructor using super to call info from super class
	SalesRep_Class(String F, String S, String P, String D)
	{
		super(F, S, P, D);	
	}
	
	SalesRep_Class(String F, String S, String P, String D, double R, double H, double W)
	{
		this(F,S,P,D);
		setRate(R);
		setHours(H);
		setWages(W);
	}
	
//////get and set rate/////////////////////////////////////////////////	
	public double getRate() {
		return Rate;
	}
	public void setRate(double rate) {
		Rate = rate;
	}
	
//////get and set hours///////////////////////////////////////////////	
	public double getHours() {
		return Hours;
	}
	public void setHours(double hours) {
		Hours = hours;
	}
	
//////get and set wages//////////////////////////////////////////////	
	public double getWages() 
	{
		if(getHours() >=41 )
		{
			OverTimeHours = getHours() - 40;			
			OT = OverTimeHours * (getRate()*1.5);
			Gross =  (getRate() * 40) + OT;
			Tax = Gross * 0.23;
			Wages = (Gross - Tax) + Credit ;
			
			if(getCommission() >=1000 && getCommission()<=5000)
			{
				CommissionPercent = getCommission() * 0.10;
				Wages = (Gross - Tax) + Credit + CommissionPercent;
			}
			
			else if(getCommission() >=5000)
			{
				CommissionPercent = getCommission() * 0.20;
				Wages = (Gross - Tax) + Credit + CommissionPercent;
			}
		}
		else if(getHours() <= 40)
		{
			Gross = getHours() * getRate();
			Tax = Gross * 0.23;
			Wages = (Gross - Tax) + Credit;
			
			if(getCommission() >=1000 && getCommission()<=1999)
			{
				CommissionPercent = getCommission() * 0.10;
				Wages = (Gross - Tax) + Credit + CommissionPercent;
			}
			
			else if(getCommission() >=2000)
			{
				CommissionPercent = getCommission() * 0.20;
				Wages = (Gross - Tax) + Credit + CommissionPercent;
			}
			
		}
		return Wages;
	}
	public void setWages(double wages) {
		Wages = wages;
	}
	
//////get and set commissions//////////////////////////////
	public double getCommission() {
		return Commission;
	}
	public void setCommission(double commission) {
		Commission = commission;
	}

//////tostring method//////////////////////////////////////
	public String toString() 
	{
		return ("First name: " + getFname() + 
				"\nSurname: " + getSname() + 
			  	"\nWeekly Earnings: €" + getWages() + 
			  	"\nSales: €" + getCommission());
	}
}
