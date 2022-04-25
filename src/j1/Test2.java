package j1;

public class Test2 {

	public static void main (String[] args)
	{
		System.out.println("Hi");
		String s1="Akshith Shetty";
	int	n1=s1.length();
	
		int []freq1 = new int[26];
		
		int i, count = 0;
		 
	    // Update the frequencies of
	    // the characters of string s1
	    for (i = 0; i < n1; i++)
	        freq1[s1.charAt(i) - 'a']++;
	  System.out.println(s1.charAt(i) +count);
	 
	}
	
}
