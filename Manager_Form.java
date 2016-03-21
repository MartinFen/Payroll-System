package softwareDev;

//theses are inputs
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//this code stops yellow underline warning for unused code 
@SuppressWarnings({ "serial", "unused" })

public class Manager_Form extends JFrame  {
	
	//create two an objects called Manager and Manager1
	Manager_Class Manager= new Manager_Class();
	Manager_Class Manager1= new Manager_Class();
	

	//Private Variables for the text field buttons
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	
	
	
	/**
	 * Create the frame.
	 */
	//Creates the JFrame
	public Manager_Form() 
	{
		//Creates the JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Creates a Jlabel called First Name
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 11, 110, 14);
		contentPane.add(lblFirstName);
		
		//Creates a Jlabel called Last Name
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 36, 110, 14);
		contentPane.add(lblLastName);
		
		//Creates a Jlabel called PPS number
		JLabel lblPpsNumber = new JLabel("PPS number");
		lblPpsNumber.setBounds(10, 61, 110, 14);
		contentPane.add(lblPpsNumber);
		
		//Creates a Jlabel called Date of Birth
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(10, 93, 110, 14);
		contentPane.add(lblDateOfBirth);
		
		//Creates a Jlabel called Hourly Rate
		JLabel lblYearlyRate = new JLabel("Yearly Rate");
		lblYearlyRate.setBounds(10, 118, 110, 14);
		contentPane.add(lblYearlyRate);
		
		//Creates a Jlabel called Experience
		JLabel lblExperience = new JLabel("Experience");
		lblExperience.setBounds(10, 143, 110, 14);
		contentPane.add(lblExperience);
		
		//Creates a Jtextfield called textField
		textField = new JTextField();
		textField.setText("Martin");
		textField.setBounds(150, 8, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//Creates a Jtextfield called textField_1
		textField_1 = new JTextField();
		textField_1.setText("Fennell");
		textField_1.setBounds(150, 33, 132, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		//Creates a Jtextfield called textField_2
		textField_2 = new JTextField();
		textField_2.setText("7959885G");
		textField_2.setBounds(150, 58, 132, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		//Creates a Jtextfield called textField_3
		textField_3 = new JTextField();
		textField_3.setText("13/12/1989");
		textField_3.setBounds(150, 90, 132, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		//Creates a Jtextfield called textField_4 
		textField_4 = new JTextField();
		textField_4.setText("30000");
		textField_4.setBounds(150, 115, 132, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		//Creates a Jtextfield called textField_5
		textField_5 = new JTextField();
		textField_5.setText("5");
		textField_5.setBounds(150, 140, 132, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		//Creates a Jbutton called Create object
		JButton btnCreateObject = new JButton("Create Object");
		btnCreateObject.addActionListener(new ActionListener() {
				
			//action performed method
			//when the button is pressed it performs the the action that it is coded to do
			//the textfield values are set to a Manager object 
			public void actionPerformed(ActionEvent arg0) 
			{
				Manager.setFname(textField.getText());
				Manager.setSname(textField_1.getText());
				Manager.setPPSno(textField_2.getText());
				Manager.setDOB(textField_3.getText());
				Manager.setAnnualSalary(Double.parseDouble(textField_4.getText()));
				Manager.setExperience(Double.parseDouble(textField_5.getText()));
				Manager.getBonus();
				Manager.getSalary();
				
			}
		
		});
		btnCreateObject.setBounds(10, 168, 130, 23);
		contentPane.add(btnCreateObject);
		
		//Creates a Jbutton called Write to file
		JButton btnWriteToFile = new JButton("Write to File");
		btnWriteToFile.addActionListener(new ActionListener() 
		{
			//action performed event on button
			//the code used gets the values in the jtextfields and
			public void actionPerformed(ActionEvent arg0) 
			{
				
				try
				{     
		            FileWriter outFile = new FileWriter("C:\\Users\\Martin\\Desktop\\Payroll\\Manager\\"
		            									+ Manager.getFname() + ".txt");
		            PrintWriter out = new PrintWriter(outFile);

		            // Write text to file		            
		            out.println("==========================================================");
		            out.println("| First Name: " 			+Manager.getFname());
		            out.println("| Surname: " 	 			+Manager.getSname());
		            out.println("| PPS Number: " 			+Manager.getPPSno());
		            out.println("| Date of Birth: " 		+Manager.getDOB());		            
		            out.println("| Annual Salary: €" 		+Manager.getAnnualSalary());
		            out.println("| Years of Experience: " 	+Manager.getExperience());
		            out.println("| Yearly Salary: €" 		+Manager.getSalary());
		            out.println("| Monthly Bonus: €" 		+Manager.getBonus());
		            out.println("==========================================================");
		            
		            out.close();
				}
		        catch (IOException e)
		        {
		            e.printStackTrace();
		        }
			}
		});
		btnWriteToFile.setBounds(10, 242, 130, 23);
		contentPane.add(btnWriteToFile);
		
		
		//Creates a Jbutton called logout
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Main_Form frame1 = new Main_Form();
				frame1.setVisible(true);
				
				setVisible(false);
				dispose();
			}
		});
		btnLogout.setBounds(152, 242, 130, 23);
		contentPane.add(btnLogout);
		
		JButton btnDisplayObject = new JButton("Display object");
		btnDisplayObject.addActionListener(new ActionListener() 
		{			
			public void actionPerformed(ActionEvent arg0) 
			{
				JOptionPane.showMessageDialog(null, Manager.toString());
			}
		});
		btnDisplayObject.setBounds(150, 168, 132, 23);
		contentPane.add(btnDisplayObject);
		
		JButton btnCompareObjects = new JButton("Compare Objects");
		btnCompareObjects.addActionListener(new ActionListener() 
		{			
			public void actionPerformed(ActionEvent arg0) 
			{	
				JOptionPane.showMessageDialog(null,(Manager.equals(Manager1)));
			}
		});
		btnCompareObjects.setBounds(150, 202, 132, 23);
		contentPane.add(btnCompareObjects);
		
		JButton btnCreatObject = new JButton("Create Object 2");
		btnCreatObject.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) 
			{
				Manager1.setFname(textField.getText());
				Manager1.setSname(textField_1.getText());
				Manager1.setPPSno(textField_2.getText());
				Manager1.setDOB(textField_3.getText());
				Manager1.setAnnualSalary(Double.parseDouble(textField_4.getText()));
				Manager1.setExperience(Double.parseDouble(textField_5.getText()));	
			}
		});
		btnCreatObject.setBounds(10, 202, 130, 23);
		contentPane.add(btnCreatObject);
	}
	
	/**
	 * Launch the application.
	 */
	//Main Method
	public static void main(String[] args) 
	{
		
		//event	
		java.awt.EventQueue.invokeLater(new Runnable() 
        {
            //run class
			//create the manager form to be visible
            public void run() 
            {
                new Manager_Form().setVisible(true);
            }
        });
	
	
	}
 
}

