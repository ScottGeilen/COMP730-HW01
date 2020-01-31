public class CountVowels {
    public static void main(String[] args) {
        /*
        This method returns the number of vowels in a string.
        Vowels are the letters a,e,i,o,u.  
        If there are no vowels, return 0.
        The main method from the HW1 class will call this method twice.
        Call the doWork() method with these strings:  "Try fly by near Rye" and "Vowels for pirates: A, E, I, O, U and sometimes Arrrr!"
        */
    	public int doWork(String inputString) {
            string line;
            int vowels;
            vowels = 0;
            String[] stringArray = {"Try fly by near Rye", "Vowels for pirates: A, E, I, O, U and sometimes Arrrr!"};
            for (int i = 0; i < stringArray[i].length(); ++i) {
                if(stringArray[i]=='a' || 
                    stringArray[i]=='e' || 
                    stringArray[i]=='i' || 
                    stringArray[i]=='o' || 
                    stringArray[i]=='u' ||
                    stringArray[i]=='A' ||
                    stringArray[i]=='E' || 
                    stringArray[i]=='I' || 
                    stringArray[i]=='O' || 
                    stringArray[i]=='U') {
                    ++vowels;
                }
            }
            if(vowels == 1) {
                return(vowels);
            }
            else {
                return(0)
            }

        }
    }
}