package j1;

import java.util.HashMap;

public class Test3 {
	public static void main (String[] args)
	{	
	System.out.println("Hi");
	String s1="Akshith Shetty";
	s1=s1.toUpperCase();
	s1=s1.trim();
	s1=s1.replace(" ","");
	HashMap <Character, Integer> hash = new HashMap();
for (int i=s1.length()-1;i>=0;i--) 
	{	
		 
		 if(hash.containsKey(s1.charAt(i)))
				{
		 int count = hash.get(s1.charAt(i));
			
		 hash.put(s1.charAt(i), ++count);
				}
		else {
			hash.put(s1.charAt(i), 1);
		}
		
		
	}
System.out.println(hash);
	}
	
}
