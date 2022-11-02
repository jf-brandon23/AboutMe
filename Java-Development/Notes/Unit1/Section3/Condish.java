public class Condish {
    public static void main(String[] args){
        //conditional statements - booleans
        //boolean = True or False
        //boolean operators = AND & OR
        //python: True False => true false  Capital letters typically mean a class
        /*
            if (boolean expression){
                do statement
            }
            else if (boolean expression){
                do statement
            }
            else{
                do statement
            }


            if (boolean expression)
                do one line statement

            switch(case):
                case __:
                    do statement
                    break;
        */
        int a=4;
        int b=4;
        int c=4;
        if(a==b){
            System.out.println("They're the same");
        }
        else if(a==b && b == c){        //this should go first
            System.out.println("a is equal to c")
        }
        else if(a == b || b == c){
            System.out.println("Either a is equal to b or b is equal to c");
        }
        else if(a!=b){
            System.out.println("a is NOT equal to b");
        }
        else{
            System.out.println("Nothing is equal to each other");
        }

        //          String conditional
        String name = "bob";
        String name1 = "bobby";

        if(name==name1){
            System.out.println("They're the same name");
        }
        else{
            System.out.println("They're not the same name");
        }




        

    }
}
