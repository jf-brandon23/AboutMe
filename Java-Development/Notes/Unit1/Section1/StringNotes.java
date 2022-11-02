public class StringNotes {
    public static void main(String[] ags) {
        //python 
        //name = "bob"
        String name = "bob";        //literal assignment
        String name2 = new String("bob");   //class assignment or constructor

        int age =0;  //i i s not capitalized
        String ages="0";

        System.out.println(name + ages);
        System.out.println(name.concat(ages));
        System.out.printf("%s %s",name,ages);

        /*
         *  main methods
         *      substring = return a section of the String
         *      indexOf  = return the index of a chr in a String
         *          fubd the first instance of the value
         *      equals() =  Strings can't use ==
         *      length() = returns the length of the string
         *      contains() = returns true or false if contains
         * 
         */

        String email = "nate.adam@bobyboom.gov";
        String email2 = "brandon.spencer@bobyboom.gov";
        System.out.println(email);
        //length of our string
        System.out.println(email.length());
        
        //print the out username
        System.out.println(email.substring(0,9));
        System.out.println(email2.substring(0,email2.indexOf("@")));

        //where is the @ sign
        System.out.println(email2.indexOf("@"));
        email2.indexOf(email2.indexOf("#"));    //returns -1 if not found

        String email3 = "caden.rome@bbobaboom.gov";
        System.out.println(email3.indexOf("e"));


        String email4 = "keenan.mason@bobyboom.gov";
        System.out.println(email3.indexOf("e"));

        String email5 = "keenan.mason@bbobaboom.gov";

        //see if email3's and email4's usernames are the same

        System.out.println(email4.substring(0,email4.indexOf("@")).equals(email5.substring(0,email5.indexOf("@"))));



        //contains
        System.out.println(email4.contains(".gov"));

        //pull their domain
        System.out.println(email4.substring(email5.indexOf("@"+1)));

        //pull their company
        System.out.println(email5.substring(email5.indexOf("@")+1,email5.indexOf(".gov")));

        double owe = 2.00;
        System.out.println("You owe me: "+Double.toString(owe));
        System.out.println("You owe me: "+String.toString(owe));
        System.out.println("You owe me: %2.2f",owe);
    }   
}
