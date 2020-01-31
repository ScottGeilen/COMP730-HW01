public class IsGrimString {
    /*
    Return true if a string is grim.  
    We will say that a string is 'grim' if every occurrence of 'gr' is followed by another 'gr'.  
    Some examples: 
        "great!" returns false, 
        "hello grgr bbbb gr" returns false (last 'gr' by itself), 
        "randomgrgrnoisegrgrhappy" returns true.
    The main() method in HW1 will call this method twice.  
    */
    public boolean doWorkReturnBoolean(String theString) {
        searchKey = "gr"
        zoomedSearchKey = "grgr"
        String lowerCaseString = theString.toLowerCase();
        if (lowerCaseString.contains(searchKey)) {
            if (lowerCaseString.contains(zoomedSearchKey)) {
                return true
            } else {
                return false
            }
        }
    }
}