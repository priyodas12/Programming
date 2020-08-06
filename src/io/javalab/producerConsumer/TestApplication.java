package io.javalab.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestApplication {
    public static void main(String[] args) {
        Queue<Object> sharedQueue=new LinkedList<>();
        Producer p=new Producer(sharedQueue,10);
        Consumer c=new Consumer(sharedQueue,10);

        Thread tProducer=new Thread(p);
        Thread tConsumer=new Thread(c);

        tProducer.setName("Producer Thread");
        tConsumer.setName("Consumer Thread");

        tProducer.start();
        tConsumer.start();
    }
}
