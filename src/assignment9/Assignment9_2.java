package assignment9; //Package Declaration is necessary
import java.util.HashSet; // Import HashSet class
/*
 This program will copy all the elements from set2 to set1 
 so that the set1 becomes the union of set1 and set2.
 */
public class Assignment9_2 
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		//Declare variables
		int i=0;
		HashSet<Integer> hs1=new HashSet<Integer>(); // Creating first HashSet of integers
		
		// loop to add elements to first HashSet
		while(i<10)
		{
			hs1.add(i);	
			i++;
		}
		System.out.println("HashSet1="+hs1); // printing elements of first HashSet
		
		HashSet<Integer> hs2=new HashSet<Integer>(); // Creating second HashSet of integers
		
		i=1; // reinitializing variable
		
		// loop to add elements to second HashSet
		while(i<20)
		{
			hs2.add(i);
			i=i+2;
		}
		
		System.out.println("HashSet2="+hs2); // printing elements of second HashSet
		
		hs1.addAll(hs2); // adding all the elements of HashSet2 to HashSet1
		
		System.out.println("Union of HashSet1 and HashSet2="+hs1); // printing the elements of HashSet1
		
	}

}
