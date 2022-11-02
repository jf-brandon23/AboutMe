import java.util.Scanner;
import java.lang.Math;//Import math for use of exponents

//Sites/Videos used to learn
//https://www.techwalla.com/articles/how-to-do-exponents-in-java
//https://www.youtube.com/watch?v=NBIUbTddde4&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1
public class HelloHW {

    static void convertMileToKM(){
        //Mile conversion to Kilometers
        Scanner ui = new Scanner(System.in); /*Lets the system take input */
        System.out.println("Input Miles");
        /*Scanner tells java scanner will be used. */
        int miles= ui.nextInt();//Ui takes in userinput
        /*As int can only use integers without decimals
        must convert new variable into double(for deci) to use/take deci */
        double kilometers=  (double) miles * 1.6;
        System.out.println(miles+" miles is "+kilometers+" Kilometers");

        //Break for the next problem
        System.out.println("");
    }

    static void calculateEnergy(){
        Scanner ui = new Scanner(System.in); /*Lets the system take input */
        //Energy needed to heat amount of water from initial temp to final temp
        System.out.println("Enter the amount of water in Kilograms ");
        double amountWater= ui.nextDouble();//If the var is double then ui, input must also be double.
        System.out.println("Enter the initial Temperature of the water in Celsius ");
        double initialTemp= ui.nextDouble();//If the var is double then ui, input must also be double.
        System.out.println("Enter the final Temperature of the water in Celsius ");
        double finalTemp= ui.nextDouble();//If the var is double then ui, input must also be double.

        double energyCalc = (double) (amountWater*(finalTemp-initialTemp))*4184;
        System.out.println("Energy needed to heat water: "+energyCalc);

        //Break for next problem
        System.out.println("");
    }

    static void futureInvestments(){
        Scanner ui = new Scanner(System.in); /*Lets the system take input */
        //Investment program to take in investment, annual interest rate, and years to calc future investment/

        System.out.println("Enter investment amount: ");
        double investmentAmount= ui.nextDouble();//If the var is double then ui, input must also be double.

        System.out.println("Enter annual interest rate in percentage: ");
        double annualInterest= ui.nextDouble();//If the var is double then ui, input must also be double.
        System.out.println("Enter number of years: ");
        double numYears= ui.nextDouble();//If the var is double then ui, input must also be double.

        double monthlyInterest= (double) ((annualInterest/100)/12);

        double futureValue= (double) (investmentAmount*(Math.pow((1+monthlyInterest),(Math.pow(numYears,12)))));
        //When attempting to use Math.pow make sure spelling of "Math" is equivlent to import Math speling.
        System.out.println("Future value is $"+futureValue);

        //Break for next problem
        System.out.println("");
    }

    static void drivingCost(){
        Scanner ui = new Scanner(System.in); /*Lets the system take input */
        //Driving Costs, user inputs distance to drive, fuel efficiency miles per gallon, and price per gallon.

        System.out.println("Enter the driving distance in miles: ");
        double driveDistance= ui.nextDouble();//If the var is double then ui, input must also be double.
        System.out.println("Enter how many miles per gallon: ");
        double milesGallon= ui.nextDouble();//If the var is double then ui, input must also be double.
        System.out.println("Enter the price per gallon: ");
        double priceGallon= ui.nextDouble();//If the var is double then ui, input must also be double.

        double drivetotalCalc = (double) priceGallon*(driveDistance/milesGallon);
        System.out.println("The cost of driving is: "+drivetotalCalc);
    }


    public static void main(String[] args){
        
        // //Mile conversion to Kilometers
        // Scanner ui = new Scanner(System.in); /*Lets the system take input */
        // System.out.println("Input Miles");
        // /*Scanner tells java scanner will be used. */
        // int miles= ui.nextInt();//Ui takes in userinput
        // /*As int can only use integers without decimals
        // must convert new variable into double(for deci) to use/take deci */
        // double kilometers=  (double) miles * 1.6;
        // System.out.println(miles+" miles is "+kilometers+" Kilometers");

        // //Break for the next problem
        // System.out.println("");
        // //Energy needed to heat amount of water from initial temp to final temp
        // System.out.println("Enter the amount of water in Kilograms ");
        // double amountWater= ui.nextDouble();//If the var is double then ui, input must also be double.
        // System.out.println("Enter the initial Temperature of the water in Celsius ");
        // double initialTemp= ui.nextDouble();//If the var is double then ui, input must also be double.
        // System.out.println("Enter the final Temperature of the water in Celsius ");
        // double finalTemp= ui.nextDouble();//If the var is double then ui, input must also be double.

        // double energyCalc = (double) (amountWater*(finalTemp-initialTemp))*4184;
        // System.out.println("Energy needed to heat water: "+energyCalc);

        // //Break for next problem
        // System.out.println("");
        // //Investment program to take in investment, annual interest rate, and years to calc future investment/

        // System.out.println("Enter investment amount: ");
        // double investmentAmount= ui.nextDouble();//If the var is double then ui, input must also be double.

        // System.out.println("Enter annual interest rate in percentage: ");
        // double annualInterest= ui.nextDouble();//If the var is double then ui, input must also be double.
        // System.out.println("Enter number of years: ");
        // double numYears= ui.nextDouble();//If the var is double then ui, input must also be double.

        // double monthlyInterest= (double) ((annualInterest/100)/12);

        // double futureValue= (double) (investmentAmount*(Math.pow((1+monthlyInterest),(Math.pow(numYears,12)))));
        // //When attempting to use Math.pow make sure spelling of "Math" is equivlent to import Math speling.
        // System.out.println("Future value is $"+futureValue);

        // //Break for next problem
        // System.out.println("");
        // //Driving Costs, user inputs distance to drive, fuel efficiency miles per gallon, and price per gallon.

        // System.out.println("Enter the driving distance in miles: ");
        // double driveDistance= ui.nextDouble();//If the var is double then ui, input must also be double.
        // System.out.println("Enter how many miles per gallon: ");
        // double milesGallon= ui.nextDouble();//If the var is double then ui, input must also be double.
        // System.out.println("Enter the price per gallon: ");
        // double priceGallon= ui.nextDouble();//If the var is double then ui, input must also be double.

        // double drivetotalCalc = (double) priceGallon*(driveDistance/milesGallon);
        // System.out.println("The cost of driving is: "+drivetotalCalc);

        convertMileToKM();
        calculateEnergy();
        futureInvestments();
        drivingCost();

    }
}