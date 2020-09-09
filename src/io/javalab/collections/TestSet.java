package io.javalab.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {

        LinkedHashSet<Student> hs=new LinkedHashSet<>();

        Student s1=new Student(1,"abc");
        Student s2=new Student(1,"abc");

        hs.add(s1);
        hs.add(s2);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()+","+s2.hashCode());

        System.out.println(hs.size());


        HashMap<Student,Integer> hm=new HashMap<>();

        hm.put(s1,1);
        hm.put(s2,1);

        System.out.println(hm.size());
    }
}
