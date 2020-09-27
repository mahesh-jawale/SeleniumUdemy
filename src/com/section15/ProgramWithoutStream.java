package com.section15;

import java.util.ArrayList;

public class ProgramWithoutStream {

	//Count the number of names starting with alphabet A in the list
	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Seema");
		names.add("ankita");
		names.add("Vidya");
		names.add("Savita");
		names.add("Manisha");
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			if(names.get(i).startsWith("a"))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
