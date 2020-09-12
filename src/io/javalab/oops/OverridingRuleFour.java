package io.javalab.oops;
/* abstract(P) to abstract(C) possible
*  abstract(C) to abstract(P) possible
* */
public class OverridingRuleFour {
    public static void main(String[] args) {


    }
}

abstract class D{
   public abstract void m1();

   public void m2(){
       System.out.println("parent implementation of abstract class!!");
   }
}

abstract class E extends D{

    @Override
    public void m1() {
        System.out.println("child implementation of abstract class!!");
    }

    @Override
    public abstract void m2();
}
