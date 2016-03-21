package softwareDev;

//////Imports/////////////////////////////////////
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class Login extends JFrame {

//////Variables///////////////////////////////////
	private JPanel contentPane;
	private JTextField txtUser, txtPassword;

//////Main Method/////////////////////////////////
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
//////Run Method from the Runnable Class/////////
			public void run() 
			{
				try 
				{
					Login frame0 = new Login();
					frame0.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

//////Create the Frame Login//////////////////////	 
//////Create the objects (GUI obj)///////////////
	public Login() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 235, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtUser = new JTextField();
		txtUser.setBounds(114, 8, 89, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setText("gmit");
		txtPassword.setBounds(114, 39, 89, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);

		JButton Login = new JButton("Login");
		Login.addActionListener(new ActionListener() 
		{
//////Action Performed Method/Event handler////////////////////////
//////An action is performed when the Login button is pushed//////
			public void actionPerformed(ActionEvent e) 
			{
				String username = (txtUser.getText());
				String password = (txtPassword.getText());

				if (username.equals("user") && password.equals("gmit")) 
				{
					Main_Form Frame1 = new Main_Form();
					Frame1.setVisible(true);

					setVisible(false);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Incorrect login details please try again.");
				}
			}
		});
		Login.setBounds(10, 67, 193, 23);
		contentPane.add(Login);

		JButton Close = new JButton("Close");
		Close.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				dispose();
			}
		});
		Close.setBounds(10, 101, 193, 23);
		contentPane.add(Close);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 11, 94, 14);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 42, 94, 14);
		contentPane.add(lblPassword);
	}
}
