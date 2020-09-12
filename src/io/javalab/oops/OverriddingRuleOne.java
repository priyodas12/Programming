package io.javalab.oops;

/*Rules:
* method signature should be same
* co-variant return type is allowed.(child class lower level return type is allowed.)
*/

public class OverriddingRuleOne {
    public static void main(String[] args) {
        P p=new P();
        C c=new C();
        P p1=new C();

        p.m1(100);
        System.out.println(c.m1(100));
        System.out.println(p1.m1(200));
    }
}

class P{
    int i=20;

    public Object m1(int i){
        System.out.println("Parent Implementation! with "+i*this.i);
        return  null;
    }
}

class C extends P {

    int i=10;

    @Override
    public String m1(int i) {
       return new String("Child Implementation! with "+i*this.i);
    }
}
