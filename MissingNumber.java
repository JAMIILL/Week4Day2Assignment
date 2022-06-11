package Week4Day2Assignments;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.util.SystemOutLogger;


	public class MissingNumber{
	

	public static void main(String[] args) {
		
		// First we have to make an ascending order by using Set(TREESET)
		Set<Integer> unique = new TreeSet<Integer>();
		int [] num = {4,6,7,2,3,1,9,10,8,8,6};//here we dont have a seperate value like unique.add(4),,,,,so we have to use for and add the values in it 
		
		for (int i : num) {
			unique.add(i);
			
		}
		System.out.println(unique);
		
        
		List<Integer> number = new ArrayList<Integer>(unique);//here we put a set in list's constructor bcus to convert set into list bcus set doesn't has get method 
		int length = number.size();
		System.out.println("length is" + length);
		
		for(int i=0;i<number.size();i++) {
			
			System.out.println("get i+1 is " + number.get(i+1));
			
	    if(number.get(i)+1!=number.get(i+1)) { 
	    	System.out.println("MissingNumber is ");
	    	System.out.println(number.get(i)+1);
	    	break;
	
	    }}
}}
