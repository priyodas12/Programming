package io.javalab.producerConsumer;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicOperation {


    public static void main(String[] args) throws InterruptedException {

        Counter c=new Counter();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        t1.start();
        t2.start();
        t2.join();
        t1.join();
        System.out.println(c.count);
    }
}

class Counter implements Runnable{

    //AtomicInteger atomicInteger;
    int count;

    public Counter() {
        //atomicInteger = new AtomicInteger();
    }

    @Override
    public void run() {
       IntStream.range(0,10000).forEach(i-> count++);
    }
}
