package locks;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Gebruiker on 29-3-2017.
 */
public class Lock implements Runnable {

    private ReentrantLock lock = new ReentrantLock();
    private int balance = 0;


    private void increment(){
        System.out.println(balance);
        balance ++;
    }

    @Override
    public void run() {
        lock.lock();

        try{
            increment();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            lock.unlock();
        }
    }
}
