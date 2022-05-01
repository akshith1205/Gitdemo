package j1;

public class Test1 {

	public static void main (String[] args)
	{      String name="Akshith";
		System.out.println("Hi");
		String s1="Akshith Shetty";
		s1=s1.toUpperCase();
		int count=0;
		String s2="";
		s1=s1.replace(" ","");
		for (int i = 0; i < s1.length();i++) 
		{	
			char cha = s1.charAt(i);
			{  // System.out.println(s2);
				//System.out.println(s1.charAt(i));
				boolean flag=false;
		    	{
		    		String abc=Character.toString(s1.charAt(i));
		    		if((s2.contains(abc)))
		    				{
		    			//System.out.println(s1.charAt(i));
		    			//System.out.println(s2);
		    		flag = true;
		    				}
		    	//	System.out.println(flag);
		    		if(flag==false)
		    		{
		    			
		    	
		    		   s2=s2+cha;
		    	
				    for (int j = 0; j < s1.length();j++)	
					if(s1.charAt(j)==cha)
					{
						count++;
					}
					System.out.println(cha+"contains" +count +"times");	
				
					count=0;
		    		}
		    	}
			}
		}
		System.out.println(s2);
	}
}
