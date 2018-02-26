package concurrent_assignment1.D;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hurry must: - Be the main thread - Create the Lazy thread. - Wait for Lazy to
 * finish. Each second it must print the message: “Aren’t you ready yet?” and
 * checks if Lazy is finished. - If Lazy isn’t finished after 5 seconds, Hurry
 * will claim “You are resting in your laurels… and I am leaving!” and
 * interrupts Lazy. Then it waits for Lazy to finish. - However, if Lazy
 * finishes before the 5 seconds deadline, Hurry says “At last, a turtle runs
 * rings round you!”.
 *
 * @author yournamehere
 *
 */

public class Hurry {

    public static void main(String args[]) {

        Lazy lazyThread = new Lazy();
        lazyThread.start();

        for (int i = 0; i < 5 && lazyThread.isAlive(); i++) {

            System.out.println("Aren't you ready yet?");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hurry.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (lazyThread.isAlive()) {
            System.out.println("You are resting in your laurels... and I am leaving!");
            lazyThread.interrupt();
        } else {
            System.out.println("At last, a turtle runs rings round you!");
        }

        try {
            lazyThread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hurry.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Finished");
    }
}
