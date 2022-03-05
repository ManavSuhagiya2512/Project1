/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjackgame;

import java.util.Scanner;

/**
 *
 * @author manav
 */
public class BlackJackGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome To the BlackJack Game");

        Hand hand = new Hand();//Creating variable of Datatype Hand
        hand.HandGenerator();// Generating Hand
        hand.shuffle();// Shuffle Method

        Hand PlayerHand = new Hand();// Player Hand
        Hand DealerHand = new Hand();// Dealer Hand

        Scanner sc = new Scanner(System.in);
        String PlayAgain = "y";

        while (PlayAgain == "y") {

            boolean play = false;

            PlayerHand.drag(hand);// Calling PlayerHand Two times Because we need two hands
            PlayerHand.drag(hand);

            DealerHand.drag(hand);
            DealerHand.drag(hand);

            while (true) {
                System.out.println("Your Hand:");
                System.out.println(PlayerHand.toString());// Player's Hand Display
                System.out.println("Total Value of PlayerHand" + PlayerHand.CardValue());

                System.out.println("Dealer Hand:");
                System.out.println(DealerHand.toString());// Dealer's Hand Display
                System.out.println("Total Value of DealerHand:" + DealerHand.CardValue());

                System.out.println("Would you like to 1(Hit) or 2(Stand)");
                int response = sc.nextInt();

                if (response == 1) {// conditions
                    PlayerHand.drag(hand);
                    System.out.println("You drag a:" + PlayerHand.getCard(PlayerHand.HandSize() - 1).toString());
                    if (PlayerHand.CardValue() > 21) {
                        System.out.println("You are Busted" + PlayerHand.CardValue());
                        play = true;
                        break;
                    }
                }
                if (response == 2) {
                    break;
                }

            }
            if ((DealerHand.CardValue() > PlayerHand.CardValue() && play == false)) {
                System.out.println("Dealer Wins");
                play = true;
            }
            while ((DealerHand.CardValue() < 17) && play == false) {
                DealerHand.drag(hand);
                System.out.println("Dealer Drags " + DealerHand.getCard(DealerHand.HandSize() - 1).toString());

            }
            System.out.println("Dealer's Hand Value is:" + DealerHand.CardValue());

            if ((DealerHand.CardValue() > 21) && play == false) {// Conditions
                System.out.println("You win!");
                play = true;
            }
            if ((PlayerHand.CardValue() == DealerHand.CardValue()) && play == false) {// Conditions
                System.out.println("Push");
                play = true;
            }

            System.out.println("Do you want to play again?(y And n)");
            PlayAgain = sc.next();
            if (PlayAgain == "n") {
                System.out.println("Game Over!");
            }

        }
    }

}
