/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgame;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author manav
 */
public class Hand {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void HandGenerator() {
        for (Suit cardSuit : Suit.values()) {
            for (Value cardValue : Value.values()) {
                this.cards.add(new Card(cardSuit, cardValue));
            }
        }

    }
    public void shuffle(){
        ArrayList<Card> tmHand =new ArrayList<Card>();
        
        Random randomCard = new Random();
        int RandomCardIndex=0;
        int size = this.cards.size();
        for(int i=0; i<size ; i++){
            RandomCardIndex=randomCard.nextInt((this.cards.size()-1-0)+1)+0;
            tmHand.add(this.cards.get(RandomCardIndex));
            this.cards.remove(RandomCardIndex);
        }
        this.cards=tmHand;
    }
    
    public String toString() {
        String cardList = "";
        int i = 0;
        for (Card aCard : this.cards) {
            cardList += "\n" + i + ":" + aCard.toString();
            i++;
        }
      return cardList;
    }
    public void removeCard(int i){
        this.cards.remove(i);
    }
    public Card getCard(int i){
        return this.cards.get(i);
    }
    public void addCard(Card addCard){
        this.cards.add(addCard);
    }
    
    public void drag(Hand from){
        this.cards.add(from.getCard(0));
        from.removeCard(0);
    }
    public int HandSize(){
        return this.cards.size();
    }
    public int CardValue(){
        int Total=0;
        int ace=0;
        
        for(Card aCard : this.cards)
        {
            switch(aCard.getValue()){
                case Two: Total += 2;
                break;
                case Three: Total += 3;
                break;
                case Four: Total += 4;
                break;
                case Five: Total += 5;
                break;
                case Six: Total += 6;
                break;
                case Seven: Total += 7;
                break;
                case Eight: Total += 8;
                break;
                case Nine: Total += 9;
                break;
                case Ten: Total += 10;
                break;
                case Jack: Total += 10;
                break;
                case Queen: Total += 10;
                break;
                case King: Total += 10;
                break;
                case Ace: ace += 1;
                break;
            
            }
        }
        for(int i=0; i < ace; i++){
            if(Total > 10){
                Total += 1;
            }
            else{
                Total += 11;
            }
        }
        return Total;
    }

}
