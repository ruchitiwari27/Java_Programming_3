package Polymorphism;

public class Method_overloading {
    static int m1(int a, int b)//static is directle belongs to class so we don't need to create object
    {
        System.out.println("method 1");
        return a+b;
    }
    static int  m1(int a,int b,int c)
    {
        System.out.println("this is the method 2");
        return a+b+c;
    }
    public static void main(String []args){
        System.out.println( Method_overloading.m1(2,2));
        System.out.println( Method_overloading.m1(2,2,4));


    }
}