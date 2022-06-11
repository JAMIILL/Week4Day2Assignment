package Week4Day2Assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		
		String str = "babub";
		int length=str.length();
		System.out.println("length is "+length);
		char[] charArray = str.toCharArray();
		
	
		for(int i=0;i<length;i++) {
		System.out.println(charArray[i]); 
		}
		Set<Character> val=new HashSet<Character>();
		val.add('b');
		val.add('a');
		val.add('b');
		val.add('u');
		val.add('b');
		System.out.println(val);
		String[] split=str.split("b");
		System.out.println("length is " + split.length);
		

		  for (String string : split) {  
		    	 System.out.println(string);
				
			}

	   
	}	 
}
