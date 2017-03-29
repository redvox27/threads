package creatingThreads;

/**
 * Created by Gebruiker on 29-3-2017.
 */
public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new PrintStatement());

        thread.start();
    }

}
