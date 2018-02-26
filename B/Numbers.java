package concurrent_assignment1.B;

/**
 * Create class Numbers which instantiates 5 T_PrintID objects (with ID 1 to 5)
 * and runs them. Can you detect some problem? Can you explain the reason?
 * 
 * We can observe that because this is concurrent, we cannot assure the orden
 * in which the threads are displayed. There is not any indication for them to 
 * follow any order, so we can say it is a ramdom process
 *
 * @author Pedro Navarro, Manuel Quintanilla, Cristina Olmedilla Group C
 *
 */
public class Numbers {

    public static void main(String args[]) {

        //Create 5 objects of the class T_PrintID
        T_PrintID thread1 = new T_PrintID(1);
        T_PrintID thread2 = new T_PrintID(2);
        T_PrintID thread3 = new T_PrintID(3);
        T_PrintID thread4 = new T_PrintID(4);
        T_PrintID thread5 = new T_PrintID(5);

        //We initiate each Thread in a concurrent way
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
