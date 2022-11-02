//we don't see this, but java extends the Object Class
//      we inherit some basic methods
public class Character {
    //1. any and all global variables
    String name;
    int age;
    String school;
    boolean drive;

    //2. any and all constructors
    //Professionally it has to match the file name
    public Character(){}        //no-arg constructor

    public Character(String n){
        //this,Characteristic is a global var
        // = var is the one passed in
        this.name=n;
    }

    //doesn't like because you already have a Character(String) signature
    // public Character(String s){
    //     //this,Characteristic is a global var
    //     // = var is the one passed in
    //     this.school=s;
    // }

    //keep the order the same as you define them above
    public Character(String n, int a){
        this.name = n;
        this.age = a;
    }

    //keep the order the same as you define them above
    public Character(String n,String s,int a, boolean d){
        this.name = n;
        this.age = a;
        this.school = s;
        this.drive = d;
    }

    //keep the order the same as you define them above
    public Character(String n,int a,String s, boolean d){
        this.name = n;
        this.age = a;
        this.school = s;
        this.drive = d;
    }

    //def __init__(self,n);
    //      self.name=n

    //3. any and all methods

    //  def__str__(self):
    //      return ""
    @Override                   //decorator
    public String toString(){
        return this.name;
        
    }

}


    /*
        Attributes = nouns and adjective and characteristics
        Health
        Armor
        Skin
        Food
        Hunger
        Inventory
        Experience
    */

    /*
        methods = verbs
            walk
            sprint
            crouch
            build
            swim
            attack (mine)
    */

/*          2k basketball
    attributes:
        height, weight, arm length, shoulder width, skin
        stats
    
    methods:
        shoot, dribble, running, pass, watch ads
        shoot 3 point
        shoot alley oop
        shoot dunk
        shoot freethrow
*/

/*      Ubisoft - character
        Insomniac - character
        Call of Duty Activision - character
        Call of Duty Bethesda - character
*/
