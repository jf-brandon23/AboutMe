import java.util.ArrayList;
import java.util.Scanner;

public class ALNotes {
    public static void main(String[] args){

        //ArrayList newList1= new ArrayList<>();
        //Class<DataType> objName = new Constructor<DataType>();
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        //add
        names.add("Adam");
        names.add("Caden");
        names.add("Nate");
        names.add("Landon");

        //insert
        names.set(2, "Rome");

        //remove
        names.remove("Caden");
        
        //size or length
        //System.out.println(names.size());

        //get
        //System.out.println(names.get(2));
        
        //CRUD - Create, Read, Update, Delete

        //System.out.println(names);
        //clear
        names.clear();
        //System.out.println(names);

        additionaCalculator();
    }
    
    public static void additionaCalculator(){
        Scanner ui = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();

        //take in input until they type 0 
        double newNumber=ui.nextDouble();
        while(newNumber!=0){
            numbers.add(newNumber);
            newNumber=ui.nextDouble();
        }

        //output the sum and numbers they entered
        double total=0.00;
        for(int i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
            total+=(numbers.get(i));
        }
        System.out.printf("Your total is: %f\n",total);
        ui.close();
    }
}
