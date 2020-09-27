package com.section15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramWithStreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> names=new ArrayList<String>();
//		names.add("Seema");
//		names.add("ankita");
//		names.add("Vidya");
//		names.add("Savita");
//		names.add("Manisha");
//		//there is no life for intermediate operation if there is no terminal operation (count)
//		//terminal operation executes only if intermediate operation(Filter) returns true
//		//names.stream() converts arraylist names into stream
//		//argument to intermediate operation is lamda expression
//		//Long c is used because count() has return type as long
//		
//		long c=names.stream().filter(s->s.startsWith("a")).count();
//		System.out.println(c);
//		System.out.println("---------------------------------------------------");
//		//Instead of writing arraylist names and adding names in it we can write stream.of() function as follows 
//		
//		long d=Stream.of("Seema","ankita","Vidya","Savita","Manisha").filter(s->
//		{
//			s.startsWith("a");
//			return false;
//		}).count();
//		
//		System.out.println(d);
//		System.out.println("---------------------------------------------------");
//		
//		//Print all the names in the arraylist having lenghth>4
//		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
//		System.out.println("---------------------------------------------------");
//		
//		//Print only one name from the arraylist having lenghth>4
//		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
//		System.out.println("---------------------------------------------------");
//		
//		//Print names which have last letter as 'a' with uppercase using map function
//		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//		System.out.println("---------------------------------------------------");
//		
//		//Print names which have first letter as 's' with uppercase and sorted using sorted terminal function
//		//here we are converting array into arraylist
//		List<String> list=Arrays.asList("Seema","ankita","Vidya","Savita","Manisha");
//		list.stream().filter(s->s.startsWith("S")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
//		System.out.println("---------------------------------------------------");
//		
//		//Merging two diffrent streams and print in sorted order
//		Stream<String> mergedList=Stream.concat(names.stream(),list.stream());
//		mergedList.sorted().forEach(s->System.out.println(s));
//		System.out.println("---------------------------------------------------");
//		
//		//To check whether given string is present in the list if present return true otherwise false
//		//We cannot use filter method because it returns subset based on some condition and we want
//		//result either true or false so anyMatch is used
//		boolean flag=names.stream().anyMatch(s->s.equalsIgnoreCase("Ankita"));
//		System.out.println(flag);
		
		//Print name which is ending with 'a' and having index 0 in Uppercase
		List<String> ls=Stream.of("Sushmita","Sunaina","Nandini","Shanu","Tanu").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(1));
		
		//Print unique number from array
		//Sort the array and print number at 3rd index
		List<String> 
		
	}
	
	

}
