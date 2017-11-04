package assignment9; //Package Declaration is necessary
import java.util.HashMap; // Import HashMap class
import java.util.Iterator; // Import Iterator class
/*
 This program will help you understand the concepts of HashMap.
 */
public class Assignment9_1 
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>(); // Creating generic HashMap of Integer,String key-value pair
		
		// Inserting the values to HashMap
		hm.put(1, "Madhav");
		hm.put(2,"Varun");
		
		System.out.println(hm); // printing the HashMap collection
		
		Iterator<Integer> KeySetIterator=hm.keySet().iterator(); // Iterator to loop through HashMap
		
		// condition till map has keys
		while(KeySetIterator.hasNext())
		{
			System.out.println("Welcome "+hm.get(KeySetIterator.next())); // printing welcome message
		}
		
		
	}
}
