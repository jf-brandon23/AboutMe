import java.util.Scanner;
import java.lang.Math;
public class LoopityLoop {
    public static void main(String[] args) {
        //while conditional statemnet
        //while (boolean expression == true)
        //while(true){
        //    System.out.println("Hi");
        //}

        //print out the numbers 1 through 10
        // int i=0;
        // while(i<=100){
        //     System.out.println(i);
        //     i++;
        // }
        //while loops are recursive conditional statements
        //keeps happening UNTIL a condition is met
        // if(i==9){
        //     System.out.println(i);
        // }

        //print out the numbers 0 through 9
        // int i=0;
        // while(i<=9){
        //     if(i==9){
        //         System.out.print(i);
        //     }
        //     else {
        //         System.out.print(i+",");
        //     }
        //     i++;
            
        // }
        // System.out.println();

        //print 0-9
        //for (some var;boolean expression,step)
        // for(int j=0;j<=9;j++){
        //     if(j==9){
        //         System.out.print(j);
        //     }
        //     else {
        //         System.out.print(j+",");
        //     }
        // }
        //for i in range(#):
        //for item in list:

        //create a f(x) that takes in positive integers the user inputs until they type in -1
        //  after they type in -1, output the min and max value they entered
        minMaxChecker();
    }


    private static void minMaxChecker(){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Scanner ui = new Scanner(System.in);
        System.out.println("Give Number: ");
        //initalized conditional variable
        int number = ui.nextInt();
        while (number!=-1){
            if (number>max){
                max=number;
            }
            else if(number<min){
                min=number;
            }
            //step
            System.out.println("Give Number: ");
            number = ui.nextInt();
        }
        System.out.printf("min: %d, max: %d",min,max);
        ui.close();
    }

}