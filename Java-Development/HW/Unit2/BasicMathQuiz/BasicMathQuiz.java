import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

//Resources
// https://www.baeldung.com/java-round-decimal-number
// https://xperti.io/blogs/formatting-with-printf-in-java/

public class BasicMathQuiz{
    public static void main(String[] args){
        // Check list for programs needs.
        // CHECK Create a program that challenges the user to basic 4 operator expressions where the numbers are between 0 and 100.  
        // CHECK Give the user feedback on if they got the question correct, and if not, let them know what the answer was.
        // CHECK After the program ends, tell them how many questions were correct to how many questions they had.
        // CHECK The program needs to loop until the user can keep an 80% accuracy for at least 10 questions.  Don't need Lists.
        // Submit the Java file and a video of the program running.
        Scanner ui = new Scanner(System.in);
        Random rand = new Random();
        int points=0;
        int questions = 0;
        // boolean passed=FALSE possible unintentional boolean

        while (points<8){
            for (int i=0;i<=10-1;i++){
                //      (cast to int)(random decimal * 100) 0-100
                int num1 = (int)(Math.random()*100);
                int num2 = rand.nextInt(100)+1;    //0-100
                double answer=0.0;
                double input=0.0;



                //loop the program 10 times

                //generate a math expression

                int signNumber = rand.nextInt(4);   //0-3
                if(signNumber==0){
                    System.out.printf("What is %d / %d? ",num1,num2);
                    answer = (double)num1/num2;
                }
                else if(signNumber==1){
                    System.out.printf("What is %d * %d? ",num1,num2);
                    answer = (double)num1*num2;
                }
                else if(signNumber==2){
                    System.out.printf("What is %d + %d? ",num1,num2);
                    answer = (double)num1+num2;
                }
                else{
                    System.out.printf("What is %d - %d? ",num1,num2);
                    answer = (double)num1-num2;
                }

                input = ui.nextDouble();
                //check to see if the user answered the expression correctly
                if(input==answer){
                    System.out.println("Great job! That's correct!");
                    points++;
                }
                else{
                    System.out.printf("Ooo so close, the answer was %.2f%n ",answer);    
                }
                //System.out.println(points);

                // if (points>=0){
                // System.out.printf(points+" Out of 10 Correct.");
                // } else {
                //     System.out.println("It worked");
            }
        System.out.printf(points+" Out of 10 Correct.%n");
        if (points<8){
            System.out.println("Did not pass, sad, AGAIN!");    //this is emtional damage.
        }
        }
        System.out.printf("You passed");
        //output their points
    }
}