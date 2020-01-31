public class CountVowels {
    /*
    This method returns the number of vowels in a string.
    Vowels are the letters a,e,i,o,u.  
    If there are no vowels, return 0.
    The main method from the HW1 class will call this method twice.
    Call the doWork() method with these strings:  "Try fly by near Rye" and "Vowels for pirates: A, E, I, O, U and sometimes Arrrr!"
    */
    public int doWork(String inputString) {
        string lowerCaseString;
        lowerCaseString = inputString.toLowerCase();
        int vowels = 0;
        for (int i=0; i<lowerCaseString.length(); ++i) {
            if(lowerCaseString.contains("a") || 
                lowerCaseString.contains("e") || 
                lowerCaseString.contains("i") || 
                lowerCaseString.contains("o") || 
                lowerCaseString.contains("u")) {
                vowels += 1;
            }
        }
        return vowels;
    }
}