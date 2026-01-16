 package Abstraction;
 abstract class Shape {
    abstract void color();
    abstract int area();

}
class Triangle extends Shape {
    @Override
    void color() {
        System.out.println("Color of triangle is :RED");

    }

    @Override
    int area() {
        // System.out.println("Area of a triangle is:"+ "return 180");
        return 180;
    }
}
class Circle extends Shape{
    int r=4;
    @Override void color(){
        System.out.println("Color of circle is:Black");
    }

    @Override int area(){
        System.out.print("Area of circle is:");
        return (21/7) *r*r;
    }
}
class FinalDecision{
    public static void main(String[]args){
        Triangle s1=new Triangle();
        s1.color();
        //  s1.formula();
        System.out.println(s1.area());
        Circle s2=new Circle();
        s2.color();
        System.out.println( s2.area());


    }
}