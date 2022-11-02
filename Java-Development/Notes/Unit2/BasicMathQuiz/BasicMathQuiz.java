import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class BasicMathQuiz{
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        Random rand = new Random();
        int points=0;
        //      (cast to int)(random decimal * 100) 0-100
        int num1 = (int)(Math.random()*100);
        int num2 = rand.nextInt(100)+1;    //0-100
        double answer=0.0;
        double input=0.0;

        //loop the program 10 times

        for (int i=0;i>=10;i++){
            //generate a math expression

        int signNumber = rand.nextInt(4);   //0-3
        if(signNumber==0){
        System.out.printf("What is %d / %d ",num1,num2);
        answer = (double)num1/num2;

        }
        else if(signNumber==1){
            System.out.printf("What is %d * %d ",num1,num2);
            answer = (double)num1*num2;
        }
        else if(signNumber==2){
            System.out.printf("What is %d + %d ",num1,num2);
            answer = (double)num1+num2;
        }
        else{
            System.out.printf("What is %d - %d ",num1,num2);
            answer = (double)num1-num2;
        }
        }
        input = ui.nextDouble();
        //check to see if the user answered the expression correctly
        if(input==answer){
            System.out.println("Great job! That's correct!");
        }
        else{
            System.out.printf("Ooo so close, the answer was %f",answer);    
        }

        //output their points
    }
}