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
	public int storeCapacity = 200; // This is to be able to be amended by the Manager NJM 5/12/2022
	private static final Action action = new SwingAction(); //DO NOT TOUCH ME, I create additional JFrames NJM 5/12
	private static JTextField textField; // This is going 
	private static JTextField textField_1;
	private static final ButtonGroup Usermode = new ButtonGroup();
	//********************************** END ariables **********************************
	
	//********************************** MAIN **********************************
	public static void main (String [] args) {
		//********************************** Title **********************************
		JFrame display = new JFrame ("Store Manager");
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setPreferredSize(new Dimension (400,600));
		display.setVisible(true);
		
		
		
		JMenuBar menubar = new JMenuBar();
		
		
		
		
		//********************************** TOP Sub menus **********************************
		JMenu menu1 = new JMenu ("User Mode");
		JMenu menu2 = new JMenu ("About");
		
		
		
		//********************************** END sub menus **********************************
		
		//********************************** Login Flow **********************************
		JPanel login = new JPanel();
		//Fix framing such that Username and Password are on different lines, with input box
		//Completed by NJM 5/12/2022
		login.setPreferredSize(new Dimension (300, 500));
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
		
		
		menubar.add(menu1);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("Shopper");
		rdbtnmntmNewRadioItem.setSelected(true);
		Usermode.add(rdbtnmntmNewRadioItem);
		menu1.add(rdbtnmntmNewRadioItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("Manager");
		Usermode.add(rdbtnmntmNewRadioItem_1);
		menu1.add(rdbtnmntmNewRadioItem_1);
		menubar.add(menu2);
		menu2.add(About);
		
		//login.add(credentials);
		
		
		display.setJMenuBar(menubar);
		display.setContentPane(login);
		display.pack();
		display.setVisible(true);
		
		
		
		JPanel capacity = new JPanel();
		login.setPreferredSize(new Dimension (400, 600));
		GridBagLayout gbl_login = new GridBagLayout();
		gbl_login.columnWidths = new int[]{76, 242, 0, 0};
		gbl_login.rowHeights = new int[]{37, 0, 0, 80, 0, 0};
		gbl_login.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_login.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		login.setLayout(gbl_login);
		
		JLabel lblNewLabel = new JLabel("Welcome to the Store Manager Tool");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		login.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		login.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		login.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		login.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		login.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 4;
		login.add(btnNewButton, gbc_btnNewButton);
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
			putValue(SHORT_DESCRIPTION, "About the authors");
		}
		public void actionPerformed(ActionEvent e) {
			JFrame about = new JFrame ("about");
			about.setPreferredSize(new Dimension (300,200));
			JLabel aboutus = new JLabel ("The following is a Java Application created by:  Nicholas Marn, Bryan Miletta, Santhoshini Arkatala & Kishan Raj VG");
			about.getContentPane().add(aboutus);
			about.pack();
			about.setVisible(true);
			
		}
	}
}
//********************************** Driving Code for Shopper **********************************
		// TODO need to add ActionListener to see if Shopper was selected on login.  If YES switch to this panel and flow
		// TODO add content to drive menus for shopper.  To include:


//********************************** Driving Code for Shopper **********************************
		// TODO need to add ActionListener to see if Shopper was selected on login.  If YES switch to this panel and flow
		// TODO add content to drive menus for shopper.  To include:
//********************************** END StoreManagerClass **********************************