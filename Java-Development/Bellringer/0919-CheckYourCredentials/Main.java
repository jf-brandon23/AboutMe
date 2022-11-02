import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Are you the Admin?:");
        Scanner ui = new Scanner(System.in);
        System.out.println("Username:");
        String username = ui.nextLine();
        System.out.println("Password:");
        String password = ui.nextLine();
        if (username.equals("admin")&&password.equals("admin")){
            System.out.println("I'm in");
        } else {
            System.out.println("Code broke");
        }
    }
}