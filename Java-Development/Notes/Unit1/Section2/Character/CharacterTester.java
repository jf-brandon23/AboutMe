public class CharacterTester {

    public static void main(String[] args){
        //created an object of Character Class;
        Character c = new Character();
        Character c1 = new Character("bob");
        Character c2 = new Character("bobby",5);
        Character c3 = new Character("bobby",5,"Bosse",true);

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2.name);
        System.out.println(c3);
    }
}