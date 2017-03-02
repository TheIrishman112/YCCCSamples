package org.yccc.cis174.assignments.bots;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class App 
{
	JFrame frame;
	
	public static void main(String[] args)
	{
		App app = new App();
		app.open();
	}
	
	public void open()
	{
		frame = new JFrame("Smart Bot");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Bot bot = new Bot();
		
		frame.getContentPane().add(BorderLayout.CENTER, bot);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(300, 300);
		frame.setLocation(375, 375);
		
		bot.moveIt();	
	}

}
