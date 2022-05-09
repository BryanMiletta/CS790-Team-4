/**
 * 
 */
package a;

/**
 * @author bryan
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO main driver.
		
		// TODO drive the core UI and pull from StoreManagerToll menus
		
		// Bryan Miletta
		// Simulation data
		// Products
		Product apple = new Product("Apple", "Produce", 2.00);
		Product pear = new Product("Pear", "Produce", 1.00);
		Product banana = new Product("Banana", "Produce", 3.00);
		Product juice = new Product("Juice", "Produce", 1.50);
		Product watermellon = new Product("Watermellon", "Produce", 4.00);
		// People
		StoreCapacity person1 = new StoreCapacity(1, 50);
		StoreCapacity person2 = new StoreCapacity(2, 90);
		StoreCapacity person3 = new StoreCapacity(3, 5);
		StoreCapacity person4 = new StoreCapacity(4, 23);
		StoreCapacity person5 = new StoreCapacity(5, 30);
		// Bryan Miletta - END

	}

}
