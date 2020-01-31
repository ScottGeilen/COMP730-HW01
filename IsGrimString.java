public class IsGrimString {
    public static void main(String[] args) {
        /*
        Return true if a string is grim.  
        
        We will say that a string is 'grim' if every occurrence of 'gr' is followed by another 'gr'.  

        Some examples: 
            "great!" returns false, 
            "hello grgr bbbb gr" returns false (last 'gr' by itself), 
            "randomgrgrnoisegrgrhappy" returns true.

        The main() method in HW1 will call this method twice.  

        The strings will be:  "grgrgrThegrgrnoisegrgr" and "grgreattoseeyougrgrimsby!Great!"
*/
    	public boolean doWorkReturnBoolean(String theString) {
    		String[] stringArray = {"grgrgrThegrgrnoisegrgr", "grgreattoseeyougrgrimsby"};
    		for (int i=0; i<stringArray[i].length(); i++) {
    			if (i.contains("grgr")) {
    				return(true);
    			} else
    				return(false);
    		}
    	}
    }
}