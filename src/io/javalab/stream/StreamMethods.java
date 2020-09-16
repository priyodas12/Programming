package io.javalab.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamMethods {

    public static void main(String[] args) {
        boolean flag=IntStream.range(0,101).anyMatch(i->i>20);
        System.out.println(flag);

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8);

        int addedNumbers= numbers
                .stream()
                .parallel()
                //here identity=0;is not initial value;for addition its 0,for multiplication=1;initial value should be  added **
                .reduce(0,(total,e)->add(total,e));
        System.out.println(addedNumbers);
    }

    private static Integer add(Integer total, Integer e) {
        System.out.println(Thread.currentThread().getName()+" adding "+total+" and "+e);
        return total+e;
    }
}
