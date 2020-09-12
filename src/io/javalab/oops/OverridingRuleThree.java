package io.javalab.oops;

public class OverridingRuleThree {
}

class A{
    public final void  m1(){
        System.out.println("Final implementation in Parent class!!");
    }
}

class B extends A{
    //final method cant be under scope of child implementation.
}

