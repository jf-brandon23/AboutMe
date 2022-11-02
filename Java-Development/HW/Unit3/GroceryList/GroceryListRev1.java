import java.util.Scanner;
public class GroceryListRev1 {
    public static void main(String[] args) {
        //Build a grocery list
        Scanner ui = new Scanner(System.in);
        System.out.println("How many items?");
        int howmany = ui.nextInt();

        // String[] groceryList = {}; no no, the length of 0
        //define an empty array, need to define the length
        
        GroceryItem[] groceryList = new GroceryItem[howmany];

        for(int i=0;i<groceryList.length;i++){
            System.out.println("Name:");
            String name=ui.next();
            //why use next?... Google it. If you want to learn more

            System.out.println("Cost:");
            double cost=ui.nextDouble();
        
            groceryList[i]=new GroceryItem(name, cost);
        }
        printArray(groceryList);
    }
    private static void printArray(String[] arr){
        //length is an attribute
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static void printArray(GroceryItem[] arr){
        //length is an attribute
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static void printHorizontalArray(String[] arr){
        //length is an attribute
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }   
}