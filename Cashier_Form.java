package softwareDev;

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

@SuppressWarnings("serial")
public class Cashier_Form extends JFrame {
	
//////Objects/////////////////////////////////////////////////////////////////////////////////	
	Cashier_Class Cashier = new Cashier_Class();
	
	//Polymorphic object
	Employee Cashier1 = new Cashier_Class();

	private JPanel contentPane;
	private JTextField textfield;
	private JTextField textfield2;
	private JTextField textfield3;
	private JTextField textfield4;
	private JTextField textfield5;
	private JTextField textfield6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Cashier_Form frame = new Cashier_Form();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cashier_Form() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 11, 123, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(10, 36, 123, 14);
		contentPane.add(lblSurname);
		
		JLabel lblPps = new JLabel("PPS");
		lblPps.setBounds(10, 61, 123, 14);
		contentPane.add(lblPps);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(10, 86, 123, 14);
		contentPane.add(lblDob);
		
		JLabel lblHourlyRate = new JLabel("Hourly Rate");
		lblHourlyRate.setBounds(10, 111, 123, 14);
		contentPane.add(lblHourlyRate);
		
		JLabel lblHoursWorked = new JLabel("Hours worked");
		lblHoursWorked.setBounds(10, 136, 123, 14);
		contentPane.add(lblHoursWorked);
		
		textfield = new JTextField();
		textfield.setText("Martin");
		textfield.setBounds(150, 8, 86, 20);
		contentPane.add(textfield);
		textfield.setColumns(10);
		
		textfield2 = new JTextField();
		textfield2.setText("Fennell");
		textfield2.setColumns(10);
		textfield2.setBounds(150, 33, 86, 20);
		contentPane.add(textfield2);
		
		textfield3 = new JTextField();
		textfield3.setText("7959885g");
		textfield3.setColumns(10);
		textfield3.setBounds(150, 58, 86, 20);
		contentPane.add(textfield3);
		
		textfield4 = new JTextField();
		textfield4.setText("13/12/1989");
		textfield4.setColumns(10);
		textfield4.setBounds(150, 83, 86, 20);
		contentPane.add(textfield4);
		
		textfield5 = new JTextField();
		textfield5.setText("8.65");
		textfield5.setColumns(10);
		textfield5.setBounds(150, 108, 86, 20);
		contentPane.add(textfield5);
		
		textfield6 = new JTextField();
		textfield6.setText("40");
		textfield6.setColumns(10);
		textfield6.setBounds(150, 133, 86, 20);
		contentPane.add(textfield6);
		
		JButton btnCreateObject = new JButton("Create Object");
		btnCreateObject.addActionListener(new ActionListener() 
		{	
			public void actionPerformed(ActionEvent arg0) 
			{
				Cashier.setFname(textfield.getText());
				Cashier.setSname(textfield2.getText());
				Cashier.setPPSno(textfield3.getText());
				Cashier.setDOB(textfield4.getText());
				Cashier.setHourlyRate(Double.parseDouble(textfield5.getText()));
				Cashier.setHoursWorked(Double.parseDouble(textfield6.getText()));
				Cashier.getTotalWages();
			}
		});
		btnCreateObject.setBounds(10, 161, 226, 23);
		contentPane.add(btnCreateObject);
		
		JButton btnNewButton = new JButton("Create File");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{     
		            FileWriter outFile = new FileWriter("C:\\Users\\Martin\\Desktop\\Payroll\\Cashier\\"
		            									+ Cashier.getFname() + ".txt");
		            PrintWriter out = new PrintWriter(outFile);

		            // Write text to file		            
		            out.println("==========================================================");
		            out.println("|First Name: " 			+Cashier.getFname());
		            out.println("|Surname: " 			+Cashier.getSname());
		            out.println("|PPS Number: " 			+Cashier.getPPSno());
		            out.println("|Date of Birth: " 		+Cashier.getDOB());		            
		            out.println("|Hourly Rate: €" 		+Cashier.getHourlyRate());
		            out.println("|Hours Worked: " 		+Cashier.getHoursWorked());
		            out.println("|Weekly Pay: €" 		+Cashier.getTotalWages());
		            out.println("==========================================================");

		            out.close();
				}
		        catch (IOException e)
		        {
		            e.printStackTrace();
		        }
			}
		});
		btnNewButton.setBounds(10, 228, 226, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Main_Form frame1 = new Main_Form();
				frame1.setVisible(true);
				
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 262, 226, 23);
		contentPane.add(btnNewButton_1);
		
		JButton PolymorphObj = new JButton("Polymorphisim Object");
		PolymorphObj.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) 
			{
				Cashier1.setFname(textfield.getText());
				Cashier1.setSname(textfield2.getText());
				Cashier1.setPPSno(textfield3.getText());
				Cashier1.setDOB(textfield4.getText());
				
				JOptionPane.showMessageDialog(null, Cashier1.toString());
			}
		});
		PolymorphObj.setBounds(10, 194, 226, 23);
		contentPane.add(PolymorphObj);
	}
}
