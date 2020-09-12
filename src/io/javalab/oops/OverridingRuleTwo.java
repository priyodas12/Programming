package io.javalab.oops;
/*
* private method will not come under overriding scope as private method is only visible in particular class
*
* */

public class OverridingRuleTwo {
    public static void main(String[] args) {
        M m=new M();
        S s=new S();

        M m1=new S();
        //cant be called outside class scope
    }
}

class M{
   private void m1(){
       System.out.println("Private method in parent class!");
   }
}
class S extends M{
    public void m1(){
        System.out.println("Private method in child class!");
    }
}
