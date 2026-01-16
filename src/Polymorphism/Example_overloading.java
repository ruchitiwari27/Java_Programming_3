package Polymorphism;

//public class Overloading {
 public class Example_overloading {

    int add(int a, int b)
    {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Example_overloading  c = new Example_overloading ();

        System.out.println(c.add(2, 3));        // calls add(int,int)
        System.out.println(c.add(2, 3, 4));     // calls add(int,int,int)
        System.out.println(c.add(2.5, 3.5));    // calls add(double,double)
    }
}
