import java.util.Scanner;
import java.util.Random;

public class RPS {        

    static void pvp() {
            //user1 inputs r,p,s
            System.out.println("Options:r,p,s");
            System.out.println("Player one goes");
            Scanner ui1 = new Scanner(System.in);
            String turn1 = ui1.nextLine();  //The variable that allows to take in the user input
            //user2 inputs r,p,s
            System.out.println("Player two goes");
            Scanner ui2 = new Scanner(System.in);
            String turn2 = ui2.nextLine();

            String rock = new String("r");
            String paper = new String("p");
            String scissors = new String("s");

            // r beats s
            // p beats r
            // s beats p

            //Java is kinda odd with the .equals method
            //r beats p For some reason the code does not recognize the input r equal to string r when using "=="
            //((turn1==rock&&turn2==scissors)||(turn2==rock&&turn1==scissors))

            if (turn1.equals(turn2)){
                System.out.println("This is thou a Tie.");
            }
            else if ((turn1.equals(rock)&&turn2.equals(scissors))||(turn2.equals(rock)&&turn1.equals(scissors))){
                System.out.println("Rock beats Scissors");
            }
            else if ((turn1.equals(rock)&&turn2.equals(paper))||(turn2.equals(rock)&&turn1.equals(paper))){
                System.out.println("Paper beats Rock");
            }
            //p beats r
            else if ((turn1.equals(scissors)&&turn2.equals(paper))||(turn2.equals(scissors)&&turn1.equals(paper))){
                System.out.println("Scissors beats Paper");
            }
            //Scissors beats p
            else {
                System.out.println("Code failed");
            }
            //who won?
    }

    static void pvc() {
        //Used to make random choice for computer.
        //https://grabthiscode.com/java/random-choice-in-java
        java.util.Random random = new java.util.Random();
        //Random random = new Random();
        Scanner ui = new Scanner(System.in);
        String[] choices = {"r","p","s"};   //list starts at 0 then goes on, 0,1,2
        System.out.println("Commences the Final battle.");
        System.out.println("One shall stand on shall fall.");
        System.out.println("Options:r,p,s");
        System.out.println("Human Input: ");
        String human = ui.nextLine();
        int computer = random.nextInt(choices.length);
        //This was used to learn about conversion from integer to string.
        //https://www.javatpoint.com/java-int-to-string
        String computer2 = Integer.toString(computer);  //converts the int to a string appearing as a number.

        //This converts the computer2 string to show a choice so the user knows which choice computer chose.
        System.out.println("Computer's turn: ");
        if (computer==0) {
            System.out.println("Rock");
        } else if (computer==1) {
            System.out.println("Paper");
        } else if (computer==2) {
            System.out.println("Scissors");
        }

        //Each option takes in the input with a conditional if chosen r,p,s.
        //A string is then coded to a string number to be the same as the list for computer's choices.
        //Then a conditional checks if the string number is equivalent to the position of computer choice list.
        //The conditional first checks if it is a tie, then checked a number above the string number
        //If the string number is not equivalent to the first condition of not a tie then the last possiblity is printed out.
        if (human.equals("r")){
            String rock = "0";
            if (rock.equals(computer2)) {
                System.out.println("This is thou a Tie.");    
            }
            else if (computer2.equals("1")) {
                System.out.println("Paper beats Rock");    
            }
            else {
                System.out.println("Rock beats Scissors");    
            }
        } else if (human.equals("p")){
            String paper = "1";
            if (paper.equals(computer2)) {
                System.out.println("This is thou a Tie.");    
            }
            else if (computer2.equals("2")) {
                System.out.println("Scissors beats Paper"); 
            }
            else {
                System.out.println("Paper beats Rock");  
            }
        } else if (human.equals("s")){
            String scissors = "2";
            if (scissors.equals(computer2)) {
                System.out.println("This is thou a Tie.");    
            }
            else if (computer2.equals("0")) {
                System.out.println("Rock beats Scissors"); 
            }
            else {
                System.out.println("Scissors beats Paper");
            }
        }

        /*
        if (human.equals(computer[choices])){
            System.out.println("This is thou a Tie.");
        }
        else if ((human.equals(rock)&&computer[choices].equals(scissors))||(computer[choices].equals(rock)&&human.equals(scissors))){
            System.out.println("Rock beats Scissors");
        }
        else if ((human.equals(rock)&&computer[choices].equals(paper))||(computer[choices].equals(rock)&&human.equals(paper))){
            System.out.println("Paper beats Rock");
        }
        //p beats r
        else if ((human.equals(scissors)&&computer[choices].equals(paper))||(computer[choices].equals(scissors)&&human.equals(paper))){
            System.out.println("Scissors beats Paper");
        }
        //Scissors beats p
        else {
            System.out.println("Code failed");
        }*/
    }
    
    static void menu() {
        Scanner menu = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Would you like PVP or PVC");
        System.out.println("PVP = Player vs. Player");//This defines what each mode is incase the user doesn't know difference.
        System.out.println("PVC = Player vs. Computer");
        String choice = menu.nextLine();
        //This is the choice the user makes, deciding which gamemode they want to choose.
        if (choice.equals("PVP")||choice.equals("pvp")){    
            pvp();//This invokes the method for pvp
        } else if (choice.equals("PVC")||choice.equals("pvc")){
            pvc();//This invokes the method for pvc
        }
    }

    public static void main(String[] args){
        menu();//This runs the game with the game mode choice. 
    }

    
    
/*  
    //This is commented incase of needing to back to the drawing board.
    public static void main(String[] args){
    Random rand = new Random();

    static void pvp() {
        //user1 inputs r,p,s
        System.out.println("Options:r,p,s"); 
        System.out.println("Player one goes");
        Scanner ui1 = new Scanner(System.in);
        String turn1 = ui1.nextLine();  //The variable that allows to take in the user input
        //user2 inputs r,p,s
        System.out.println("Player two goes");
        Scanner ui2 = new Scanner(System.in);
        String turn2 = ui2.nextLine();
        String rock = new String("r");
        String paper = new String("p");
        String scissors = new String("s");
        // r beats s
        // p beats r
        // s beats p
        //Java is kinda odd with the .equals method
        //r beats p For some reason the code does not recognize the input r equal to string r when using "=="
        //((turn1==rock&&turn2==scissors)||(turn2==rock&&turn1==scissors))
        if (turn1.equals(turn2)){
            System.out.println("This is thou a Tie.");
        }
        else if ((turn1.equals(rock)&&turn2.equals(scissors))||(turn2.equals(rock)&&turn1.equals(scissors))){
            System.out.println("Rock beats Scissors");
        }
        else if ((turn1.equals(rock)&&turn2.equals(paper))||(turn2.equals(rock)&&turn1.equals(paper))){
            System.out.println("Paper beats Rock");
        }
        //p beats r
        else if ((turn1.equals(scissors)&&turn2.equals(paper))||(turn2.equals(scissors)&&turn1.equals(paper))){
            System.out.println("Scissors beats Paper");
        }
        //Scissors beats p
        else {
            System.out.println("Code failed");
        }
        //who won?
    }

    static void menu() {
        Scanner menu = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Would you like PVP or PVC");
        System.out.println("PVP = Player vs.Player");
        System.out.println("PVC = Player vs. Computer");
        if (menu.equals("PVP")){
            pvp();
        } else if (menu.equals("PVC")){
            pvc();
        }
    }
    menu();   
    }
    */

}
