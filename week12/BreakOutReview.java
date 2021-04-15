/**
 * ==========  What's left to do this semester  ==========
 * Saturday (Apr 17th) Banking App due
 * Saturday (Apr 17th) Go Fish App due
 * Sunday (Apr 18th) Lab0407 due and you've been working on it for 11 days
 * Monday (Apr 26th) is the last day of class
 * Thursday (Apr 29th 8-10am) is the final exam
 * =======================================================
 * 
 * Last class (Apr 12th), Dr. Lang discussed his Go Fish assignment
 * Today, we'll practice functions, arrays, and ArrayLists by solving parts of Go Fish.
 */ 

import java.util.ArrayList;
import java.util.Collections;


public class BreakOutReview {
    public static void main(String[] args) {

        System.out.println("\n\n==========  Go Fish!  ==========\n\n");


        // TODO 1 - Create a deck of 52 cards.  The deck is made of boolean values with true
        // meaning the card was played and false meaning the card is still in the deck.       
        boolean[] deck = deckOfCards(52); //new boolean[52];

        // TODO 2 - Given a deck, how many cards were played so no longer in the deck?
        int played = cardsPlayed(deck);
        // TODO 3 - Given a deck, how many cards were not played so still in the deck?
        int notPlayed = cardsNotPlayed(deck);

        // Every card has a rank:  Ace, 2, 3, ..., 10, Jack, Queen, King.
        // Every card has a suit:  Clubs, Diamonds, Hearts, Spades.
        // (Notice this is 52 cards because each of the 13 ranks has 4 suits, so 13 * 4.)
        //
        // Although these two values could be used to represent a card, Dr. Lang is requiring you
        // use a single integer.  How?
        //
        // Card 0 is Ace of Clubs
        // Card 1 is 2 of Clubs
        // ...
        // Card 9 is 10 of Clubs
        // Card 10 is Jack of Clubs
        // Card 11 is Queen of Clubs
        // Card 12 is King of Clubs

        // TODO 4 - Just for Clubs, given an integer, output that card number's "rank of suit".
        int cardNum = 41;
        String card = cardNumberToCard(cardNum);
        System.out.printf("\nCard %d is %s\n",cardNum,card);

        // Card 13 is Ace of Diamonds
        // ...
        // What is the King of Diamonds card number?
        //
        // What is the Ace of Hearts card number?
        // What is the King of Hearts card number?
        //
        // What is the Ace of Spades card number?
        // What is the King of Spades card number?

        // TODO 5 - Given any card number, output that card number's "rank of suit".


        // TODO 6 - Given any "rank of suit", what is that card number?


        // TODO 7 - Randomly generate an ArrayList of 5 integers in the range 0..51, a hand.


        // TODO 8 - Sort the hand.
        

        // TODO 9 - Does the hand have any duplicate cards?


        // TODO 10 - Deal and sort another hand.

        // TODO 11 - Do the two hands have any of the same cards?


        // TODO 12 - Does a hand have the Ace of Spade card?
        // TODO 13 - Does a hand have any Aces?
        // TODO 14 - Does a hand have any {suit}?
        // TODO 15 - How many of any {rank} is in the hand?
        // TODO 16 - What are the indexes of {rank} in a hand?


        // TODO 17 - Get rid of the second card in hand1.



        // TODO 18 - Get rid of any Aces in the hand.
        // Careful that you don't throw a ConcurrentAccessException!
        // Don't change the list that we're iterating over.



        // TODO 19 - Give hand1's index i card to hand2.


        // TODO 20 - Does a hand have a book?
  
    }
    static String cardNumberToCard(int cardNum){
        String card = "Not a valid card number for suit";
        String[] suits = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "Ten", "Jack", "Queen", "King"};
        int suit = cardNum / ranks.length;
        int rank = cardNum % ranks.length;
        card = ranks[rank] +" of "+ suits[suit];
//         if( cardNum>=0 && cardNum<=12 ){
//           // Card 0 is Ace of Clubs
//           card = ranks[cardNum] +" "+ suits[0];
//         }else if(cardNum>=13 && cardNum<=25){
//            cardNum = cardNum % ranks.length;
//            card = ranks[cardNum] +" "+ suits[1];
//         }else if(cardNum>=26 && cardNum<=37){
//            cardNum = cardNum % ranks.length;
//            card = ranks[cardNum] +" "+ suits[2];
//         }else if(cardNum>38 && cardNum<=51){
//            cardNum = cardNum % ranks.length;
//            card = ranks[cardNum] +" "+ suits[3];
//         }
        return card;
    }
    
    static boolean[] deckOfCards(int size){
        boolean[] deck = new boolean[size];
        for(int i=0; i<deck.length; i++){
            deck[i] = false;
        }
        return deck;
    }
    
    static int cardsPlayed(boolean[] deck){
        int result = 0;
        for(int i = 0 ; i<deck.length; i++){
            if(deck[i]){//deck[i]== true
                result++;
            }
        }
        return result;
    }
    
    static int cardsNotPlayed(boolean[] deck){
       return deck.length - cardsPlayed(deck);
    }

}