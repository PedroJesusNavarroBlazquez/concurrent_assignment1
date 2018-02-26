package concurrent_assignment1.A;

/**
 * Get the reference of the main thread
 */
public class Reference {

    public static void main(String args[]) throws InterruptedException {
        Thread t = Thread.currentThread();
        System.out.println(" Name of the threat --> " + t.getName());
        for (int i = 0; i < 50; i++) {
            t.setName("Threat new name " + (i + 1));
            System.out.println("Odd number: " + (1 + 2 * i) + " Name of the threat --> " + t.getName());
            Thread.sleep(2000);
        }
    }
}
