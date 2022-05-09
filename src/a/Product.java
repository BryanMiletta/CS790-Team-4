/**
 * 
 */
package a;

import java.util.Stack;

/**
 * @author bryan
 *
 */
// This class is to support the store ordering features.
public class Product {

	// Bryan Miletta - Start
		//********************************** Bryan's Code **********************************
		//********************************** Constructors for products **********************************
		// This code layouts out an object constructor so that we can create a number of products for the app ordering feature.
		// Object constucted = Product
		// Fields: Name, Type, Cost
	//************************** Variables **************************
		private String name;
		private String type;
		private double cost;	
		private Product[] productArray;
	//************************** END Variables **************************	
	
	
	//************************** Constructor **************************
		/**
		 * Create a product
		 */
		public Product(String n, String t, double c) {
			name = n;
			type = t;
			cost = c;
		}
		//************************** End Constructor **************************
		
	// Code to make new products - comments out for now
	Product apple = new Product("Apple", "Produce", 2.00);
	Product pear = new Product("Pear", "Produce", 1.00);
	Product banana = new Product("Banana", "Produce", 3.00);
	Product juice = new Product("Juice", "Produce", 1.50);
	Product watermellon = new Product("Watermellon", "Produce", 4.00);
	// Bryan Miletta - END
	
	// TODO Create an array of products 
	
	// TODO make sure this information can be integrated to the main UI
	
	
}
