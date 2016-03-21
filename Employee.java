package softwareDev;


 public abstract class Employee {

//////Variables///////////////////////////////////////////////////////////////////////////////////	 
	 
	//declaring private variables for use in this class only
	private String Fname, Sname, PPSno, DOB;
	
//////Constructors////////////////////////////////////////////////////////////////////////////////
	
	//default constructor
	Employee()
	{}
	
	//Overload Constructor
	Employee(String F, String S, String P, String D)
	{
		setFname(F);
		setSname(S);
		setPPSno(P);
		setDOB(D);
	}
	
//////Getters and Seterers//////////////////////////////////////////////////////////////////////
	
	//first name get and set
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}

	//get and set methods for Surname
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}

	//get and set methods for PPS number
	public String getPPSno() {
		return PPSno;
	}
	public void setPPSno(String pPSno) {
		PPSno = pPSno;
	}

	//get and set methods for DOB
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String date) {
		DOB = date;
	}
	
//////Abstract Methods/////////////////////////////////////////////////////////////////////////////	
	
	//abstract method for get string declared
	public abstract String toString();
	
    

}
