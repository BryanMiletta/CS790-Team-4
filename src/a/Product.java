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
	// Bryan Miletta - END
	
	// TODO Create an array of products 
	
	// TODO make sure this information can be integrated to the main UI
	
	
}
