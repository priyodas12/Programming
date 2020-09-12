package io.javalab.oops;

public class OverridingRuleThree {
}

class A{
    public final void  m1(){
        System.out.println("Final implementation in Parent class!!");
    }

    public void m2(){
        System.out.println("non-final parent implementation!!");
    }
}

class B extends A{
    //final method cant be under scope of child implementation.


    @Override
    public final void m2() {
        System.out.println("final child implementation!!");
    }
}

