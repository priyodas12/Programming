package io.javalab.oops;

public class OverloadingImpl {

    void m1(int i){
        System.out.println("Int");
    }
    void m1(float i){
        System.out.println("float");
    }
    /*void m1(double i){
        System.out.println("double");
    }*/
    void m1(int... i){
        System.out.println("var -arg");
    }

    public static void main(String[] args) {

        OverloadingImpl oi=new OverloadingImpl();
        oi.m1();
        oi.m1(12,67);
        oi.m1(1 );
        oi.m1('a');
        oi.m1(10L);
        //oi.m1(10.5);//CE

    }
}
