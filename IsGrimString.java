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
    public boolean doWorkReturnBoolean(String arg) {
        String[] subStrings = arg.split("grgr");
        String checkMe = String.join("", subStrings);

        if (checkMe.contains("gr")) {
            return false;
        }
        return true;
    }
}