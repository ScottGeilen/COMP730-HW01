public class SumDigitsInString {
    public static void main(String[] args) {
        /*
         * Scan each character of a string and return the sum of all digits in the string.  
         * If there are no digits in the string, then the method returns  zero.  
         * Use Character.isDigit() to determine if a character is a digit. 
         * The main() method in HW1 will call this method twice.  
         * 
         * The first time the string will be "on3tw0thr33fourf1v3".  
         * You pick the second string.

*/
    	public int doWork(String theString) {
    		int sum = 0;
    		int error = 0;
    		String[] stringArray = {"on3tw0thr33fourf1v3", "s1xs3v3n31gh7n1n3t3n"};
    		for (int i=0; i<stringArray.length(); i++) {
    			if (i.isDigit() == true) {
    				sum = sum + i;
    			} else
    				return(error);
    		}
    		return(sum);
    	}
    }
}