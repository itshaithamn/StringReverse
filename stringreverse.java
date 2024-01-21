public class stringreverse {
    public static void main(String[] args) {
        String user_in = System.console().readLine("Enter any words: "); //util.Scanner did not work, so I used Bard and found this alt.
        char[] chararray = user_in.toCharArray(); //toCharArray(); is a function that converts strings into a character array
        int l = chararray.length; //Measures array for number of characters not indices

        //This is a normal array travesal except it outputs words in reverse order
        System.out.println("The word(s) in reverse are: ");
        for(int i = l - 1 ; i < l; i--){ //Length - 1 gives index, length alone just gives the amount of chars in chararray
            if(i>-1){ //Makes sure that the array indices end at 0, outside of the 0 to length bound there is an error
                System.out.print(chararray[i]);//Prints reversal
            }   
        }
    }
}
