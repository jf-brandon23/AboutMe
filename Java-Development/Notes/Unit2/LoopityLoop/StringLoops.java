public class StringLoops{
    public static void main(String[] args) {
        //Examples of Loops utilize with Strings
        //Sequence Data -> Strings, Array, List, ArrayList, LinkList
        
        //count the number of char in a String
        howMany("GIGGLING","G");

        //find and replace all \s\s with a \s
        spaceReplacer("This sentence.  has.  double spaces.  !");

        //input banana and print out bnn
        removeVowels("banana");

        //brute force a password
        passwordCrack("123456");
    }

    private static void howMany(String s, String v){
        //find and count v in s
        int count=0;

        for(int i=0;i<s.length();i++){
            //substring returns a portion of the string     s[4:7]
            //substring(i,i+1) -> means the current letter
            if(s.toUpperCase().substring(i,i+1).equals(v.toUpperCase())){
                count++;
            }
        }
        System.out.println(count);
    }


    private static void spaceReplacer(String s){

        System.out.println(s.replace("  ", " "));
    }


    private static void removeVowels(String s){
        //aeiou and sometimes y
        //make sure that sometimes or 50% of the time, it removes y

        String output="";

        if (Math.random() >= .5) {
            regex = "a|e|i|o|u|y";
        }else{
            regex = "a|e|i|o|u";
        }
        return s.replaceAll(regex, "");

        
    }

    //think about tweaking this so that you can incorporate letters....
    private static void passwordCrack(String p){
        String guess="";
        int count=0;
        while(!guess.equals(p)){
            count++;
            guess+=String.valueOf(count);
        }
        System.out.println("Found it");
        System.out.println(count);
        
    }


}