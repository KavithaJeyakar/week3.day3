package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,4,7,6,8};
		int i;
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.addAll(Arrays.asList(arr));
		
		Collections.sort(list);
		
		System.out.println("After Sorting : " +list);
		
		for(i=list.get(0);i<=list.size();i++)
		{
			if(i!=list.get(i-1))
			{
				System.out.println("Missing element : " + i); 
				break;
				
			}
		}
		
	} 
	
}
