// Created by Nicholas Marn, with help from Oracle Docs
// Comment sections / code organization created by Bryan Miletta
// https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html
// Copyleft, all wrongs reserved. 
// Team 4 - Store Manager Tool

//********************************** Import Libraries **********************************
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

import javax.swing.*;
//********************************** END Import Libraries **********************************


//********************************** StoreManagerTool Class **********************************
public class StoreManagerTool {
	//Fixed 3/12/2022: Added story capacity to be more in line with original 
	// Prototype with strings instead of an actual GUI
	//********************************** Variables **********************************
	public int storeCapacity = 200;
	//********************************** END ariables **********************************
	
	//********************************** MAIN **********************************
	public static void main (String [] args) {
		//********************************** Title **********************************
		JFrame display = new JFrame ("Store Manager");
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//********************************** Login Flow **********************************
		//TODO: Fix framing such that Username and Password are on different lines, with input box
		JLabel StoreName = new JLabel ("Please Provide Credentials: \n Username: \n Password: \n");
		StoreName.setPreferredSize(new Dimension (400, 600));
		JMenuBar menubar = new JMenuBar();
		display.getContentPane().add(StoreName, BorderLayout.NORTH);
		
		//********************************** Sub menus **********************************
		JMenu menu1 = new JMenu ("User Mode");
		JMenu menu2 = new JMenu ("About");
		
		// TODO: When run, have system load in shopper mode, using
		
		// JMenu to switch to manager mode
		JMenuItem Shopper = new JMenuItem("Shopper");
		JMenuItem Manager = new JMenuItem("Manager");
		JMenuItem About = new JMenuItem("About");
		JMenuItem Help = new JMenuItem("Help");
		menubar.add(menu1);
		menubar.add(menu2);
		menu1.add(Shopper);
		menu1.add(Manager);
		menu2.add(About);
		menu2.add(Help);
		
		display.setJMenuBar(menubar);
		display.pack();
		display.setVisible(true);
	}
	//********************************** END MAIN **********************************
	
	// Bryan Miletta - Start
	//********************************** Bryan's Code **********************************
	//********************************** Constructors for products **********************************
	// This code layouts out an object constructor so that we can create a number of products for the app ordering feature.
	// Object constucted = Product
	// Fields: Name, Type, Cost
	//************************** Constructor **************************
		/**
		 * Create a product
		 */
	// TODO We need to make a new class Product for this content.
	// TODO change the name of method to Product after new class is created.
		public StoreManagerTool(String n, String t, double c) {
			name = n;
			type = t;
			cost = c;
		}
		//************************** End Constructor **************************
		// TODO Example 
		// Code to make new products - comments out for now
		// StoreManagerTool apple = new StroeMangerTool("Apple", "Produce", 2.00);
	// Bryan Miletta - END
	
	
		
		
}
//********************************** END StoreManagerClass **********************************
