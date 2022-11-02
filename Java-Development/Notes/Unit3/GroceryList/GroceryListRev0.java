import java.util.Scanner;
public class GroceryListRev0 {
    public static void main(String[] args) {
        //Build a grocery list
        Scanner ui = new Scanner(System.in);
        System.out.println("How many items?");
        int howmany = ui.nextInt();

        // String[] groceryList = {}; no no, the length of 0
        //define an empty array, need to define the length
        
        String[] groceryList = new String[howmany];


        for(int i=0;i<groceryList.length;i++){
            System.out.println("Add an item:");
            groceryList[i]=ui.nextLine();
        }
        printHorizontalArray(groceryList);
    }
    private static void printArray(String[] arr){
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
