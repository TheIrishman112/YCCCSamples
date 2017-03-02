package org.yccc.cis174.project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyApplicationWindow {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyApplicationWindow window = new MyApplicationWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyApplicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(textField.getText());
				textField.setText("");
			}
		});
		btnSubmit.setBounds(304, 166, 89, 84);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblInputSomething = new JLabel("Input something");
		lblInputSomething.setBounds(10, 24, 107, 14);
		frame.getContentPane().add(lblInputSomething);
		
		textField = new JTextField();
		textField.setBounds(109, 21, 304, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
