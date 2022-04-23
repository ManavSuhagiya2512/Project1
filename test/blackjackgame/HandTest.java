/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package blackjackgame;

import static blackjackgame.Value.King;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manav
 */
public class HandTest {
    
    

    /**
     * Test of HandGenerator method, of class Hand.
     */
    @Test
    public void testHandGenerator() {
        System.out.println("HandGenerator");
        Hand instance = new Hand();
        instance.HandGenerator();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class Hand.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Hand instance = new Hand();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Hand.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Hand instance = new Hand();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


      /**
     * Test of addCard method, of class Hand.
     */
    @Test
    public void testAddCardGood() {
        System.out.println("addCard");
        Card addCard = null;
        Hand instance = new Hand();
        instance.addCard(addCard);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
//    /**
//     * 
//     */
//      @Test
//    public void testAddCardBad() {
//        System.out.println("addCard");
//        Card addCard = King;
//        Hand instance = new Hand();
//        instance.addCard(addCard);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    

    /**
     * Test of HandSize method, of class Hand.
     */
    @Test
    public void testHandSize(){
        System.out.println("HandSize");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.HandSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of CardValue method, of class Hand.
     */
    @Test
    public void testCardValue() {
        System.out.println("CardValue");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.CardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
