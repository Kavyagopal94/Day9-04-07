package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(116,"WSC",15000.00,"CDR");
		
		ArrayList<Employee> l1 = new  ArrayList<Employee>();
		
		l1.add(new Employee(111,"Ram",35000.00,"ASE"));
		l1.add(new Employee(112,"Raj",45000.00,"SDET"));
		l1.add(new Employee(113,"Veena",40000.00,"SDET"));
		l1.add(new Employee(114,"Reena",30000.00,"ASE"));
		l1.add(new Employee(115,"XYZ",29000.00,"ABC"));
		l1.add(e1);
		
		for(Employee e : l1)
		{
			System.out.println(e);
		}
		System.out.println();
		
		l1.remove(4);
		
		for(Employee e : l1)
		{
			System.out.println(e);
		}
		System.out.println();
		
		System.out.println("GET METHOD "+l1.get(3));
		for(Employee e : l1)
		{
			System.out.println(e);
		}
		
		l1.set(2, new Employee(112,"Roy",50000.00,"SDE"));
		
		for(Employee e : l1)
		{
			System.out.println(e);
		}
		
		System.out.println("SUBLIST METHOD: "+l1.subList(1, 2));
		System.out.println();
		
		//System.out.println("List ITERATOR METHOD: "+ l1.listIterator());
		ListIterator<Employee> iterator = l1.listIterator(2);
		while (iterator.hasNext())  
		{  
		    Employee e = iterator.next();  
		    System.out.println(e);  
		} 
		
		System.out.println();
		
        while(iterator.hasPrevious())
        {
        	Employee e = iterator.previous();
        	System.out.println(e);
        }
		
		System.out.println("IndexOf Method: "+ l1.indexOf(e1));
		
		System.out.println("LastIndexOf Method: "+ l1.lastIndexOf(e1));
		
	}
}
