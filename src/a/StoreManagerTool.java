/**
 * 
 */
package a;

//Created by Nicholas Marn, with help from Oracle Docs
//Comment sections / code organization created by Bryan Miletta
//https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html
//Copyleft, all wrongs reserved. 
//Team 4 - Store Manager Tool

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
		
		//TODO: I imagine this will grow significantly, here's what will be needed
		//1. Conditional Branching based on whether when enter is hit, to go in as a shopper
		//2a. if in manager, check if credentials are valid
		//2b. If shopper, we can do this one of two ways, just a
		JPanel authenticateenter = new JPanel();
		JButton authenticatebutton = new JButton("Enter");
		authenticatebutton.setSize(100,100);
		authenticatebutton.setVisible(true);
		
		
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
		display.add(authenticateenter);
		display.add(authenticatebutton);
		
		display.setJMenuBar(menubar);
		display.pack();
		display.setVisible(true);
		//********************************** END sub menus **********************************
		
		
		//********************************** Driving Code for Shopper **********************************
		// TODO add content to drive menus for shopper.  To include:
		// TODO displace the number of people in the store
		// TODO See product list
		// TODO add product list to shopping cart
		// TODO Order
		
		
		
		//********************************** END Driving Code for Shopper **********************************
		
		
		
		
		//********************************** Driving Code for Manager **********************************
		// TODO add content to drive menus for shopper.  To include:
		// TODO displace the number of people in the store
		// TODO See product list

		
		//********************************** END Driving Code for Manager **********************************
		
	}
	//********************************** END MAIN **********************************
	//********************************* START POP-UP MENU ITEM *******************************
	class Popup extends JFrame implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	//********************************* END POP-UP *******************************
	//	// TODO make sure this information can be integrated to the main UI
	
	// TODO sync Products class information with these menus
	
	// TODO sync StoreCapacity with these menus
		
}
//********************************** END StoreManagerClass **********************************
//********************************** END StoreManagerClass **********************************
