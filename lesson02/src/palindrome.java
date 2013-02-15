
public class palindrome {

	  public static boolean isPalindrome (String str) {

	        if (str == null || str.length () <= 1){
	            return true;
	        }

	        char first = str.charAt (0);
	        char last = str.charAt (str.length () - 1);
	        
	        if (first == last){
	            return isPalindrome(str.substring(1, str.length()-1));
	        }
	        
	        return false;
	    }
	    
		public static void main (String[] args) {

	        String str = "bob";
	        if (isPalindrome(str))
	            System.out.println ("Yes indeed it is");
	        else
	            System.out.println ("How about NO!");
	    }

}
