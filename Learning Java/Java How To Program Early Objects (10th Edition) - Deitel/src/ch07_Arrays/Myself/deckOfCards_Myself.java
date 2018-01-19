package ch07_Arrays.Myself;

public class deckOfCards_Myself {
    String[] suite = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String[] face = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final int NUMBER_OF_CARDS = 52;
    int currentcard=0;
    card_Myself[] deck = new card_Myself[NUMBER_OF_CARDS];

    public deckOfCards_Myself(){
        for (int counter=0; counter < deck.length; counter++ ) {
            deck[counter] = new card_Myself(suite[counter%13], face[counter/13]);
            System.out.printf("%s\n",deck[counter].toString());
        }
    }


}
