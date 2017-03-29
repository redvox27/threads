package Synchronization;

/**
 * Created by Gebruiker on 29-3-2017.
 */
public class Increment implements Runnable{

    private  int inc = 0;

    private  void increment(){
        System.out.println(inc);
        inc ++;
    }

    @Override
    public synchronized void run() {
       increment();
    }
}
