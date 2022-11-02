import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        //manage an inventory
        //      you can add, insert, replace, clear the db
        //      quit -> ends the program
        ArrayList<String> iceCreamList = new ArrayList<String>();

        Scanner in = new Scanner(System.in);
        String input="";
        int pos = 0;

        while(!input.equals("q")){
            System.out.println(iceCreamList);
            System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace, (c)lear or (q)uit?");
            input = in.nextLine();

            if(input.equals("a")){
                System.out.println("What Flavor?: ");
                input = in.nextLine();
                iceCreamList.add(input);




            } else if (input.equals("i")) {
                System.out.println("Insert Flavor: ");
                input = in.nextLine();
                System.out.println("Enter an pos: ");
                pos=in.nextInt();
                //add(position, item)
                if(pos>0 && pos<iceCreamList.size()){
                    iceCreamList.set(pos-1, input);
                }



            } else if (input.equals("r")) {
                System.out.println("Remove Flavor: ");
                input = in.nextLine();
                iceCreamList.remove(input);


            } else if (input.equals("p")) {
                System.out.println("Enter Flavor: ");
                input = in.nextLine();
                System.out.println("Enter an pos: ");
                pos=in.nextInt();
                if(pos>0 && pos<iceCreamList.size()){
                    iceCreamList.set(pos-1,input);
                }


            } else if (input.equals("c")) {
                System.out.println("Clear Flavors: ");
                input = in.nextLine();
                if (input.equals("yes")){
                    iceCreamList.clear();
                }



            } else if (input.equals("q")) {
                System.out.println("Quit");

            }
        }
    }
}
