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
public class SalesRep_Form extends JFrame {
	
	SalesRep_Class Sales = new SalesRep_Class();

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesRep_Form frame = new SalesRep_Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SalesRep_Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("First Name");
		label.setBounds(10, 16, 110, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Last Name");
		label_1.setBounds(10, 41, 110, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("PPS number");
		label_2.setBounds(10, 64, 110, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Date of Birth");
		label_3.setBounds(10, 96, 110, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Hourly Rate");
		label_4.setBounds(10, 121, 110, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Hours Worked");
		label_5.setBounds(10, 146, 110, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Sales");
		label_6.setBounds(10, 171, 110, 14);
		contentPane.add(label_6);
		
		textField = new JTextField();
		textField.setText("Martin");
		textField.setColumns(10);
		textField.setBounds(150, 11, 154, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Fennell");
		textField_1.setColumns(10);
		textField_1.setBounds(150, 36, 154, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("7959885G");
		textField_2.setColumns(10);
		textField_2.setBounds(150, 61, 154, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("13/12/1989");
		textField_3.setColumns(10);
		textField_3.setBounds(150, 90, 154, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("30000");
		textField_4.setColumns(10);
		textField_4.setBounds(150, 118, 154, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("5");
		textField_5.setColumns(10);
		textField_5.setBounds(150, 143, 154, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("2000");
		textField_6.setBounds(150, 168, 154, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton button = new JButton("Create Object");
		button.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) 
			{			
				Sales.setFname(textField.getText());
				Sales.setSname(textField_1.getText());
				Sales.setPPSno(textField_2.getText());
				Sales.setDOB(textField_3.getText());
				Sales.setRate(Double.parseDouble(textField_4.getText()));
				Sales.setHours(Double.parseDouble(textField_5.getText()));
				Sales.setCommission(Double.parseDouble(textField_6.getText()));
				
				JOptionPane.showMessageDialog(null, Sales.toString());
				
			}
		});
		button.setBounds(10, 202, 294, 23);
		contentPane.add(button);
		
		JButton button_2 = new JButton("Write to File");
		button_2.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent arg0) 
			{
					
					try
					{     
			            FileWriter outFile = new FileWriter("C:\\Users\\Martin\\Desktop\\Payroll\\Sales\\"
			            									+ Sales.getFname() + ".txt");
			            PrintWriter out = new PrintWriter(outFile);

			            // Write text to file		            
			            out.println("==========================================================");
			            out.println("| First Name: 	" 			+Sales.getFname());
			            out.println("| Surname: " 	 			+Sales.getSname());
			            out.println("| PPS Number: " 			+Sales.getPPSno());
			            out.println("| Date of Birth: " 		+Sales.getDOB());		            
			            out.println("| Hourly Rate: €" 			+Sales.getRate());
			            out.println("| Hours worked: " 			+Sales.getHours());
			            out.println("| Sales: €" 				+Sales.getCommission());
			            out.println("| Earnings: €" 			+Sales.getWages());
			            out.println("==========================================================");
			            
			            out.close();
					}
			        catch (IOException e)
			        {
			            e.printStackTrace();
			        }
				
				
			}
		});
		button_2.setBounds(10, 236, 294, 23);
		contentPane.add(button_2);
		
		JButton button_5 = new JButton("Logout");
		button_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) 
			{
				Main_Form frame1 = new Main_Form();
				frame1.setVisible(true);
				
				setVisible(false);
				dispose();
			}
		});
		button_5.setBounds(10, 270, 294, 23);
		contentPane.add(button_5);
	}
}
