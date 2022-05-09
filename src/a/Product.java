/**
 * 
 */
package a;

/**
 * @author bryan
 *
 */
public class Product {

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
		public Product(String n, String t, double c) {
			String name = n;
			String type = t;
			double cost = c;
		}
		//************************** End Constructor **************************
		
	// Code to make new products - comments out for now
	Product apple = new Product("Apple", "Produce", 2.00);
	Product pear = new Product("Pear", "Produce", 1.00);
	Product banana = new Product("Banana", "Produce", 3.00);
	Product juice = new Product("Juice", "Produce", 1.50);
	Product watermellon = new Product("Watermellon", "Produce", 4.00);
	
		// Bryan Miletta - END
	
	
}
