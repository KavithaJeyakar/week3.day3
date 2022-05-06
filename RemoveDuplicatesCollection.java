package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollection {
	public static void main(String[] args) {
		
		String str = "We learn java basics as part of java sessions in java week1";
		String[] strSplit = str.split(" ");
		
		Set <String> obj = new LinkedHashSet<String>();
		
		for (String var : strSplit)
		{
			obj.add(var);
		}
		System.out.println(obj);
	}
} 
