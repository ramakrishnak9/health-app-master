package org.health.app.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {
	public static void main(String[] args)
	{
        List<Integer> listIntegers=new ArrayList<>();
		listIntegers.add(55);
		listIntegers.add(65);
		listIntegers.add(78);
		System.out.println(listIntegers);
		ListIterator<Integer> listIterator = listIntegers.listIterator();
		while(listIterator.hasNext())
		{
		    Integer next = listIterator.next();
			System.out.println(next);
			if(next==65)
			listIterator.set(10);
			listIterator.add(98);
		}
		System.out.println("<================>");
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}
		System.out.println(listIntegers);

	}
}
