/**
 * 
 */
package a;

/**
 * @author bryan
 *
 */
// This class will manage the data coming from the store and from the user re: capacity (how many people in the store)
// We will not implement a direct download/uploading working feature in this app, but rather simulate the data.

public class StoreCapacity {
	// Bryan Miletta - Start
	// constructor for person objects
	// keeping track of each individual with an ID#
	// age is tracked so we can use it to display data across as a child, adult, or senior as it relates to COVID safety 
	//************************** Variables **************************
	private int id;		
	private int age;
	private StoreCapacity[] peopleArray;
	//************************** END Variables **************************	
		
	//************************** Constructor **************************
	/**
	 * Create a person
	 */
	public StoreCapacity(int i, int a) {
		id = i;
		age = a;
	}
	//************************** End Constructor **************************
	// Bryan Miletta - END		
			
	// TODO create data structure to hold person object
	
	// TODO create rules / triggers around specific capacity limits
	
	// TODO make sure this information can be integrated to the main UI

}
