// Created by Nicholas Marn, with help from Oracle Docs
// https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html
// Copyleft, all wrongs reserved. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class StoreManagerTool {
	public static void main (String [] args) {
		JFrame display = new JFrame ("Store Manager");
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//TODO: Fix framing such that Username and Password are on different lines, with input box
		JLabel StoreName = new JLabel ("Please Provide Credentials: \n Username: \n Password: \n");
		StoreName.setPreferredSize(new Dimension (400, 600));
		JMenuBar menubar = new JMenuBar();
		display.getContentPane().add(StoreName, BorderLayout.NORTH);
		JMenu menu1 = new JMenu ("User Mode");
		JMenu menu2 = new JMenu ("About");
		// TODO: When run, have system load in shopper mode, using
		// JMenu to switch to manager mode
		JMenuItem Shopper = new JMenuItem("Shopper");
		JMenuItem Manager = new JMenuItem("Manager");
		JMenuItem About = new JMenuItem("About");
		menubar.add(menu1);
		menubar.add(menu2);
		menu1.add(Shopper);
		menu1.add(Manager);
		menu2.add(About);
		
		display.setJMenuBar(menubar);
		display.pack();
		display.setVisible(true);
	}
}
