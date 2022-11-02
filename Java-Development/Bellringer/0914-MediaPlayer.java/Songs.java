import java.util.Scanner;

public class Songs {
    
    String name,artist;

    public Songs(String name, String artist){
        this.name = name;
        this.artist = artist;

    }

    @Override
    public String toString() {
        return this.name+"\t"+this.artist;
    }


}

