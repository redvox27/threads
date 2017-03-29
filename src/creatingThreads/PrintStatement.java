package creatingThreads;

/**
 * Created by Gebruiker on 29-3-2017.
 */
public class PrintStatement implements Runnable{

    @Override
    public void run() {
        System.out.println("ik print dingen");
    }
}
