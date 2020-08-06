package io.javalab.producerConsumer;

public class DeadLock {

    public static void main(String[] args) {
        String one="abcd";
        String two="efgh";

        Runnable r1=()->{
            synchronized (one) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                one.chars()
                        .mapToObj(i -> (char) i)
                        .forEach(i ->
                        {
                            System.out.println(Thread.currentThread().getName() + " prints " + i);
                        });
                synchronized (two) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    two.chars()
                            .mapToObj(i -> (char) i)
                            .forEach(i ->
                            {
                                System.out.println(Thread.currentThread().getName() + " prints " + i);
                            });
                }
            }
        };
        Runnable r2=()->{
            synchronized (two){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                one.chars()
                        .mapToObj(i->(char)i)
                        .forEach(i->
                        {
                            System.out.println(Thread.currentThread().getName()+" prints "+i);
                        });
                synchronized (one){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    two.chars()
                            .mapToObj(i->(char)i)
                            .forEach(i->
                            {
                                System.out.println(Thread.currentThread().getName()+" prints "+i);
                            });
                }
            }
        };

        Thread t1=new Thread(r1, "ThreadOne");
        Thread t2=new Thread(r2,"ThreadTwo");

        t1.start();
        t2.start();
    }
}
