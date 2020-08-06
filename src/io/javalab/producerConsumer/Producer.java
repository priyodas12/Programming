package io.javalab.producerConsumer;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {

    public Queue<Object> sharedQueue;
    public int maxSize;

    public Producer(Queue<Object> sharedQueue, int maxSize) {
        this.sharedQueue = sharedQueue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true){
            synchronized (sharedQueue){
                while(sharedQueue.size()==maxSize){
                    try {
                        System.out.println("Container is Full!!,please wait until object picked!!");
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Object o=new Random().nextLong();
                sharedQueue.add(o);
                System.out.println("Object pushed to container::"+o+" by "+Thread.currentThread().getName());
                sharedQueue.notify();
            }
        }
    }
}
