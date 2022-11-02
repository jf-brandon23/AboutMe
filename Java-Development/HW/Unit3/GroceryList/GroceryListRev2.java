import java.util.Scanner;

public class GroceryListRev2 {
    static double total = 0.0;  //ALlows variable to be accessed in other functions

    public static void main(String[] args) {
        //Build a grocery list
        Scanner ui = new Scanner(System.in);
        System.out.println("How many items?");
        int howmany = ui.nextInt();
        ui.nextInt();
        // String[] groceryList = {}; no no, the length of 0
        //define an empty array, need to define the length
        
        //TO DO LISTTTTTTTTTTTTTTTTT
        // addItem(GroceryItem item)
        // removeItem(GroceryItem item)
        // findItem() -> returns String -> "item#\titemName\titemCost"
        // totalCost() -> returns double    COMPLETE
        // modifyCost(newCost)
        // sortItemsByCost()

        GroceryItem[] groceryList = new GroceryItem[howmany];

        //iterates the number of items defined by user input.
        for(int i=0;i<groceryList.length;i++){
            System.out.println("Name:");
            String name=ui.next();
            //why use next?... Google it. If you want to learn more

            System.out.println("Cost:");
            double cost=ui.nextDouble();
            total = (double)cost+total;

            groceryList[i]=new GroceryItem(name, cost);
        }

        //Section used to put out after listing items
        printArray(groceryList);
        //most likely while loop
        
        System.out.print("Menu- (t)otalcost, (a)dditem, (r)emoveItem, (f)indItem, (m)odifyCost, (s)ortItemsByCost or (q)uit: ");
        //https://www.freecodecamp.org/news/java-scanner-nextline-call-gets-skipped-solved/
        ui.nextLine();//Clears input buffer
        String choice = ui.nextLine();
        


        if (choice.equals("t")){
            totalCost();
        } else if (choice.equals("a")){
            addItem(groceryList);

        } else if (choice.equals("r")){
            System.out.println("Remove Item");
        } else if (choice.equals("f")){
            System.out.println("Find Item");
        } else if (choice.equals("m")){
            System.out.println("Modify Cost");
        } else if (choice.equals("s")){
            System.out.println("Sort item by Cost");
        }
    }

    //FUNCTIONS

    //Allows for printing of the arrays
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
    
    //Start of Alternate Functions
    private static void totalCost(){
        System.out.printf("Total Cost:%.2f%n",total);
    }

    private static void addItem(int [] arr){
        //Redid design. Along comes better understanding
        Scanner ui = new Scanner(System.in);    //Allows for a userinput
        System.out.println("How many new items?:");
        int howmany = ui.nextInt();        

        GroceryItem[] newItemList = new GroceryItem[howmany];
        

        for (int i=0;i<newItemList.length;i++){
            //From this point it constructs the item
            System.out.println("Name:");
            String name=ui.next();
            
            System.out.println("Cost:");
            double cost=ui.nextDouble();
            total = (double)cost+total;//Changes in an instant the total
    
            newItemList[i]=new GroceryItem(name, cost);
    
            // groceryList
            // return newItemList;
            
        }

        // for (int i=0;i<groceryList.length;i++){

        // }

        int item=newItemList.length;
        int groceryList=newItemList.length;

        int combinedItem=item+groceryList;

        GroceryItem[] newGroceryList = new GroceryItem[combinedItem];


        // return newGroceryList;
    }

    private static void removeItem(){

    }

    private static void findItem(){

    }
    
    //Commented out as having newCost creates an error
    // private static void modifyCost(newCost){

    // }
    
    private static void sortItemsByCost(){

    }

}