package io.javalab.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamImpl {

    public static int transform(int i){
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8);

        System.out.println("Available cores/processors::"+Runtime.getRuntime().availableProcessors());

        //fork-join pool will be used.
        numbers.parallelStream()
                //.parallel()
                .map(i->transform(i))
                .forEachOrdered(i->{
                    System.out.println(i);
                });
    }
}
