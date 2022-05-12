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
	private static final Action action = new SwingAction();
	//********************************** END ariables **********************************
	
	//********************************** MAIN **********************************
	public static void main (String [] args) {
		//********************************** Title **********************************
		JFrame display = new JFrame ("Store Manager");
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setPreferredSize(new Dimension (400,600));
		display.setVisible(true);
		
		
		
		JMenuBar menubar = new JMenuBar();
		//TODO: I imagine this will grow significantly, here's what will be needed
		//1. Conditional Branching based on whether when enter is hit, to go in as a shopper
		//2a. if in manager, check if credentials are valid
		//2b. If shopper, we can do this one of two ways, just a
		
		
		
		//********************************** TOP Sub menus **********************************
		JMenu menu1 = new JMenu ("User Mode");
		JMenu menu2 = new JMenu ("About");
		
		// TODO: When run, have system load in shopper mode, using
		
		
		//********************************** END sub menus **********************************
		
		//********************************** Login Flow **********************************
		JPanel login = new JPanel();
		//TODO: Fix framing such that Username and Password are on different lines, with input box
		login.setPreferredSize(new Dimension (400, 600));
		login.setVisible(true);
		JMenuItem About = new JMenuItem("About");
		About.setAction(action);
		About.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame about = new JFrame ("about");
				about.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				about.setPreferredSize(new Dimension (100,100));
				about.setVisible(true);
				about.pack();
				about.setVisible(true);
				
			}
		});
		JMenuItem Help = new JMenuItem("Help");
		// Login flow
		JLabel credentials = new JLabel ("Please Provide Credentials: ");
		
		menubar.add(menu1);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Shopper");
		menu1.add(chckbxmntmNewCheckItem);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("Manager");
		menu1.add(chckbxmntmNewCheckItem_1);
		menubar.add(menu2);
		menu2.add(About);
		menu2.add(Help);
		login.add(credentials, credentials, 0);
		//login.add(credentials);
		
		
		display.setJMenuBar(menubar);
		display.setContentPane(login);
		display.pack();
		display.setVisible(true);
				
		//********************************** Driving Code for Shopper **********************************
		// TODO need to add ActionListener to see if Shopper was selected on login.  If YES switch to this panel and flow
		// TODO add content to drive menus for shopper.  To include:
		JPanel capacity = new JPanel();
		//TODO: Fix framing such that Username and Password are on different lines, with input box
		login.setPreferredSize(new Dimension (400, 600));
		
		JLabel lblNewLabel = new JLabel("Welcome to the Store Manager Tool");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		login.add(lblNewLabel);
		login.setVisible(true);
		// TODO displace the number of people in the store
		// Capacity flow
		JLabel capacityText = new JLabel ("Currently the store is occupied by the following number of people: ");
		JLabel capacityCurrent = new JLabel ("100");
		JLabel capacityMax = new JLabel ("200");
		
		// TODO add button to go to product list which includes option to add to cart		
		// TODO need to add ActionListener to see if product button was selected on login.  If YES switch to this panel and flow
		// TODO See product list
		JLabel productList = new JLabel ("Currently the store has the following products avaiable for online ordering and pickup: ");
		// TODO need to add ActionListener with button for add to cart
		// TODO create an array to store add to cart items
		
		
		// TODO add product list to shopping cart
		JPanel shopPanel = new JPanel();
		JButton shopButton = new JButton("Add to Shopping Cart");
		
		// TODO Order
		JPanel orderPanel = new JPanel();
		JButton orderButton = new JButton("Order");
		
		
		//********************************** END Driving Code for Shopper **********************************
		
		
		
		
		//********************************** Driving Code for Manager **********************************
		// TODO need to add ActionListener to see if Manager was selected on login.  If YES switch to this panel and flow
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
	private static class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "About");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			JFrame about = new JFrame ("about");
			about.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			about.setPreferredSize(new Dimension (300,200));
			JLabel aboutus = new JLabel ("The following is a Java Application created by Nicholas Marn, Bryan Miletta, Santhoshini Arkatala "
					+ "and Kishan Raj VG for CS790");
			about.getContentPane().add(aboutus);
			about.pack();
			about.setVisible(true);
			
		}
	}
}
//********************************** END StoreManagerClass **********************************
//********************************** END StoreManagerClass **********************************