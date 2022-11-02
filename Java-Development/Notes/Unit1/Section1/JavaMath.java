import java.lang.Math;
import java.util.Random;

public class JavaMath {
    public static void main(String[] args) {
        // // int/int -> into an int
        // System.out.println(18/5);
        // // double/int -> double
        // System.out.println(18.0/5);
        // System.out.println(18.0/5.0);

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Double.MAX_VALUE);
        // System.out.println(Long.MAX_VALUE);

        // // System.out.println("18"+5); no no
        // // System.out.println(" "*5);   no no
        // // System.out.println(2**2);   no no
        // System.out.println(Math.pow(18,5)); //Data type is double
        
        // /*
        //  * Double = decimal number, but...
        //  *      2 floats put together
        //  */

        // System.out.println(6*(2/1)/1);
        // System.out.println(6*(2/1.0)/1);

        // System.out.println(Math.pow(2,3)/(7/7/8));
        
        // System.out.println(255/256);
        
        // //  8/0
        // //  Infinity

        // //Reminder or modulo
        // System.out.println(255%256);

        // System.out.println(9/2);    //4.5 = 4
        // System.out.println(10/2);   //3.33333 = 3
        // System.out.println(19/10);  //1.9 = 1

        // //GOOD RULE OF THUMB: any calculation, include a double

        //Declare variables

        int age=17;
        //double age=17;

        //can't have 2 variables named the same

        double years = 12.5;    //Date type object - primitive
        Double year = 12.5;     //class type object - non-primitive

        Integer ages=17;

        //python increase by 1 use +=1
        //python increase by anynumber use +=anynumber

        age++;  //increase by one 
        age+=5; //Increase by 5

        age--;  //decrease by one
        age-=5; //decrease by 5

        age/=5.0;     //still integer
        age*=5;
        
        age^=5;     //bit calculation
        // System.out.println("age at the end: "+age);

        //Random Numbers!!! Yay!!!
        //Option 1 - Math module's randomness

            double randomness = Math.random();
            System.out.println(randomness);

            //random number between 0 and 10
            System.out.println(randomness*10);

            //random number between 0 and 10
            //cast the double to an int
            //casting randomness to an int and multiplying by 10
            System.out.println((int) (randomness*10));

            //random number between 42 and 56
            System.out.println((int)(randomness*(56-42))+42);

        //Option 2 - Random utility
        Random rand = new Random();

        int randomInt = rand.nextInt(10);
        System.out.println(randomInt);
        double randomDouble = rand.nextDouble();
        System.out.println(randomDouble);

    }    
}
