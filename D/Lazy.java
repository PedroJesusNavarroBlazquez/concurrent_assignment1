package concurrent_assignment1.D;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Lazy must: - Extend Thread - Enter in a loop which iterates a random number
 * of times between 2 to 8. - Sleep 1 second - At each iteration, it displays a
 * random message among: “I am dressing up…”, “Just a sec, please…”, or “These
 * clothes do not suit me…”. - If Hurry interrupts Lazy before it is finished,
 * Lazy claims: “That’s not cricket, please play the game!”. - If Lazy finishes
 * before being interrupted, it says “I am ready, the early bird catches the
 * worm!”.
 *
 * @author Pedro Navarro, Manuel Quintanilla, Cristina Olmedilla Group C
 *
 */
public class Lazy extends Thread{

    //All the messages said by Lazy
    String[] messages = {"I am dressing up...", "Just a sec, please...", "These clothes do not suit me..."};
    
    //Random generator
    Random randomNumber;
    
    //Maximum number of iterations
    int maxIterrations;
    
    @Override
    public void run(){
        
        //Create the random generator
        randomNumber = new Random();
        
        maxIterrations = randomNumber.nextInt(8) + 2;
        
        for(int i = 0; i < maxIterrations && !Thread.currentThread().isInterrupted(); i++){
            
            System.out.println(messages[randomNumber.nextInt(3)]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                interrupt();
            }
            
        }
        
        if(!Thread.currentThread().isInterrupted()){
            System.out.println("I am ready, the early bird catches the worm!");
        }
        else{
            System.out.println("That's not cricket, please play the game!");
        }
        
    }
    
}

