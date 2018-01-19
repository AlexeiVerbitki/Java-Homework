package ch07_Arrays.Myself;

public class card_Myself {
    String face;
    String suit;

    public card_Myself(String face, String suit){
        this.face=face;
        this.suit= suit;
    }

    public String toString (){
        return face + " of " + suit;
    }

}
