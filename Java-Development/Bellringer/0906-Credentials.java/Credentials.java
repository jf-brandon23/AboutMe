import java.util.Scanner;

public class Credentials { 
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in); /*Lets the system take input */
        System.out.println("Input Username:");
        String username = ui.nextLine();
        System.out.println("Input Password:");
        String password = ui.nextLine();
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);

        System.out.printf("Username: %s\nPassword: %s",username,password);
    }
    
}