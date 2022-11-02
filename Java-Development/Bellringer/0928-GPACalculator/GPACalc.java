import java.util.Scanner;

public class GPACalc {
    public static void main(String[] args) {
        
        gpaCalculator();
        
        
    }
    
    
    private static void gpaCalculator(){
        Scanner ui = new Scanner(System.in);
        System.out.println("Input 5 Grades(1-4): ");
        double[] grades = new double[5];
        for(int i=0;i<5;i++){
            double grade = ui.nextDouble();
            grades[i]=grade;
        }
        
        double sum=0.0;
        for(int i=0;i<5;i++){
            sum+=grades[i];
        }
        System.out.printf("\n%f",(sum/5));
        

        printArray(grades);
    }

    private static void printArray(int[] arr) {
        //length is an attribute
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
