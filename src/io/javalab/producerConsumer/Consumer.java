package io.javalab.producerConsumer;

import java.util.Queue;

public class Consumer implements Runnable{

    public Queue<Object> sharedQueue;
    public int maxSize;

    public Consumer(Queue<Object> sharedQueue, int maxSize) {
        this.sharedQueue = sharedQueue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true){
            synchronized (sharedQueue){
                while(sharedQueue.isEmpty()){
                    try {
                        System.out.println("Container is Empty!!,please wait until object picked!!");
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
                Object o=sharedQueue.poll();
                System.out.println("Object pulled from container::"+o+" by "+Thread.currentThread().getName());
                sharedQueue.notify();
            }
        }

    }
}
