package waitAndNotify;

import java.util.Scanner;

/**
 * Created by Gebruiker on 29-3-2017.
 */
public class Worker implements Runnable{

    private int counter = 0;

    public void produce() throws InterruptedException{
        synchronized (this) {
            System.out.println("producer thread is running....");

            for (int i =0; i <= 5;i++){
                System.out.println(i);
                if(i == 3){
                    wait();
                }
            }

            System.out.println("resumed");
        }
    }


    public void consume() throws InterruptedException{
        Thread.sleep(2000); // dit is om er zeker van te zijn dat de producer methode als eerste start
        Scanner scanner = new Scanner(System.in);

        synchronized (this){
            System.out.println("waiting for input");
            scanner.nextLine();
            System.out.println("key pressed");
            notify();
    }
    }

    @Override

    public synchronized void run() {


    }
}
