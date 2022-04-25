package j1;

public class Test4 {
	public static void main(String[] args) {
		String  str= "geeksforgeeks";
		int n = str.length();
		 int SIZE = 26;
		
		int[] freq = new int[SIZE];
		 
        for (int i = 0; i < n; i++)
        	
            freq[str.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++) {
        	 
            // if frequency of character str.charAt(i)
            // is not equal to 0
            if (freq[str.charAt(i) - 'a'] != 0) {
 
                // print the character along with its
                // frequency
                System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i) - 'a'] + " ");
 
                // update frequency of str.charAt(i) to
                // 0 so that the same character is not
                // printed again
                freq[str.charAt(i) - 'a'] = 0;
            }
				
        }
	}
	
}
