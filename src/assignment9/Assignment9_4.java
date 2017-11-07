package assignment9; // package declaration is necessary

import java.util.*; // import util package

/*
 This program will help you to understand the concepts of collection framework.
 */
class Employee // Employee Class
{
	// Declare Variables
	String name;
	String designation;
	double salary;
	
	// Parameterized constructor for assigning values during object creation
	Employee(String name,String designation,double salary)
	{
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
}
class SalaryComp implements Comparator<Employee> // SalaryComp class implementing Comparator interface
{
	 
    @Override
    public int compare(Employee e1, Employee e2) // compare method to compare different attributes of objects
    {
    	int compareName=e1.name.compareTo(e2.name); // compare names
    	int compareDesignation=e1.designation.compareTo(e2.designation); // compare designation
    	
    	// logic for comparison of attributes
        if(e1.salary==e2.salary) 
        {
        	return((compareName == 0) ? compareDesignation : compareName);
        }
        else if(e1.salary>e2.salary)
        {
        	return 1;
        }
        else
        {
        	return -1;
        }
    }
}	


public class Assignment9_4 
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		
		TreeSet<Employee> trSet=new TreeSet<Employee>(new SalaryComp()); // creating TreeSet collection of type Employee
		
		// adding the elements to TreeSet
		trSet.add(new Employee("varun","SSE",40000));
		trSet.add(new Employee("madhav","SE",40000));
		trSet.add(new Employee("ajay","SE",10000));
		trSet.add(new Employee("sameer","Manager",800000));
		trSet.add(new Employee("sameer","SSE",800000));
		
		// printing the elements of TreeSet collection
		for (Employee emp : trSet)
		{
			System.out.println("Name="+emp.name+" Salary="+emp.salary+" Designation="+emp.designation);
		}
		
	
	}

}
