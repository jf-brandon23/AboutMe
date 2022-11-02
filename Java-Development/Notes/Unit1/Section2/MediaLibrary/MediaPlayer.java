public class MediaPlayer {

    public static void main(String[] args) {
        // Songs s = new Songs("Take Five","Brubeck");
        // System.out.println(s);

        // Songs sn = new Songs();
        // System.out.println(sn);

        // //System.out.println(sn.name); not good habit
        // System.out.println(sn.getName());
        // System.out.println(sn.getArtist());

        // sn.setArtist("Spencer");
        // sn.setName("Umbrella ella ella");
        // System.out.println(sn);

        // sn.setArtist("Adam");
        // System.out.println(sn);

        // sn.setRating(5);
        // System.out.println(sn.rating);

        Songs s = new Songs("cBatt","hudson hawk");
        Songs s1 = new Songs("CBatt","hudson hawk");


        if(s.getName() == (s1.getName())){
            System.out.println("They're the same name");
        }
        else{
            System.out.println("They're not the same name");
        }
    }
}