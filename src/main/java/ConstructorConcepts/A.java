package ConstructorConcepts;

import java.sql.SQLOutput;

public class A {
    int a;
    int b;
    public A(int a){
        System.out.println(a);
    }

    public A(int a,int b) {
        this.a=a;
        this.b=b;
    }

    public void add(){

        int c=a+b;
        System.out.println(c);
    }

}
