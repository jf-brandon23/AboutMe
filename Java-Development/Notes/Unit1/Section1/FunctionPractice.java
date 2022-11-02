import java.util.Scanner;
import java.lang.Math;  //Incase if need to use exponents

public class FunctionPractice {
    public static void main(String[] args) {
        //static method
        //Python ClassName.method()
        addTwoNumbers();
        addTwoNumbers(2,2);
        addTwoNumbers(1.25,1.5);

        //if print is static method
        //PrintFunctions.print("howdy");

        // PrintFunction pf = new PrintFunction();
        // pf.print("howdy");

        print("howdy");

        Scanner ui = new Scanner(System.in);
        String a = ui.nextLine();
        double b = ui.nextDouble();
        addTwoNumbers(b,a);
    }

    //@staticmethod
    //signature of the method
    //private => only this class can access
    //static => no need for an object of the class to be instantiated
    //void =>   means no return data
    private static void addTwoNumbers() {
        Scanner ui = new Scanner(System.in);
        System.out.println("Input a number");
        double num1 = ui.nextDouble();
        System.out.println("Input a number");
        double num2 = ui.nextDouble();
        //System.out.printf("%2.2f%n",(num1+num2));
        System.out.println(num1+num2);
    
        ui.close();
    }

    //def addTwoNumbers():
    private static void addTwoNumbers(double a, double b){
        //a and b are local variables
        System.out.println("%2.2f%n",a+b);
    }

    //def addTwoNumbers():
    private static void addTwoNumbers(int a, int b){
        //a and b are local variables
        System.out.println("%2.2f%n",a+b);
    }

    //you can have as many methods as you want
    //  as long as the signature is different

    public static void print(String s){
        System.out.println(s);

    }

    public static void print(int i){
        System.out.println(i);
        
    }

    public static void print(double d){
        System.out.println(d);
        
    }

    public static void print(boolean b){
        System.out.println(b);
        
    }

    /*      RULE OF THUMBS
     *      Who needs access to the method? public or private
     *      Do I need an object to use the method?
     *      Am I returning information?
     *      Will I have different data types?
     * 
     *      -methods are verbs therefore the name should be sometime of verb
     *          bob() -> bob is a noun and not a verb
     *      
     *      Bossman said so
     */

}
