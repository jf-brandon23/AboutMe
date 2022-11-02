/* 
    Comment block
    CSS also uses this
*/
//Comments

/*Main Class that you are running
    public = public so the JVM can access the file
    class= define that the following code is in a class
    ClassName = MUST FOLLOW: FIrst letter capitalized
                        AND     Same name as the file name
                        AND     Numbers are the end of the file 
 */
public class HelloWorld {
    //If this is where the program starts, you need the following method
    public static void main(String[] args){
        System.out.println("Hello World");       //Automatically gives a \n at the end
            //; is the period  of programming
            //; is the end of the statement
        System.out.print("Howdy");      // DOES NOT Automatically gives a \n at the end
        System.out.println("Mason");

        //Fancy formatting
        System.out.println(12345.6789);    //
        System.out.printf("%2.2f%n",12345.6789);    //2 values and 2 decimals
        System.out.printf("%5.2f%n",12345.6789);    //5 values and 2 decimals
        System.out.printf("%10.2f%n",12345.6789);    //10 values and 2 decimals
    
    }
}

/*
 * Delete entrie line > shift+del
 * Delete entirer word -> ctrl+del
 * Highlight word -> ctrl+shift+arrowkey
 * Reformat -> ctrl+a then ctrl+k then ctrl+f
 * Delete entire file... del system 32
 */



/*
    def functionName():
        do something
        return something
 */