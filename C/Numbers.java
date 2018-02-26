package concurrent_assignment1.C;

/**
 * Create class Numbers which instantiates 5 R_PrintID objects (with ID 1 to 5) and runs them.
 * 
 * 
 * @author Pedro Navarro, Manuel Quintanilla, Cristina Olmedilla Group C
 *
 */
public class Numbers {

    public static void main(String args[]) {

        //Create 5 objects of the class T_PrintID
        R_PrintID thread1 = new R_PrintID(1);
        R_PrintID thread2 = new R_PrintID(2);
        R_PrintID thread3 = new R_PrintID(3);
        R_PrintID thread4 = new R_PrintID(4);
        R_PrintID thread5 = new R_PrintID(5);

        //We initiate each Thread in a concurrent way
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
