package softwareDev;



public class Manager_Class extends Employee implements ManagerBonus {
	
	//
    
	private double AnnualSalary, Experience, Tax, ExpWage, TotalWages, Bonus;
	

	//default constructor
	Manager_Class()
	{}
	
	Manager_Class(String F, String S, String P, String D)
	{
		super(F, S, P, D);	
	}
	
	Manager_Class(String F, String S, String P, String D, double Annual, double Exp, double Sal)
	{
		this(F,S,P,D);
		setAnnualSalary(Annual);
		setExperience(Exp);
		setSalary(Sal);
	}
	
	

	//Getter Methods////////////////////////////////////////////////// 
    //getAnnualSalary method
    public double getAnnualSalary()
    {
    	return AnnualSalary;
    }
    //getExperience method
    public double getExperience()
    {
    	return Experience;
    } 
    //getSalary method
    public double getSalary()
    {
    	if(getExperience() < 1)
    	{
    		Tax = getAnnualSalary() * 0.23;
    		TotalWages = (getAnnualSalary() - Tax) + getBonus();
    		
    		if(getAnnualSalary()>37000)
    		{
    			Tax = getAnnualSalary() * 0.42;
        		TotalWages = (getAnnualSalary() - Tax) + getBonus();
    		}
    	}
    	
    	else if(getExperience() >=1 && getExperience() <= 5)
    	{
    		Tax = getAnnualSalary() * 0.23;
    		ExpWage = getAnnualSalary() * 0.10;
    		TotalWages = (getAnnualSalary() - Tax + ExpWage) + getBonus();
    		
    		if(getAnnualSalary() >=37000)
    		{
    			Tax = getAnnualSalary() * 0.42;
        		TotalWages = (getAnnualSalary() - Tax) + getBonus();
    		}
    	}
    	
    	else if(getExperience() >=6 && getExperience() <= 10)
    	{
    		Tax = getAnnualSalary() * 0.23;
    		ExpWage = getAnnualSalary() * 0.15;
    		TotalWages = (getAnnualSalary() - Tax + ExpWage) + getBonus();
    		
    		if(getAnnualSalary() >=37000)
    		{
    			Tax = getAnnualSalary() * 0.42;
        		TotalWages = (getAnnualSalary() - Tax) + getBonus();
    		}
    	}
    	
    	else if(getExperience() >=10)
    	{
    		Tax = getAnnualSalary() * 0.23;
    		ExpWage = getAnnualSalary() * 0.10;
    		TotalWages = (getAnnualSalary() - Tax + ExpWage) + getBonus();
    		
    		
    		if(getAnnualSalary() >=37000)
    		{
    			Tax = getAnnualSalary() * 0.42;
        		TotalWages = (getAnnualSalary() - Tax) + getBonus();
    		}
    	}
    	else if(getExperience() >= 65)
    	{
    		
    	}
    		return TotalWages;
    }
    
    public double getBonus()
	{
		Bonus = 2000;
		return Bonus;	
	}
    
    //Setter methods//////////////////////////////////////////////////
    //setAnnualSalary method
    public void setAnnualSalary(double value)
    {
    	this.AnnualSalary = value;
    }
    // setExperience method
    public void setExperience(double value)
    {
    	this.Experience = value;
    }
    
    public void setSalary(double value)
    {
    	this.TotalWages = value;
    }
    
    public void setBonus(double value)
	{
		this.Bonus = value;	
	
	}

    //Equals Method
    //used to compare two objects
    public boolean equals(Manager_Class obj) 
    {		
		if (obj.AnnualSalary == AnnualSalary) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
    }
    
    public String toString() 
    {
		return ("Manager first name: " + getFname() + 
				"\nManager Surname: " + getSname() + 
			  	"\nYearly Gross Salary: " + AnnualSalary + 
			  	"\nYears of Experience: " + Experience + 
			  	"\nYearly Net Salary: " + TotalWages +
				"\nManagers Bonus: " + Bonus);
    }
    
    public void display()
    {
    	System.out.println("Test"+TotalWages);
    }
    
    
    
    //Main Method
    public static void main(String[] args) 
    {
    
    	
    	
	}
}
