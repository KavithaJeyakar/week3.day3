package week3.day2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
public static void main(String[] args) {
	
//	int[] data = {3,2,11,4,6,7};
	
	Set<Integer> set1 = new TreeSet<Integer>();
	
	set1.add(3);
	set1.add(2);
	set1.add(11);
	set1.add(4);
	set1.add(6);
	set1.add(7);
	
	List<Integer> list = new ArrayList<Integer>(set1);
	
	System.out.println("Data in the list :" + set1);
	int size = set1.size();
	
	System.out.println(list.get(size-2));

} 
	
}

