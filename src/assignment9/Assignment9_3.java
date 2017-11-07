package assignment9; //Package Declaration is necessary
import java.util.*; // import util package

/*
 This program will help you understand the concepts of Collections & Comparator.
 */
class Hdtv 
{
	// Declare variables
	String brandName;
	double size;
	
	// creating parameterized constructor of class Hdtv
	Hdtv(String brandName,double size)
	{
		this.brandName=brandName;
		this.size=size;
	}
}

class Sorting implements Comparator<Hdtv> // class for Sorting Hdtv objects as per the size
{
	// implementing compare method
	public int compare(Hdtv a,Hdtv b)
	{
		// condition to check the size
		if(a.size>b.size)
			return 1;
		else
			return -1;
	}
}

public class Assignment9_3 
{
	
	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		
		
		ArrayList<Hdtv> arrList=new ArrayList<Hdtv>(); // creating ArrayList of type Hdtv class
		
		// creating objects of Hdtv class
		Hdtv obj1=new Hdtv("SAMSUNG",21.5);
		Hdtv obj2=new Hdtv("LG",40);
		Hdtv obj3=new Hdtv("SONY",28);
		
		// adding the elements to ArrayList
		arrList.add(obj1);
		arrList.add(obj2);
		arrList.add(obj3);
		
		// loop to print elements of ArrayList
		for (Hdtv hdtv : arrList) 
		{
			System.out.println(hdtv.brandName+" "+hdtv.size);
		}
		
		Collections.sort(arrList,new Sorting()); // Sorting the ArrayList
		
		System.out.println("Displaying HDTV objects in sorted order of size:");
		
		// loop to print elements of ArrayList after sorting
		for (Hdtv hdtv : arrList) 
		{
			System.out.println(hdtv.brandName+" "+hdtv.size);
		}
	}

}
