package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersectCollection 
{
	
	public static void main(String[] args) 
	{
		
	int[] arrset1 = {3,2,11,4,6,7};
	int[] arrset2 = {1,2,8,4,9,7};
	
	
	Set <Integer> set1 = new LinkedHashSet<Integer>();
	Set <Integer> set2 = new LinkedHashSet<Integer>();
	
	
	for (Integer var1: arrset1)
	{
		set1.add(var1);
	
		for (Integer var2: arrset2)
		{
			set2.add(var2);
	
			if (var1.equals(var2))
			{
				System.out.println(var1);
			}
		}
	} 
	}
}
	


	
	