package concurrent_assignment1.C;



import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Modify class concurrent_assignment1.B.TPrintID so that it is created implementing Runnable 
 * (call the new class R_PrintID). 
 * And now the loop sleeps the thread a random time between 0 and 1.
 * 
 * @author Pedro Navarro, Manuel Quintanilla, Cristina Olmedilla Group C
 *
 */

public class R_PrintID extends Thread implements Runnable {
    int ID;
    
    public R_PrintID (int number){
        ID = number;
    }
    
    
    
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("ID of the Thread: "+ID);
            try {
                Thread.sleep((long)(Math.random()*1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(R_PrintID.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}