package locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Gebruiker on 29-3-2017.
 */
public class Main {

    public static void main(String args[]){
        ExecutorService executor = Executors.newFixedThreadPool(100);

        Runnable runnable = new Lock();

        for (int i = 0; i < 100; i ++){
            executor.execute(runnable);
        }

        executor.shutdown();
    }

}
