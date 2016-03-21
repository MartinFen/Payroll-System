package softwareDev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Main_Form extends JFrame {

	private JPanel contentPane;

//////Main Method//////////////////////////////////////////////////
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Main_Form frame1 = new Main_Form();
					frame1.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

//////Create the Frame////////////////////////////////////////////////	
	public Main_Form() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnManager = new JButton("Manager");
		btnManager.addActionListener(new ActionListener() 
		{
//////Action performed Event handler////////////////////////////////////
			public void actionPerformed(ActionEvent e) 
			{	
				Manager_Form Frame2 = new Manager_Form();
				Frame2.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnManager.setBounds(10, 11, 200, 30);
		contentPane.add(btnManager);
		
		JButton btnSalesRep = new JButton("Sales Rep");
		btnSalesRep.addActionListener(new ActionListener() 
		{	
			public void actionPerformed(ActionEvent arg0) 
			{
//////Action performed Event handler////////////////////////////////////
				SalesRep_Form Frame3 = new SalesRep_Form();
				Frame3.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnSalesRep.setBounds(10, 52, 200, 30);
		contentPane.add(btnSalesRep);
		
		JButton btnCashier = new JButton("Cashier");
		btnCashier.addActionListener(new ActionListener() 
		{
//////Action performed Event handler////////////////////////////////////
			public void actionPerformed(ActionEvent arg0) 
			{
				Cashier_Form Frame4 = new Cashier_Form();
				Frame4.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnCashier.setBounds(10, 93, 200, 30);
		contentPane.add(btnCashier);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Login Frame0 = new Login();
				Frame0.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		btnLogout.setBounds(10, 134, 200, 30);
		contentPane.add(btnLogout);
	}
}
